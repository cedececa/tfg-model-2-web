/*
 * generated by Xtext 2.31.0
 */
package uma.es.angular.t2a.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class T2AAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uma/es/angular/t2a/parser/antlr/internal/InternalT2A.tokens");
	}
}
