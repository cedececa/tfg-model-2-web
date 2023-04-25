package execute.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;

// Ejemplo
// https://www.baeldung.com/run-shell-command-in-java

public class Main {
	public static void main(String[] args) {

		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		// TODO Auto-generated method stub
		String homeDirectory = System.getProperty("user.home");
		Process process = null;
		if (isWindows) {
			try {
				//process = Runtime.getRuntime().exec(String.format("cmd.exe /c dir %s", homeDirectory));
				process = Runtime.getRuntime().exec(String.format("cmd.exe /c npm "));
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
