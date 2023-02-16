/*
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import uma.es.angular.t2a.t2A.Root

@ExtendWith(InjectionExtension)
@InjectWith(T2AInjectorProvider)
class T2AParsingTest {
	@Inject
	ParseHelper<Root> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: ?errors.join(", ")?''')
	}
}