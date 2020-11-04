package ex04controlstatement;


public class practice {

	public static void main(String[] args) {

		
		// 연습문제] 구구단을 출력하는 프로그램을 for문으로 작성하시오
		 
//		 System.out.println("for문으로 제작한 구구단");
//		 
//		 int i = 2;
//		 
//				 
//		 for(i=2; i<10; i++) {
//			 
//			 int j;
//			 for(j=1; j<10; j++) {
//			 System.out.printf("%d*%-2d=%d", i, j, (i*j));
//			 System.out.println();
//			
//			 }
//			 j++;
//		
//		 }
//		 i++;
//		
		 
		 // 선생님 답안]
		  
		  for(int dan=2; dan<=9; dan ++)
		  {
			  //수
			  for(int su=1; su<=9; su++)
			  {
				  System.out.print(dan+"*"+su+"="+(dan*su));
				  System.out.print(" ");
			  }
			  //하나의 단을 출력 후 줄바꿈
			  System.out.println();
		  }
		  
		  
	}

}