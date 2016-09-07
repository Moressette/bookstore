package com.bookstore.entity;

public class OrderItem {

	private int order_id;
	private int product_id;
	private int buynum;
	
	// 商品信息
	private String name;
	private double price;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getBuynum() {
		return buynum;
	}
	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderItem [order_id=" + order_id + ", product_id=" + product_id
				+ ", buynum=" + buynum + ", name=" + name + ", price=" + price
				+ "]";
	}
	
}
