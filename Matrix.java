
public class Matrix {
	
	public static void main(String[] agrs) {
		int[][] arr1= {{10,20,30},
				       {40,50,60},
				       {60,70,80}};
		int[][] arr2= {{1,2,3},
						{4,5,6},
						{6,7,8}};
		int[][] ansArr=new int[3][3];
		addMatrix(arr1,arr2,ansArr);
		displayMatrix(ansArr);
		}
	public static int[][] addMatrix(int[][] arr1,int[][] arr2,int[][] ansArr){
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				ansArr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return ansArr;
	}
	public static void displayMatrix(int[][] ansArr) {
		for(int i=0;i<ansArr.length;i++) {
			for(int j=0;j<ansArr.length;j++) {
				System.out.print(ansArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
