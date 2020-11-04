package ex06Array;

public class Gugu {

	public static void main(String[] args) {

		int [][] num = new int [10][10];
		
		for(int i=2; i<num.length; i++)
		{
			for(int j=1; j<num[i].length; j++)
			{
				num[i][j] = i * j;
				System.out.print(i + "x" + j + "=" + num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
