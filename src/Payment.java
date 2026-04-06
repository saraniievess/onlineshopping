
import java.util.*;


/**
 * Class Payment
 */
public class Payment {

  //
  // Fields
  //

  private string {id} id;
  private Date paid;
  private Real total;
  private String details;

  public Account m_1;

  public Order m_1;

  public Payment m_* {ordered, unique};

  public Payment m_* {ordered, unique};

  public Order m_1;
  
  //
  // Constructors
  //
  public Payment () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (string {id} newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public string {id} getId () {
    return id;
  }

  /**
   * Set the value of paid
   * @param newVar the new value of paid
   */
  public void setPaid (Date newVar) {
    paid = newVar;
  }

  /**
   * Get the value of paid
   * @return the value of paid
   */
  public Date getPaid () {
    return paid;
  }

  /**
   * Set the value of total
   * @param newVar the new value of total
   */
  public void setTotal (Real newVar) {
    total = newVar;
  }

  /**
   * Get the value of total
   * @return the value of total
   */
  public Real getTotal () {
    return total;
  }

  /**
   * Set the value of details
   * @param newVar the new value of details
   */
  public void setDetails (String newVar) {
    details = newVar;
  }

  /**
   * Get the value of details
   * @return the value of details
   */
  public String getDetails () {
    return details;
  }

  /**
   * Set the value of m_1
   * @param newVar the new value of m_1
   */
  public void set1 (Account newVar) {
    m_1 = newVar;
  }

  /**
   * Get the value of m_1
   * @return the value of m_1
   */
  public Account get1 () {
    return m_1;
  }

  /**
   * Set the value of m_1
   * @param newVar the new value of m_1
   */
  public void set1 (Order newVar) {
    m_1 = newVar;
  }

  /**
   * Get the value of m_1
   * @return the value of m_1
   */
  public Order get1 () {
    return m_1;
  }

  /**
   * Set the value of m_1
   * @param newVar the new value of m_1
   */
  public void set1 (Order newVar) {
    m_1 = newVar;
  }

  /**
   * Get the value of m_1
   * @return the value of m_1
   */
  public Order get1 () {
    return m_1;
  }

  //
  // Other methods
  //

}
