package day07;

public class TwoDimArray {

	public static void main(String[] args) {
		int[][] arr= {{2,3,4} , {1,4,3}, {5,6,7}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
