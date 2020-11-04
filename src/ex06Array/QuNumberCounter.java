package ex06Array;
/*
 ※ex06array 패키지에서 작성하세요.
문제1) 파일명 : QuNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

샘플코드]
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];

실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4

 */
public class QuNumberCounter {

	public static void main(String[] args) {

		int[] answer =  { 1,4,4,3,1,4,4,2,1,3,2 };
		
		// 배열을 크기로 지정하여 선언하면 0으로 채워진다.
		int[] counter = new int[4];
		
		//배열의 크기만큼 반복하면서 각 요소를 읽어온다.
		for(int i=0; i<answer.length; i++)
		{
			if(answer[i]==1)
			{
				counter[0]++;
			}
			else if(answer[i]==2)
			{
				counter[1]++;
			}
			else if(answer[i]==3)
			{
				counter[2]++;
			}
			else
				counter[3]++;
		}
		System.out.println("counter[0]=>"+counter[0] );
		System.out.println("counter[1]=>"+counter[1] );
		System.out.println("counter[2]=>"+counter[2] );
		System.out.println("counter[3]=>"+counter[3] );
		
		
		
		/*선생님답안
		int[] answer =  { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++)
		{
		
		//검색한 숫자가 만약1이라면 counter배열의 0번인덱스를 +1 증가시키므로 아래와같이 표현할 수 있다.
		//counter[answer[i]-1]++; if~else 4라인을 합쳐놓은것과 같은 코드.
		 
			if(answer[i]==1) counter[0]++;
			else if(answer[i]==2) counter[1]++;
			else if(answer[i]==3) counter[2]++;
			else if(answer[i]==4) counter[3]++;
		}
		
		 //counter배열 출력
		for(int i=0; i<counter.length; i++)
		{
			System.out.printf("counter[%d] (%d)의 갯수):%d\n", i, i+1, counter[i]);
		}
		*/
		
	}

}
