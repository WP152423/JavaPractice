/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * <pre>
 * @author : Leejaeho
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car3 c1;
		Car3 c2;
		Car3 c3;
		
		c1=new Car3("현대자동차","제네시스","검정색",225,50000000);
		c2=new Car3("기아자동차","K7","흰색",246);
		c3=new Car3("삼성자동차","SM7","회색");
		
	      
		  System.out.println("<<자동차 목록>>");
	      
		  Car3 car = new Car3("현대자동차","제네시스","검정색",225,500);
	      printCarInfo(c1);
	      
	      
	      
	      Car3 car2 = new Car3("기아자동차","K7","흰색");
	      printCarInfo(c2);
	      
	      
	      Car3 car3 = new Car3();
	      printCarInfo(c3);
	      
	   }
	
	public static void printCarInfo(Car3 car)
	{
		System.out.println("제조사명 : "+car.getCompany());
	    System.out.println("모델명 : "+car.getModel());
	    System.out.println("색상 : "+car.getColor());
	    System.out.println("최대속도 : "+car.getSpeed()+"km");
	    System.out.printf("가격 : %,d원\n",car.getPrice());
	    System.out.println();
	}


	}


