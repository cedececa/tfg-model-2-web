/*
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import uma.es.angular.t2a.ui.internal.T2aActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class T2AExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(T2aActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		T2aActivator activator = T2aActivator.getInstance();
		return activator != null ? activator.getInjector(T2aActivator.UMA_ES_ANGULAR_T2A_T2A) : null;
	}

}