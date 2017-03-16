/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author       : 김용환
 * @version     : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int se=0;
		int str=100;
		int random=1000;
		System.out.println("<< 게임 메뉴>>");
		while(se!=9){
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("메뉴 입력=>");
			
			Scanner scanner = new Scanner(System.in);
			se = scanner.nextInt();
			switch(se){
			case 1:str = str+10; 
				System.out.println("공격력이 증가되었습니다. 현재공격력 : "+str);
				break;
			
			case 2:str = str-10; 
			System.out.println("공격력이 감소되었습니다. 현재공격력 : "+str);
			break;
			case 3: random =  new Random().nextInt(4);
			switch(random){
			case 0 : System.out.println("마법사(으)로 설정되었습니다.");
			break;
			case 1 : System.out.println("영주(으)로 설정되었습니다.");
			break;
			case 2 : System.out.println("기사(으)로 설정되었습니다.");
			break;
			case 3 : System.out.println("농민(으)로 설정되었습니다.");
			break;
			default : System.out.println("마법사(으)로 설정되었습니다.");
			}
			break;
			case 9: break;
			default : System.out.println("없는 메뉴입니다!!");
		}
		}
		System.out.println("이제 공부하세요!");

	}
	}



