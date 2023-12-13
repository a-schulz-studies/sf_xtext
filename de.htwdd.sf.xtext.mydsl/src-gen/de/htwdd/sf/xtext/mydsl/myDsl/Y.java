/**
 * generated by Xtext 2.26.0
 */
package de.htwdd.sf.xtext.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getS <em>S</em>}</li>
 *   <li>{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getN <em>N</em>}</li>
 *   <li>{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getR <em>R</em>}</li>
 *   <li>{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getZiel <em>Ziel</em>}</li>
 *   <li>{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getWunsch <em>Wunsch</em>}</li>
 * </ul>
 *
 * @see de.htwdd.sf.xtext.mydsl.myDsl.MyDslPackage#getY()
 * @model
 * @generated
 */
public interface Y extends EObject
{
  /**
   * Returns the value of the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' attribute.
   * @see #setS(String)
   * @see de.htwdd.sf.xtext.mydsl.myDsl.MyDslPackage#getY_S()
   * @model
   * @generated
   */
  String getS();

  /**
   * Sets the value of the '{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getS <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' attribute.
   * @see #getS()
   * @generated
   */
  void setS(String value);

  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(Nutzen)
   * @see de.htwdd.sf.xtext.mydsl.myDsl.MyDslPackage#getY_N()
   * @model containment="true"
   * @generated
   */
  Nutzen getN();

  /**
   * Sets the value of the '{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(Nutzen value);

  /**
   * Returns the value of the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' attribute.
   * @see #setR(String)
   * @see de.htwdd.sf.xtext.mydsl.myDsl.MyDslPackage#getY_R()
   * @model
   * @generated
   */
  String getR();

  /**
   * Sets the value of the '{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getR <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' attribute.
   * @see #getR()
   * @generated
   */
  void setR(String value);

  /**
   * Returns the value of the '<em><b>Ziel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ziel</em>' attribute.
   * @see #setZiel(String)
   * @see de.htwdd.sf.xtext.mydsl.myDsl.MyDslPackage#getY_Ziel()
   * @model
   * @generated
   */
  String getZiel();

  /**
   * Sets the value of the '{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getZiel <em>Ziel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ziel</em>' attribute.
   * @see #getZiel()
   * @generated
   */
  void setZiel(String value);

  /**
   * Returns the value of the '<em><b>Wunsch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wunsch</em>' attribute.
   * @see #setWunsch(String)
   * @see de.htwdd.sf.xtext.mydsl.myDsl.MyDslPackage#getY_Wunsch()
   * @model
   * @generated
   */
  String getWunsch();

  /**
   * Sets the value of the '{@link de.htwdd.sf.xtext.mydsl.myDsl.Y#getWunsch <em>Wunsch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wunsch</em>' attribute.
   * @see #getWunsch()
   * @generated
   */
  void setWunsch(String value);

} // Y
