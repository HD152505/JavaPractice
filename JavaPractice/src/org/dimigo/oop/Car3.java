/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author       : 김용환
 * @version     : 1.0
 */
public class Car3 {
	private String company ;
	private String model ;
	private String color ;
	private int maxSpeed;
	private int price;
	
	public Car3(){
		
	}
	public Car3(String company, String model, String color, int maxSpeed, int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Car3(String company, String model, String color, int maxSpeed){
		this(company,model,color,maxSpeed,0);
	}
	public Car3(String company, String model, String color){
		this(company,model,color,0);
	}
	
	public int getPrice(){
		return price;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public String getColor(){
		return color;
	}
	public String getModel(){
		return model;
	}
	public String getCompany(){
		return company;
	}
//	public void setCompany(String newcompany){
//		 company = newcompany;
//	}
//	public void setModel(String newmodel){
//		model = newmodel;
//	}
//	public void setColor(String newcolor){
//		color = newcolor;
//	}
//	public void setMaxSpeed(int newmaxSpeed){
//		maxSpeed = newmaxSpeed;
//	}
//	public void setPrice(int newprice){
//		price = newprice;
//	}
}
