
package org.muml.uppaal.properties.system.editor;

/**
 * @generated
 */
public class ProgressMeasureEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ProgressMeasureEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

		} else if ("org.muml.uppaal".equals(tab)) { // Tab Uppaal

		} else {
		}
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ProgressMeasureEditor(String tab) {
		this(tab, org.muml.uppaal.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.declarations.system.SystemPackage.eINSTANCE.getProgressMeasure());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ProgressMeasureEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(tab);
		}
	}

}
