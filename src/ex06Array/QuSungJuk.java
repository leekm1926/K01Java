package ex06Array;

import java.util.Scanner;

/*
 다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

 */
public class QuSungJuk {
	
	//과목수를 저장하기위한 상수 선언
	public static final int SUBJECTS=3;

	public static void main(String[] args) {

		//1] 학생수를 사용자로부터 입력받자
		//-Scanner클래스 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요?");
		int numberOfStudent = sc.nextInt();
		System.out.println("학생수:"+numberOfStudent);
		
		//2]입력받은 학생 수 만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언하고 메모리를 할당해라
		//행의수 : 학생수, 열의수 : 과목의 수
		int[][]jumsues = new int[numberOfStudent][SUBJECTS];
		
		//과목타이틀]
		String[] titles= {"국어", "영어", "수학"};
	}

}
