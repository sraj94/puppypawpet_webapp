package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Product {
	
	@Id
	private int productId;
	
	private String productName;
	private String productDescription;
	private String productQty;
	private double productPrice;
	private String productCategory;
	private String productSupplier;
	
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	/**
	 * @return the productQty
	 */
	public String getProductQty() {
		return productQty;
	}
	/**
	 * @param productQty the productQty to set
	 */
	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}
	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}
	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	/**
	 * @return the productSupplier
	 */
	public String getProductSupplier() {
		return productSupplier;
	}
	/**
	 * @param productSupplier the productSupplier to set
	 */
	public void setProductSupplier(String productSupplier) {
		this.productSupplier = productSupplier;
	}

}