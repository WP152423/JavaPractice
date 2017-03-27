/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * <pre>
 * @author : Leejaeho
 * @version : 1.0
 */
public class Car3 {
	
	   public String company ;
	   public String model ;
	   public String color;
	   public int speed;
	   public int price;
	   
	   public Car3(){
		   
	   }
	   
	   public Car3(String Company,String Model, String Color, int Speed,int Price){
		   this.company = Company;
		   this.model = Model;
		   this.color = Color;
		   this.speed = Speed;
		   this.price = Price;
	   }

	   public Car3(String Company,String Model, String Color, int Speed){
		   this(Company,Model,Color,Speed,0);
	   }
	   
	   public Car3(String Company,String Model, String Color){
		   this(Company,Model,Color,0,0);
	   }
	   
	   public String getCompany(){
	      return company;
	   }
	   
	   public String getModel(){
	      return model;
	   }
	   
	   public String getColor(){
	      return color;
	   }
	   
	   public int getSpeed(){
	      return speed;
	   }
	   
	   public int getPrice()
	   {
	      return price;
	   }
	   
	  public void setCompany(String newCompany){
	      company = newCompany;
	      
	   }

	   public void setModel(String newModel){
	      model = newModel;
	   }
	   
	   public void setColor(String newColor){
	      color = newColor;
	   }
	   
	   public void setSpeed(int newSpeed){
	     speed = newSpeed;
	   }
	   
	   public void setPrice(int newPrice){
	      price = newPrice;
	   }
	   
	   
	}
	


