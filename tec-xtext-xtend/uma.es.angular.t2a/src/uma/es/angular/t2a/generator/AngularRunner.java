package uma.es.angular.t2a.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;

import org.apache.commons.io.FileUtils;

// Ejemplo
// https://www.baeldung.com/run-shell-command-in-java

public class AngularRunner {
	public static void run(String srcGenDirectoryAbsolutePath) {
		// Angular project name
		String angularProjectName = "src-pangular";

		// Angular project folder absolute path
		String angularFolderAbsolutePath = srcGenDirectoryAbsolutePath.replace("src-gen", angularProjectName);
		System.out.println(angularFolderAbsolutePath);
		File source = new File(srcGenDirectoryAbsolutePath);

		// If the directory is not exist
		File dest = new File(angularFolderAbsolutePath + "/src");
		File destApp = new File(angularFolderAbsolutePath + "/src/app");
		if (!dest.exists()) {
			generateAngularProject(angularFolderAbsolutePath.replace(angularProjectName, ""), angularProjectName);
			// directory.mkdirs();
			// If you require it to make the entire directory patxh including parents,
			// use directory.mkdirs(); here instead.
		}

		// Put generated-files in the src/app/ of the angular project
		try {
			FileUtils.deleteDirectory(destApp); // only remove angular template codes
			dest.mkdirs();
			FileUtils.copyDirectory(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void generateAngularProject(String generatingDirectory, String angularProjectName) {

		String cmd = "cmd.exe /c ng new " + angularProjectName + " --routing false --style scss --skip-install";
		// String newAngularProjectCMD = "cmd.exe /c cd "+generatingDirectory+" &&"
		// +cmd;
		System.out.println(cmd);

		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		// TODO Auto-generated method stub
		String homeDirectory = System.getProperty("user.home");
		Process process = null;
		if (isWindows) {
			try {
				// process = Runtime.getRuntime().exec(String.format("cmd.exe /c dir %s",
				// homeDirectory));
				process = Runtime.getRuntime().exec(String.format(cmd),  null, new File(generatingDirectory));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				process = Runtime.getRuntime().exec(String.format("/bin/sh -c ls %s", homeDirectory));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
		Future<?> future = Executors.newSingleThreadExecutor().submit(streamGobbler);

		int exitCode = 0;
		try {
			exitCode = process.waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assert exitCode == 0;

		try {
			future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // waits for streamGobbler to finish

	}

	private static class StreamGobbler implements Runnable {
		private InputStream inputStream;
		private Consumer<String> consumer;

		public StreamGobbler(InputStream inputStream, Consumer<String> consumer) {
			this.inputStream = inputStream;
			this.consumer = consumer;
		}

		@Override
		public void run() {
			new BufferedReader(new InputStreamReader(inputStream)).lines().forEach(consumer);
		}
	}

}
