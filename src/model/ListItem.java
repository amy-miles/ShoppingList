package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Amy Miles
 * CIS 175 - Fall 2023
 * Sep 7, 2023
 */

@Entity
@Table(name="items")
public class ListItem {
	//private members
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	/**
	 * Default no-arg constructor
	 */
	public ListItem() {
		
	}
	
	/**
	 * Constructor with parameters
	 * @param store parameter to hold the store value
	 * @param item parameter to hold the item value
	 */
	public ListItem(String store, String item) {
		this.store = store;
		this.item = item;
	}
	
	/*****************************Getters and Setters*************************/

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the store
	 */
	public String getStore() {
		return store;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(String store) {
		this.store = store;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
		
	/*****************************End Getters and Setters*************************/
	
	
	/**
	 * method to concat the store and item values
	 * @return the String
	 */
	public String returnItemDetails() {
		return this.store + ":" + this.item;
	}
	
}
