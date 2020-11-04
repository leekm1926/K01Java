package quiz;

import java.util.Random;

public class Bubble {
	
	public static void main(String[] args) {
	
	int[] number = new int[10];
	int temp;
	
	
	//중복없는 난수 생성.
	int check;
    do {
      check = 1;
      for (int i=0; i<number.length; i++) {
         Random ran = new Random();
         number[i] = ran.nextInt(99)+1;
         System.out.print(number[i]+" ");
      }
      System.out.println();
      for (int i=0; i<number.length-1; i++) {
         for (int j=i+1; j<number.length; j++) {
            if (number[i]==number[j]) {
               check = 2;
               System.out.println("중복된 난수 발생으로 난수를 다시 생성합니다.");
            }
         }
      }
   }while(check==2);

	
		for(int i=0; i<number.length -1; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(number[j] > number[j + 1])
				{
				temp = number[i];
				number[i] = number[j];
				number[j] = temp;
				}
			}
			
			System.out.println("오름차순" + number[i]);
		}
	
	}
}