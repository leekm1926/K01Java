package ex06Array;

/*
 즉 메소드를 호출하면 1행은 2행으로, 2행은 3행으로 마지막행은 1행으로 이동하게된다.
 단 세로길이에 상관없이 동작하도록 메소드를 정의해야 한다.
 */
public class QuTwoDimLotate {

	//2차원 배열을 출력하기위한 메소드
	static void arrPrint(int[][] arr) {
		//세로크기만큼 반복 , 인덱스 기호가 없으면 세로길이, 인덱스기호가 하나면 가로길이, 두개면 각각의 인덱스.
		for(int i=0; i<arr.length; i++)
		{	
			//가로크기만큼 반복
			for(int j=0; j<arr[i].length; j++)
			{
				//각각의 요소를 출력함
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{

		int arr[][] = new int[3][3];
		
		int initVal = 1;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = initVal++;
			}
		}
		arrPrint(arr);
		
		rotateArray(arr);
		arrPrint(arr);
		
		rotateArray(arr);
		arrPrint(arr);
		
		rotateArray(arr);
		arrPrint(arr);
		
		
	}
	
	public static void rotateArray(int[][] arrParam)
	{
		/*
		 절차
		 	1. 배열의 마지막행을 1차원배열 변수에 임시로 저장
		 	2. 배열의 2행을 3행으로, 1행을 2행으로 옮긴다.
		 	3. 1번에서 임시로 저장했던 값을 1행으로 옮긴다.
		 	
		 	※2차원 배열에서 "배열이름[인덱스]"가 하나의 행(세로행)을 가리킨다는 것을 활용하는 문제임
		 */
		
		//절차1
		int[] lastRow = arrParam[arrParam.length-1];//인덱스는 항상 크기 -1
		//절차2 : 세로크기에 상관없이 동작해야 하므로 length를 사용한다.
		for(int row=arrParam.length-1; row>0;row--)
		{
			arrParam[row] = arrParam[row-1];
		}
		//절차3
		arrParam[0] = lastRow;
	}
	

}
