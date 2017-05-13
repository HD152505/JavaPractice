/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author       : 김용환
 * @vresion     : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] p = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		for(SmartPhone p1 :  p){
			System.out.println(p1.toString());
			p1.turnOn();
			p1.pay();
			p1.useSpecialFunction(p1);
			p1.turnOff();
		}

	}

}
