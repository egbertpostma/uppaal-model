/**
 */
package org.muml.uppaal.declarations.system;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.uppaal.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A progress measure consisting of monotonically increasing expressions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.system.ProgressMeasure#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.declarations.system.SystemPackage#getProgressMeasure()
 * @model
 * @generated
 */
public interface ProgressMeasure extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The progress measure expressions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see org.muml.uppaal.declarations.system.SystemPackage#getProgressMeasure_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // ProgressMeasure
