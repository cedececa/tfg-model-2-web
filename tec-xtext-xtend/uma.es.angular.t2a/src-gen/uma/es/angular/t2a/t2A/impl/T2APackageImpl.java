/**
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.t2A.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uma.es.angular.t2a.t2A.Comp;
import uma.es.angular.t2a.t2A.Element;
import uma.es.angular.t2a.t2A.Feature;
import uma.es.angular.t2a.t2A.InstanceEDOMFeature;
import uma.es.angular.t2a.t2A.InstanciaEDOM;
import uma.es.angular.t2a.t2A.Page;
import uma.es.angular.t2a.t2A.PageFeature;
import uma.es.angular.t2a.t2A.Root;
import uma.es.angular.t2a.t2A.SAttributeAndValue;
import uma.es.angular.t2a.t2A.StyleClass;
import uma.es.angular.t2a.t2A.T2AFactory;
import uma.es.angular.t2a.t2A.T2APackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class T2APackageImpl extends EPackageImpl implements T2APackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sAttributeAndValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanciaEDOMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceEDOMFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uma.es.angular.t2a.t2A.T2APackage#eNS_URI
   * @see #init()
   * @generated
   */
  private T2APackageImpl()
  {
    super(eNS_URI, T2AFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link T2APackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static T2APackage init()
  {
    if (isInited) return (T2APackage)EPackage.Registry.INSTANCE.getEPackage(T2APackage.eNS_URI);

    // Obtain or create and register package
    Object registeredT2APackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    T2APackageImpl theT2APackage = registeredT2APackage instanceof T2APackageImpl ? (T2APackageImpl)registeredT2APackage : new T2APackageImpl();

    isInited = true;

    // Create package meta-data objects
    theT2APackage.createPackageContents();

    // Initialize created meta-data
    theT2APackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theT2APackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(T2APackage.eNS_URI, theT2APackage);
    return theT2APackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoot()
  {
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRoot_Elements()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getElement_Name()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPage()
  {
    return pageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPage_Sclasses()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPage_Home()
  {
    return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPage_ShowInNav()
  {
    return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPage_PageFeatures()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEDOM()
  {
    return edomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStyleClass()
  {
    return styleClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStyleClass_Sattributes()
  {
    return (EReference)styleClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStyleClass_SattributesAfter()
  {
    return (EReference)styleClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStyleClass_SattributesActive()
  {
    return (EReference)styleClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSAttributeAndValue()
  {
    return sAttributeAndValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSAttributeAndValue_Stname()
  {
    return (EAttribute)sAttributeAndValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSAttributeAndValue_Value()
  {
    return (EAttribute)sAttributeAndValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDOM()
  {
    return domEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDOM_Sclasses()
  {
    return (EReference)domEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDOM_Features()
  {
    return (EReference)domEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComp()
  {
    return compEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComp_Sclasses()
  {
    return (EReference)compEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComp_Features()
  {
    return (EReference)compEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInstanciaEDOM()
  {
    return instanciaEDOMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInstanciaEDOM_Instancia()
  {
    return (EReference)instanciaEDOMEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInstanciaEDOM_Insfeatures()
  {
    return (EReference)instanciaEDOMEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInstanceEDOMFeature()
  {
    return instanceEDOMFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInstanceEDOMFeature_InstanciaEDOM()
  {
    return (EReference)instanceEDOMFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInstanceEDOMFeature_String()
  {
    return (EAttribute)instanceEDOMFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPageFeature()
  {
    return pageFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPageFeature_InstanciaEDOM()
  {
    return (EReference)pageFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPageFeature_String()
  {
    return (EAttribute)pageFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeature_InstanciaEDOM()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFeature_AllowSlot()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFeature_String()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public T2AFactory getT2AFactory()
  {
    return (T2AFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rootEClass = createEClass(ROOT);
    createEReference(rootEClass, ROOT__ELEMENTS);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__NAME);

    pageEClass = createEClass(PAGE);
    createEReference(pageEClass, PAGE__SCLASSES);
    createEAttribute(pageEClass, PAGE__HOME);
    createEAttribute(pageEClass, PAGE__SHOW_IN_NAV);
    createEReference(pageEClass, PAGE__PAGE_FEATURES);

    edomEClass = createEClass(EDOM);

    styleClassEClass = createEClass(STYLE_CLASS);
    createEReference(styleClassEClass, STYLE_CLASS__SATTRIBUTES);
    createEReference(styleClassEClass, STYLE_CLASS__SATTRIBUTES_AFTER);
    createEReference(styleClassEClass, STYLE_CLASS__SATTRIBUTES_ACTIVE);

    sAttributeAndValueEClass = createEClass(SATTRIBUTE_AND_VALUE);
    createEAttribute(sAttributeAndValueEClass, SATTRIBUTE_AND_VALUE__STNAME);
    createEAttribute(sAttributeAndValueEClass, SATTRIBUTE_AND_VALUE__VALUE);

    domEClass = createEClass(DOM);
    createEReference(domEClass, DOM__SCLASSES);
    createEReference(domEClass, DOM__FEATURES);

    compEClass = createEClass(COMP);
    createEReference(compEClass, COMP__SCLASSES);
    createEReference(compEClass, COMP__FEATURES);

    instanciaEDOMEClass = createEClass(INSTANCIA_EDOM);
    createEReference(instanciaEDOMEClass, INSTANCIA_EDOM__INSTANCIA);
    createEReference(instanciaEDOMEClass, INSTANCIA_EDOM__INSFEATURES);

    instanceEDOMFeatureEClass = createEClass(INSTANCE_EDOM_FEATURE);
    createEReference(instanceEDOMFeatureEClass, INSTANCE_EDOM_FEATURE__INSTANCIA_EDOM);
    createEAttribute(instanceEDOMFeatureEClass, INSTANCE_EDOM_FEATURE__STRING);

    pageFeatureEClass = createEClass(PAGE_FEATURE);
    createEReference(pageFeatureEClass, PAGE_FEATURE__INSTANCIA_EDOM);
    createEAttribute(pageFeatureEClass, PAGE_FEATURE__STRING);

    featureEClass = createEClass(FEATURE);
    createEReference(featureEClass, FEATURE__INSTANCIA_EDOM);
    createEAttribute(featureEClass, FEATURE__ALLOW_SLOT);
    createEAttribute(featureEClass, FEATURE__STRING);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    pageEClass.getESuperTypes().add(this.getElement());
    edomEClass.getESuperTypes().add(this.getElement());
    styleClassEClass.getESuperTypes().add(this.getEDOM());
    domEClass.getESuperTypes().add(this.getEDOM());
    compEClass.getESuperTypes().add(this.getEDOM());

    // Initialize classes and features; add operations and parameters
    initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoot_Elements(), this.getElement(), null, "elements", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPage_Sclasses(), this.getStyleClass(), null, "sclasses", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPage_Home(), ecorePackage.getEBoolean(), "home", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPage_ShowInNav(), ecorePackage.getEBoolean(), "showInNav", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPage_PageFeatures(), this.getPageFeature(), null, "pageFeatures", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edomEClass, uma.es.angular.t2a.t2A.EDOM.class, "EDOM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(styleClassEClass, StyleClass.class, "StyleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStyleClass_Sattributes(), this.getSAttributeAndValue(), null, "sattributes", null, 0, -1, StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStyleClass_SattributesAfter(), this.getSAttributeAndValue(), null, "sattributesAfter", null, 0, -1, StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStyleClass_SattributesActive(), this.getSAttributeAndValue(), null, "sattributesActive", null, 0, -1, StyleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sAttributeAndValueEClass, SAttributeAndValue.class, "SAttributeAndValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSAttributeAndValue_Stname(), ecorePackage.getEString(), "stname", null, 0, 1, SAttributeAndValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSAttributeAndValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, SAttributeAndValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domEClass, uma.es.angular.t2a.t2A.DOM.class, "DOM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDOM_Sclasses(), this.getStyleClass(), null, "sclasses", null, 0, -1, uma.es.angular.t2a.t2A.DOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDOM_Features(), this.getFeature(), null, "features", null, 0, -1, uma.es.angular.t2a.t2A.DOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compEClass, Comp.class, "Comp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComp_Sclasses(), this.getStyleClass(), null, "sclasses", null, 0, -1, Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComp_Features(), this.getFeature(), null, "features", null, 0, -1, Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanciaEDOMEClass, InstanciaEDOM.class, "InstanciaEDOM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanciaEDOM_Instancia(), this.getEDOM(), null, "instancia", null, 0, 1, InstanciaEDOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstanciaEDOM_Insfeatures(), this.getInstanceEDOMFeature(), null, "insfeatures", null, 0, -1, InstanciaEDOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceEDOMFeatureEClass, InstanceEDOMFeature.class, "InstanceEDOMFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceEDOMFeature_InstanciaEDOM(), this.getInstanciaEDOM(), null, "instanciaEDOM", null, 0, 1, InstanceEDOMFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstanceEDOMFeature_String(), ecorePackage.getEString(), "string", null, 0, 1, InstanceEDOMFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageFeatureEClass, PageFeature.class, "PageFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPageFeature_InstanciaEDOM(), this.getInstanciaEDOM(), null, "instanciaEDOM", null, 0, 1, PageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPageFeature_String(), ecorePackage.getEString(), "string", null, 0, 1, PageFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeature_InstanciaEDOM(), this.getInstanciaEDOM(), null, "instanciaEDOM", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_AllowSlot(), ecorePackage.getEBoolean(), "AllowSlot", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_String(), ecorePackage.getEString(), "string", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //T2APackageImpl
