/**
 * 
 */
package org.dimigo.inheritance;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 15.
 * <pre>
 * @author : Leejaeho
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone i = new IPhone("iPhone7","애플",900000);
		System.out.println(i);
		i.turnOn();
		i.pay();
		i.useSpecialFunction(i);
		i.turnOff();
		
		System.out.println();
		
		SmartPhone g = new Galaxy("갤럭시 S8","삼성", 8000000);
		System.out.println(g);
		g.turnOn();
		g.pay();
		g.useSpecialFunction(g);
		g.turnOff();
		

	}

}
