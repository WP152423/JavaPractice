/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14.
 * <pre>
 * @author : Leejaeho
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int don = 1700000;
		int jik = 3;
		int jum = 1500;
		
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+ String.format("%,d",don) + "원");
	    System.out.println("점포 내 직원 수 : "+ jik + "명");
	    System.out.println("점포 수 : "+ String.format("%,d",jum) + "개" +"\n");
	    System.out.println("연간 인건비 : " + String.format("%,d",(long)don*jik*jum*12) + "원");
		
		
		

	}

}
