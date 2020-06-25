package com.wipro.encapsulation;

public class Book {
String name;
double price;
int qtyInStock;
//static Author author;
Author author=new Author("priya","priya@gmail.com",'f');
 public Book(String name,double price,int qtyInStock){
	this.name=name;
	//this.author=author;
	this.price=price;
	this.qtyInStock=qtyInStock;
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
public int getQtyInStock() {
	return qtyInStock;
}
public void setQtyInStock(int qtyInStock) {
	this.qtyInStock = qtyInStock;
}
public static void main(String[] args) {
	Book obj= new Book("Rome",100,1);
	System.out.println("Book name-"+obj.name+",Book Price-"+obj.price+",Book Stock-"+obj.qtyInStock);
	System.out.println("Author name-"+obj.author.name+",Author email-"+obj.author.email+",Author gender-"+obj.author.gender);
}
}

