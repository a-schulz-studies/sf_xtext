/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutzen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Nutzen#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNutzen()
 * @model
 * @generated
 */
public interface Nutzen extends EObject
{
  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(VerbNutzen)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNutzen_V()
   * @model containment="true"
   * @generated
   */
  VerbNutzen getV();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Nutzen#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(VerbNutzen value);

} // Nutzen
