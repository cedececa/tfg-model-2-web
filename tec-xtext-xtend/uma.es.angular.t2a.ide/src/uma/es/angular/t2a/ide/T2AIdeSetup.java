/*
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uma.es.angular.t2a.T2ARuntimeModule;
import uma.es.angular.t2a.T2AStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class T2AIdeSetup extends T2AStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new T2ARuntimeModule(), new T2AIdeModule()));
	}
	
}