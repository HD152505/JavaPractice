/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.Inheritance
 *   |_ PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author       : 김용환
 * @vresion     : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Person[] Person = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Chinese("다나카"),
				new Japanese("왕밍")
		};
		
		for(Person p1 : Person){
			greeting(p1);
		}
		
		
		
			
		

	}
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
	}
	

}
