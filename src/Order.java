
import java.util.*;


/**
 * Class Order
 */
public class Order {

  //
  // Fields
  //

  private string {id} number;
  private Date ordered;
  private Date shipped;
  private Address ship_to;
  private OrderStatus status;
  private Real total;

  public Order m_1;

  public Payment m_* {ordered, unique};

  public Payment m_* {ordered, unique};

  public Order m_1;

  public Vector line_itemVector = new Vector();
  
  //
  // Constructors
  //
  public Order () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of number
   * @param newVar the new value of number
   */
  public void setNumber (string {id} newVar) {
    number = newVar;
  }

  /**
   * Get the value of number
   * @return the value of number
   */
  public string {id} getNumber () {
    return number;
  }

  /**
   * Set the value of ordered
   * @param newVar the new value of ordered
   */
  public void setOrdered (Date newVar) {
    ordered = newVar;
  }

  /**
   * Get the value of ordered
   * @return the value of ordered
   */
  public Date getOrdered () {
    return ordered;
  }

  /**
   * Set the value of shipped
   * @param newVar the new value of shipped
   */
  public void setShipped (Date newVar) {
    shipped = newVar;
  }

  /**
   * Get the value of shipped
   * @return the value of shipped
   */
  public Date getShipped () {
    return shipped;
  }

  /**
   * Set the value of ship_to
   * @param newVar the new value of ship_to
   */
  public void setShip_to (Address newVar) {
    ship_to = newVar;
  }

  /**
   * Get the value of ship_to
   * @return the value of ship_to
   */
  public Address getShip_to () {
    return ship_to;
  }

  /**
   * Set the value of status
   * @param newVar the new value of status
   */
  public void setStatus (OrderStatus newVar) {
    status = newVar;
  }

  /**
   * Get the value of status
   * @return the value of status
   */
  public OrderStatus getStatus () {
    return status;
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
   * Set the value of m_* {ordered, unique}
   * @param newVar the new value of m_* {ordered, unique}
   */
  public void set* {ordered, unique} (Payment newVar) {
    m_* {ordered, unique} = newVar;
  }

  /**
   * Get the value of m_* {ordered, unique}
   * @return the value of m_* {ordered, unique}
   */
  public Payment get* {ordered, unique} () {
    return m_* {ordered, unique};
  }

  /**
   * Set the value of m_* {ordered, unique}
   * @param newVar the new value of m_* {ordered, unique}
   */
  public void set* {ordered, unique} (Payment newVar) {
    m_* {ordered, unique} = newVar;
  }

  /**
   * Get the value of m_* {ordered, unique}
   * @return the value of m_* {ordered, unique}
   */
  public Payment get* {ordered, unique} () {
    return m_* {ordered, unique};
  }

  /**
   * Add a Line_item object to the line_itemVector List
   */
  public void addLine_item (LineItem new_object) {
    line_itemVector.add(new_object);
  }

  /**
   * Remove a Line_item object from line_itemVector List
   */
  public void removeLine_item (LineItem new_object)
  {
    line_itemVector.remove(new_object);
  }

  /**
   * Get the List of Line_item objects held by line_itemVector
   * @return List of Line_item objects held by line_itemVector
   */
  public List getLine_itemList () {
    return (List) line_itemVector;
  }


  //
  // Other methods
  //

}
