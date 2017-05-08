/**
 * 
 */
package org.dimigo.Inheritance;

/**
 * <pre>
 * org.dimigo.Inheritance
 *   |_ Chinese
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author       : 김용환
 * @vresion     : 1.0
 */
public class Chinese extends Person {

	public Chinese(String name){
		super(name);
	}
	public void sayHello(){
		System.out.println("니하오");
	}
	public void sayBye(){
		System.out.println("쨔이찌엔");
	}
	public String toString(){
		return "저는 중국사람 " + getName()+"입니다.";
	}
}
