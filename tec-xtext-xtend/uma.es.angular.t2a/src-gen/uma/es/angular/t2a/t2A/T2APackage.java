/**
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.t2A;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uma.es.angular.t2a.t2A.T2AFactory
 * @model kind="package"
 * @generated
 */
public interface T2APackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "t2A";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.es.uma/angular/t2a/T2A";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "t2A";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  T2APackage eINSTANCE = uma.es.angular.t2a.t2A.impl.T2APackageImpl.init();

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.RootImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.ElementImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.PageImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getPage()
   * @generated
   */
  int PAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Sclasses</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__SCLASSES = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Home</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__HOME = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Show In Nav</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__SHOW_IN_NAV = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Page Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__PAGE_FEATURES = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.EDOMImpl <em>EDOM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.EDOMImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getEDOM()
   * @generated
   */
  int EDOM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDOM__NAME = ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>EDOM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDOM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.StyleClassImpl <em>Style Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.StyleClassImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getStyleClass()
   * @generated
   */
  int STYLE_CLASS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS__NAME = EDOM__NAME;

  /**
   * The feature id for the '<em><b>Sattributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS__SATTRIBUTES = EDOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sattributes After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS__SATTRIBUTES_AFTER = EDOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sattributes Active</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS__SATTRIBUTES_ACTIVE = EDOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Style Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_CLASS_FEATURE_COUNT = EDOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.SAttributeAndValueImpl <em>SAttribute And Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.SAttributeAndValueImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getSAttributeAndValue()
   * @generated
   */
  int SATTRIBUTE_AND_VALUE = 5;

  /**
   * The feature id for the '<em><b>Stname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SATTRIBUTE_AND_VALUE__STNAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SATTRIBUTE_AND_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>SAttribute And Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SATTRIBUTE_AND_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.DOMImpl <em>DOM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.DOMImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getDOM()
   * @generated
   */
  int DOM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM__NAME = EDOM__NAME;

  /**
   * The feature id for the '<em><b>Sclasses</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM__SCLASSES = EDOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM__FEATURES = EDOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DOM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_FEATURE_COUNT = EDOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.CompImpl <em>Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.CompImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getComp()
   * @generated
   */
  int COMP = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP__NAME = EDOM__NAME;

  /**
   * The feature id for the '<em><b>Sclasses</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP__SCLASSES = EDOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP__FEATURES = EDOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_FEATURE_COUNT = EDOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.InstanciaEDOMImpl <em>Instancia EDOM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.InstanciaEDOMImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getInstanciaEDOM()
   * @generated
   */
  int INSTANCIA_EDOM = 8;

  /**
   * The feature id for the '<em><b>Instancia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCIA_EDOM__INSTANCIA = 0;

  /**
   * The feature id for the '<em><b>Insfeatures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCIA_EDOM__INSFEATURES = 1;

  /**
   * The number of structural features of the '<em>Instancia EDOM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCIA_EDOM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.InstanceEDOMFeatureImpl <em>Instance EDOM Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.InstanceEDOMFeatureImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getInstanceEDOMFeature()
   * @generated
   */
  int INSTANCE_EDOM_FEATURE = 9;

  /**
   * The feature id for the '<em><b>Instancia EDOM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_EDOM_FEATURE__INSTANCIA_EDOM = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_EDOM_FEATURE__STRING = 1;

  /**
   * The number of structural features of the '<em>Instance EDOM Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_EDOM_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.PageFeatureImpl <em>Page Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.PageFeatureImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getPageFeature()
   * @generated
   */
  int PAGE_FEATURE = 10;

  /**
   * The feature id for the '<em><b>Instancia EDOM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE__INSTANCIA_EDOM = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE__STRING = 1;

  /**
   * The number of structural features of the '<em>Page Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uma.es.angular.t2a.t2A.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uma.es.angular.t2a.t2A.impl.FeatureImpl
   * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 11;

  /**
   * The feature id for the '<em><b>Instancia EDOM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__INSTANCIA_EDOM = 0;

  /**
   * The feature id for the '<em><b>Allow Slot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__ALLOW_SLOT = 1;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__STRING = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see uma.es.angular.t2a.t2A.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference list '{@link uma.es.angular.t2a.t2A.Root#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see uma.es.angular.t2a.t2A.Root#getElements()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Elements();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see uma.es.angular.t2a.t2A.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uma.es.angular.t2a.t2A.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see uma.es.angular.t2a.t2A.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the reference list '{@link uma.es.angular.t2a.t2A.Page#getSclasses <em>Sclasses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sclasses</em>'.
   * @see uma.es.angular.t2a.t2A.Page#getSclasses()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Sclasses();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.Page#isHome <em>Home</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Home</em>'.
   * @see uma.es.angular.t2a.t2A.Page#isHome()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Home();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.Page#isShowInNav <em>Show In Nav</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show In Nav</em>'.
   * @see uma.es.angular.t2a.t2A.Page#isShowInNav()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_ShowInNav();

  /**
   * Returns the meta object for the containment reference list '{@link uma.es.angular.t2a.t2A.Page#getPageFeatures <em>Page Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Page Features</em>'.
   * @see uma.es.angular.t2a.t2A.Page#getPageFeatures()
   * @see #getPage()
   * @generated
   */
  EReference getPage_PageFeatures();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.EDOM <em>EDOM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EDOM</em>'.
   * @see uma.es.angular.t2a.t2A.EDOM
   * @generated
   */
  EClass getEDOM();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.StyleClass <em>Style Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Class</em>'.
   * @see uma.es.angular.t2a.t2A.StyleClass
   * @generated
   */
  EClass getStyleClass();

  /**
   * Returns the meta object for the containment reference list '{@link uma.es.angular.t2a.t2A.StyleClass#getSattributes <em>Sattributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sattributes</em>'.
   * @see uma.es.angular.t2a.t2A.StyleClass#getSattributes()
   * @see #getStyleClass()
   * @generated
   */
  EReference getStyleClass_Sattributes();

  /**
   * Returns the meta object for the containment reference list '{@link uma.es.angular.t2a.t2A.StyleClass#getSattributesAfter <em>Sattributes After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sattributes After</em>'.
   * @see uma.es.angular.t2a.t2A.StyleClass#getSattributesAfter()
   * @see #getStyleClass()
   * @generated
   */
  EReference getStyleClass_SattributesAfter();

  /**
   * Returns the meta object for the containment reference list '{@link uma.es.angular.t2a.t2A.StyleClass#getSattributesActive <em>Sattributes Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sattributes Active</em>'.
   * @see uma.es.angular.t2a.t2A.StyleClass#getSattributesActive()
   * @see #getStyleClass()
   * @generated
   */
  EReference getStyleClass_SattributesActive();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.SAttributeAndValue <em>SAttribute And Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SAttribute And Value</em>'.
   * @see uma.es.angular.t2a.t2A.SAttributeAndValue
   * @generated
   */
  EClass getSAttributeAndValue();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.SAttributeAndValue#getStname <em>Stname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stname</em>'.
   * @see uma.es.angular.t2a.t2A.SAttributeAndValue#getStname()
   * @see #getSAttributeAndValue()
   * @generated
   */
  EAttribute getSAttributeAndValue_Stname();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.SAttributeAndValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uma.es.angular.t2a.t2A.SAttributeAndValue#getValue()
   * @see #getSAttributeAndValue()
   * @generated
   */
  EAttribute getSAttributeAndValue_Value();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.DOM <em>DOM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DOM</em>'.
   * @see uma.es.angular.t2a.t2A.DOM
   * @generated
   */
  EClass getDOM();

  /**
   * Returns the meta object for the reference list '{@link uma.es.angular.t2a.t2A.DOM#getSclasses <em>Sclasses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sclasses</em>'.
   * @see uma.es.angular.t2a.t2A.DOM#getSclasses()
   * @see #getDOM()
   * @generated
   */
  EReference getDOM_Sclasses();

  /**
   * Returns the meta object for the containment reference list '{@link uma.es.angular.t2a.t2A.DOM#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see uma.es.angular.t2a.t2A.DOM#getFeatures()
   * @see #getDOM()
   * @generated
   */
  EReference getDOM_Features();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.Comp <em>Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comp</em>'.
   * @see uma.es.angular.t2a.t2A.Comp
   * @generated
   */
  EClass getComp();

  /**
   * Returns the meta object for the reference list '{@link uma.es.angular.t2a.t2A.Comp#getSclasses <em>Sclasses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sclasses</em>'.
   * @see uma.es.angular.t2a.t2A.Comp#getSclasses()
   * @see #getComp()
   * @generated
   */
  EReference getComp_Sclasses();

  /**
   * Returns the meta object for the containment reference list '{@link uma.es.angular.t2a.t2A.Comp#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see uma.es.angular.t2a.t2A.Comp#getFeatures()
   * @see #getComp()
   * @generated
   */
  EReference getComp_Features();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.InstanciaEDOM <em>Instancia EDOM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instancia EDOM</em>'.
   * @see uma.es.angular.t2a.t2A.InstanciaEDOM
   * @generated
   */
  EClass getInstanciaEDOM();

  /**
   * Returns the meta object for the reference '{@link uma.es.angular.t2a.t2A.InstanciaEDOM#getInstancia <em>Instancia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instancia</em>'.
   * @see uma.es.angular.t2a.t2A.InstanciaEDOM#getInstancia()
   * @see #getInstanciaEDOM()
   * @generated
   */
  EReference getInstanciaEDOM_Instancia();

  /**
   * Returns the meta object for the containment reference list '{@link uma.es.angular.t2a.t2A.InstanciaEDOM#getInsfeatures <em>Insfeatures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Insfeatures</em>'.
   * @see uma.es.angular.t2a.t2A.InstanciaEDOM#getInsfeatures()
   * @see #getInstanciaEDOM()
   * @generated
   */
  EReference getInstanciaEDOM_Insfeatures();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.InstanceEDOMFeature <em>Instance EDOM Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance EDOM Feature</em>'.
   * @see uma.es.angular.t2a.t2A.InstanceEDOMFeature
   * @generated
   */
  EClass getInstanceEDOMFeature();

  /**
   * Returns the meta object for the containment reference '{@link uma.es.angular.t2a.t2A.InstanceEDOMFeature#getInstanciaEDOM <em>Instancia EDOM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instancia EDOM</em>'.
   * @see uma.es.angular.t2a.t2A.InstanceEDOMFeature#getInstanciaEDOM()
   * @see #getInstanceEDOMFeature()
   * @generated
   */
  EReference getInstanceEDOMFeature_InstanciaEDOM();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.InstanceEDOMFeature#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see uma.es.angular.t2a.t2A.InstanceEDOMFeature#getString()
   * @see #getInstanceEDOMFeature()
   * @generated
   */
  EAttribute getInstanceEDOMFeature_String();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.PageFeature <em>Page Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Feature</em>'.
   * @see uma.es.angular.t2a.t2A.PageFeature
   * @generated
   */
  EClass getPageFeature();

  /**
   * Returns the meta object for the containment reference '{@link uma.es.angular.t2a.t2A.PageFeature#getInstanciaEDOM <em>Instancia EDOM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instancia EDOM</em>'.
   * @see uma.es.angular.t2a.t2A.PageFeature#getInstanciaEDOM()
   * @see #getPageFeature()
   * @generated
   */
  EReference getPageFeature_InstanciaEDOM();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.PageFeature#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see uma.es.angular.t2a.t2A.PageFeature#getString()
   * @see #getPageFeature()
   * @generated
   */
  EAttribute getPageFeature_String();

  /**
   * Returns the meta object for class '{@link uma.es.angular.t2a.t2A.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see uma.es.angular.t2a.t2A.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the containment reference '{@link uma.es.angular.t2a.t2A.Feature#getInstanciaEDOM <em>Instancia EDOM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instancia EDOM</em>'.
   * @see uma.es.angular.t2a.t2A.Feature#getInstanciaEDOM()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_InstanciaEDOM();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.Feature#isAllowSlot <em>Allow Slot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allow Slot</em>'.
   * @see uma.es.angular.t2a.t2A.Feature#isAllowSlot()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_AllowSlot();

  /**
   * Returns the meta object for the attribute '{@link uma.es.angular.t2a.t2A.Feature#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see uma.es.angular.t2a.t2A.Feature#getString()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_String();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  T2AFactory getT2AFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.RootImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__ELEMENTS = eINSTANCE.getRoot_Elements();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.ElementImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.PageImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Sclasses</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__SCLASSES = eINSTANCE.getPage_Sclasses();

    /**
     * The meta object literal for the '<em><b>Home</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__HOME = eINSTANCE.getPage_Home();

    /**
     * The meta object literal for the '<em><b>Show In Nav</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__SHOW_IN_NAV = eINSTANCE.getPage_ShowInNav();

    /**
     * The meta object literal for the '<em><b>Page Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__PAGE_FEATURES = eINSTANCE.getPage_PageFeatures();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.EDOMImpl <em>EDOM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.EDOMImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getEDOM()
     * @generated
     */
    EClass EDOM = eINSTANCE.getEDOM();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.StyleClassImpl <em>Style Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.StyleClassImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getStyleClass()
     * @generated
     */
    EClass STYLE_CLASS = eINSTANCE.getStyleClass();

    /**
     * The meta object literal for the '<em><b>Sattributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_CLASS__SATTRIBUTES = eINSTANCE.getStyleClass_Sattributes();

    /**
     * The meta object literal for the '<em><b>Sattributes After</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_CLASS__SATTRIBUTES_AFTER = eINSTANCE.getStyleClass_SattributesAfter();

    /**
     * The meta object literal for the '<em><b>Sattributes Active</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_CLASS__SATTRIBUTES_ACTIVE = eINSTANCE.getStyleClass_SattributesActive();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.SAttributeAndValueImpl <em>SAttribute And Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.SAttributeAndValueImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getSAttributeAndValue()
     * @generated
     */
    EClass SATTRIBUTE_AND_VALUE = eINSTANCE.getSAttributeAndValue();

    /**
     * The meta object literal for the '<em><b>Stname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SATTRIBUTE_AND_VALUE__STNAME = eINSTANCE.getSAttributeAndValue_Stname();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SATTRIBUTE_AND_VALUE__VALUE = eINSTANCE.getSAttributeAndValue_Value();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.DOMImpl <em>DOM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.DOMImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getDOM()
     * @generated
     */
    EClass DOM = eINSTANCE.getDOM();

    /**
     * The meta object literal for the '<em><b>Sclasses</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOM__SCLASSES = eINSTANCE.getDOM_Sclasses();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOM__FEATURES = eINSTANCE.getDOM_Features();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.CompImpl <em>Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.CompImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getComp()
     * @generated
     */
    EClass COMP = eINSTANCE.getComp();

    /**
     * The meta object literal for the '<em><b>Sclasses</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMP__SCLASSES = eINSTANCE.getComp_Sclasses();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMP__FEATURES = eINSTANCE.getComp_Features();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.InstanciaEDOMImpl <em>Instancia EDOM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.InstanciaEDOMImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getInstanciaEDOM()
     * @generated
     */
    EClass INSTANCIA_EDOM = eINSTANCE.getInstanciaEDOM();

    /**
     * The meta object literal for the '<em><b>Instancia</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCIA_EDOM__INSTANCIA = eINSTANCE.getInstanciaEDOM_Instancia();

    /**
     * The meta object literal for the '<em><b>Insfeatures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCIA_EDOM__INSFEATURES = eINSTANCE.getInstanciaEDOM_Insfeatures();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.InstanceEDOMFeatureImpl <em>Instance EDOM Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.InstanceEDOMFeatureImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getInstanceEDOMFeature()
     * @generated
     */
    EClass INSTANCE_EDOM_FEATURE = eINSTANCE.getInstanceEDOMFeature();

    /**
     * The meta object literal for the '<em><b>Instancia EDOM</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_EDOM_FEATURE__INSTANCIA_EDOM = eINSTANCE.getInstanceEDOMFeature_InstanciaEDOM();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE_EDOM_FEATURE__STRING = eINSTANCE.getInstanceEDOMFeature_String();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.PageFeatureImpl <em>Page Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.PageFeatureImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getPageFeature()
     * @generated
     */
    EClass PAGE_FEATURE = eINSTANCE.getPageFeature();

    /**
     * The meta object literal for the '<em><b>Instancia EDOM</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE_FEATURE__INSTANCIA_EDOM = eINSTANCE.getPageFeature_InstanciaEDOM();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE_FEATURE__STRING = eINSTANCE.getPageFeature_String();

    /**
     * The meta object literal for the '{@link uma.es.angular.t2a.t2A.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uma.es.angular.t2a.t2A.impl.FeatureImpl
     * @see uma.es.angular.t2a.t2A.impl.T2APackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Instancia EDOM</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__INSTANCIA_EDOM = eINSTANCE.getFeature_InstanciaEDOM();

    /**
     * The meta object literal for the '<em><b>Allow Slot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__ALLOW_SLOT = eINSTANCE.getFeature_AllowSlot();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__STRING = eINSTANCE.getFeature_String();

  }

} //T2APackage
