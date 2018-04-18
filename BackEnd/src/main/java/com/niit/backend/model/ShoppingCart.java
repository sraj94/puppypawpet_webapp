package com.niit.backend.model;


/**
 * Shopping Cart defines shopping cart details.
 * @author hp
 *
 */
public class ShoppingCart {

	private String shopCartUserName;
	private String shopCartPdtId;
	private String shopCartPdtName;
	private String shopCartPdtDescription;
	private String shopCartPdtCategory;
	private String shopCartPdtQty;
	private double shopCartPdtPrice;
	private String supplierName;
	private double shopCartTotalPrice;
	private boolean shopCartStatus;
	/**
	 * @return the shopCartUserName
	 */
	public String getShopCartUserName() {
		return shopCartUserName;
	}
	/**
	 * @param shopCartUserName the shopCartUserName to set
	 */
	public void setShopCartUserName(String shopCartUserName) {
		this.shopCartUserName = shopCartUserName;
	}
	/**
	 * @return the shopCartPdtId
	 */
	public String getShopCartPdtId() {
		return shopCartPdtId;
	}
	/**
	 * @param shopCartPdtId the shopCartPdtId to set
	 */
	public void setShopCartPdtId(String shopCartPdtId) {
		this.shopCartPdtId = shopCartPdtId;
	}
	/**
	 * @return the shopCartPdtName
	 */
	public String getShopCartPdtName() {
		return shopCartPdtName;
	}
	/**
	 * @param shopCartPdtName the shopCartPdtName to set
	 */
	public void setShopCartPdtName(String shopCartPdtName) {
		this.shopCartPdtName = shopCartPdtName;
	}
	/**
	 * @return the shopCartPdtDescription
	 */
	public String getShopCartPdtDescription() {
		return shopCartPdtDescription;
	}
	/**
	 * @param shopCartPdtDescription the shopCartPdtDescription to set
	 */
	public void setShopCartPdtDescription(String shopCartPdtDescription) {
		this.shopCartPdtDescription = shopCartPdtDescription;
	}
	/**
	 * @return the shopCartPdtCategory
	 */
	public String getShopCartPdtCategory() {
		return shopCartPdtCategory;
	}
	/**
	 * @param shopCartPdtCategory the shopCartPdtCategory to set
	 */
	public void setShopCartPdtCategory(String shopCartPdtCategory) {
		this.shopCartPdtCategory = shopCartPdtCategory;
	}
	/**
	 * @return the shopCartPdtQty
	 */
	public String getShopCartPdtQty() {
		return shopCartPdtQty;
	}
	/**
	 * @param shopCartPdtQty the shopCartPdtQty to set
	 */
	public void setShopCartPdtQty(String shopCartPdtQty) {
		this.shopCartPdtQty = shopCartPdtQty;
	}
	/**
	 * @return the shopCartPdtPrice
	 */
	public double getShopCartPdtPrice() {
		return shopCartPdtPrice;
	}
	/**
	 * @param shopCartPdtPrice the shopCartPdtPrice to set
	 */
	public void setShopCartPdtPrice(double shopCartPdtPrice) {
		this.shopCartPdtPrice = shopCartPdtPrice;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * @return the shopCartTotalPrice
	 */
	public double getShopCartTotalPrice() {
		return shopCartTotalPrice;
	}
	/**
	 * @param shopCartTotalPrice the shopCartTotalPrice to set
	 */
	public void setShopCartTotalPrice(double shopCartTotalPrice) {
		this.shopCartTotalPrice = shopCartTotalPrice;
	}
	/**
	 * @return the shopCartStatus
	 */
	public boolean isShopCartStatus() {
		return shopCartStatus;
	}
	/**
	 * @param shopCartStatus the shopCartStatus to set
	 */
	public void setShopCartStatus(boolean shopCartStatus) {
		this.shopCartStatus = shopCartStatus;
	}	
}