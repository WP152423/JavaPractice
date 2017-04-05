/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * <pre>
 * @author : Leejaeho
 * @version : 1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*StringBuilder singer = new StringBuilder("트와이스");
		StringBuilder actor = new StringBuilder("공승연");
		StringBuilder subject = new StringBuilder("응용 프로그래밍");
		
		System.out.println("1.가장 좋아하는 가수는?");
		String singer1 = scanner.nextLine();
		if(singer1.equals(singer)){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}
		
		System.out.println("2.가장 좋아하는 배우는?");
		String actor1 = scanner.nextLine();
		if(actor1.equals(actor)){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}
		
		System.out.println("3.가장 좋아하는 과목은?");
		String subject1 = scanner.nextLine();
		if(subject1.equals(subject)){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}
		
		singer.append("입니다.");
	    actor.append("입니다.");
		subject.append("입니다.");
		
		
		System.out.println("<<결과 출력>>");
		System.out.println("가장 좋아하는 가수는? "+singer);
		System.out.println("가장 좋아하는 배우는? "+actor);
		System.out.println("가장 좋아하는 과목은? "+subject);
		*/
		String[] Answer={"트와이스","공승연","응용 프로그래밍"};
		String[] Question={"1.가장 좋아하는 가수는? ","2.가장 좋아하는 배우는? ","3.가장 좋아하는 과목은? "};
		int i;
		for(i=0;i<=2;i++){
			System.out.println(Question[i]);
			if(Answer[i].equals(scanner.nextLine())){
				System.out.println("정답입니다!");
			}
			else{
				System.out.println("틀렸습니다!");
			}
			
		}
		System.out.println("<<결과 출력>>");
		System.out.println("가장 좋아하는 가수는? "+Answer[0]);
		System.out.println("가장 좋아하는 배우는? "+Answer[1]);
		System.out.println("가장 좋아하는 과목은? "+Answer[2]);
		
	}

}
