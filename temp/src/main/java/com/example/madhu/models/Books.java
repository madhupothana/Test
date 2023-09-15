package com.example.madhu.models;

public class Books {
	private int id;
	private int p_id;
	private String name,author;
	private double price;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(int id, int p_id, String name, String author, double price) {
		super();
		this.id = id;
		this.p_id = p_id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
