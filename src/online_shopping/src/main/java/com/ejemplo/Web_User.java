
import java.util.*;


/**
 * Class Web_User
 */
public class Web_User {

  //
  // Fields
  //

  private string {id} login_id;
  private String password;
  private UserState state;

  public Shopping_Cart m_0..1;
  
  //
  // Constructors
  //
  public Web_User () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of login_id
   * @param newVar the new value of login_id
   */
  public void setLogin_id (string {id} newVar) {
    login_id = newVar;
  }

  /**
   * Get the value of login_id
   * @return the value of login_id
   */
  public string {id} getLogin_id () {
    return login_id;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  public void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  public String getPassword () {
    return password;
  }

  /**
   * Set the value of state
   * @param newVar the new value of state
   */
  public void setState (UserState newVar) {
    state = newVar;
  }

  /**
   * Get the value of state
   * @return the value of state
   */
  public UserState getState () {
    return state;
  }

  /**
   * Set the value of m_0..1
   * @param newVar the new value of m_0..1
   */
  public void set0..1 (Shopping Cart newVar) {
    m_0..1 = newVar;
  }

  /**
   * Get the value of m_0..1
   * @return the value of m_0..1
   */
  public Shopping Cart get0..1 () {
    return m_0..1;
  }

  //
  // Other methods
  //

}
