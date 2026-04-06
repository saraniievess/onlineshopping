package com.ejemplo;

import java.util.*;

/**
 * Class Account
 */
public class Account {

	//
	// Fields
	//

	private String id;
	private Address billing_address;
	private boolean is_closed;
	private Date open;
	private Date closed;
	private Shopping_Cart shopping_cart;
	private Order order;

	//
	// Constructors
	//

	public Account(String id, Address billing_address, boolean is_closed, Date open, Date closed,
			Shopping_Cart shopping_cart, Order order) {
		this.id = id;
		this.billing_address = billing_address;
		this.is_closed = is_closed;
		this.open = open;
		this.closed = closed;
		this.shopping_cart = shopping_cart;
		this.order = order;
	}

	//
	// Methods
	//

	//
	// Accessor methods
	//

	/**
	 * Set the value of id
	 * 
	 * @param newVar the new value of id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get the value of id
	 * 
	 * @return the value of id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set the value of billing_address
	 * 
	 * @param newVar the new value of billing_address
	 */
	public void setBilling_address(Address address) {
		billing_address = address;
	}

	/**
	 * Get the value of billing_address
	 * 
	 * @return the value of billing_address
	 */
	public Address getBilling_address() {
		return billing_address;
	}

	/**
	 * Set the value of is_closed
	 * 
	 * @param newVar the new value of is_closed
	 */
	public void setIs_closed(boolean is_closed) {
		this.is_closed = is_closed;
	}

	/**
	 * Get the value of is_closed
	 * 
	 * @return the value of is_closed
	 */
	public boolean getIs_closed() {
		return is_closed;
	}

	/**
	 * Set the value of open
	 * 
	 * @param newVar the new value of open
	 */
	public void setOpen(Date open) {
		this.open = open;
	}

	/**
	 * Get the value of open
	 * 
	 * @return the value of open
	 */
	public Date getOpen() {
		return open;
	}

	/**
	 * Set the value of closed
	 * 
	 * @param newVar the new value of closed
	 */
	public void setClosed(Date closed) {
		this.closed = closed;
	}

	/**
	 * Get the value of closed
	 * 
	 * @return the value of closed
	 */
	public Date getClosed() {
		return closed;
	}

	/**
	 * Set the value of shopping_cart
	 * 
	 * @param shopping_cart the new value of shopping_cart
	 */
	public void setNuevo_atributo(Shopping_Cart shopping_cart) {
		this.shopping_cart = shopping_cart;
	}

	/**
	 * Get the value of shopping_cart
	 * 
	 * @return the value of shopping_cart
	 */
	public Shopping_Cart getNuevo_atributo() {
		return shopping_cart;
	}

	/**
	 * Set the value of order
	 * 
	 * @param order the new value of order
	 */
	public void setNuevo_atributo_1(Order order) {
		this.order = order;
	}

	/**
	 * Get the value of order
	 * 
	 * @return the value of order
	 */
	public Order getNuevo_atributo_1() {
		return order;
	}
}
