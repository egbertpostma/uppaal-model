/**
 */
package org.muml.uppaal.trace.diagnosticTrace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.uppaal.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Named Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference#getIndexes <em>Indexes</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage#getSingleNamedElementReference()
 * @model
 * @generated
 */
public interface SingleNamedElementReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Element</em>' reference.
	 * @see #setNamedElement(NamedElement)
	 * @see org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage#getSingleNamedElementReference_NamedElement()
	 * @model
	 * @generated
	 */
	NamedElement getNamedElement();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference#getNamedElement <em>Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Element</em>' reference.
	 * @see #getNamedElement()
	 * @generated
	 */
	void setNamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' attribute list.
	 * @see org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage#getSingleNamedElementReference_Indexes()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getIndexes();

} // SingleNamedElementReference