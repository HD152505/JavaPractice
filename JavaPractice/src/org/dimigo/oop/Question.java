/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *      |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author      : 김용환
 * @version    : 1.0
 */
public class Question {

   /**
    * @param args
    */
   public static void main(String[] args) {
      
      int i;
      
      String [] question = {"1. 가장 좋아하는 가수는?","2. 가장 좋아하는 배우는?","3. 가장 좋아하는 과목은?"}; 
      String [] answer = {"트와이스","박정명","응용"}; 

      
      for(i=0;i<3;i++){
         
         System.out.println(question[i]);
         Scanner scanner = new Scanner(System.in);
         String ans = scanner.nextLine();
      
         if(answer[i].equals(ans)){
            System.out.println("정답입니다!");
         }
         else{
            System.out.println("틀렸습니다!");
         }
         
      }
      
      
   
      System.out.println("<< 결과출력 >>");
      
      for(i=0;i<3;i++){
         
         System.out.println(new StringBuilder(question[i]).append(answer[i]).append("입니다."));
      }
      
   }

}