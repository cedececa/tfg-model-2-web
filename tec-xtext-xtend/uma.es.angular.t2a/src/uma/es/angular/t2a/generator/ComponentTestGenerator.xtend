package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.Comp
import java.util.List

class ComponentTestGenerator {
	
  def static generateAllTest(IFileSystemAccess2 fsa, List<Comp> components){
  	for (component : components) {
  		ComponentTestGenerator.generateTest(fsa,component)
  	}
  }
  
  private def static generateTest(IFileSystemAccess2 fsa, Comp component) {
    val componentNameLower = component.name.toLowerCase
    val testCode = '''
      import { ComponentFixture, TestBed } from '@angular/core/testing';
      import { «component.name»Component } from './«componentNameLower».comp';

      describe('«component.name»Component', () => {
        let component: «component.name»Component;
        let fixture: ComponentFixture<«component.name»Component>;

        beforeEach(async () => {
          await TestBed.configureTestingModule({
            declarations: [ «component.name»Component ]
          })
          .compileComponents();
        });

        beforeEach(() => {
          fixture = TestBed.createComponent(«component.name»Component);
          component = fixture.componentInstance;
          fixture.detectChanges();
        });

        it('should create', () => {
          expect(component).toBeTruthy();
        });
      });
    '''
    fsa.generateFile("app/components/"+componentNameLower+"/"+componentNameLower+".comp.spec.ts", testCode)
  }
  
}