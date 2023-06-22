
public class RotateImageMatrix {
	public static void rotate(int[][] matrix) {
        int  k=matrix.length-1;
       int [][] swapMatrix = new int [matrix.length][matrix.length]; 
       int fix = matrix.length -1;
       //here we swap the rows  
       for (int i = 0; i < swapMatrix.length; i++) {
           for (int j = swapMatrix.length-1; j >=0; j--) {
               swapMatrix[i][fix-j]= matrix[k][fix-j];                
           }
           k--;
       }
		//after then we take transope of it.

       for (int i = 0; i < swapMatrix.length; i++) {
           for (int j = 0; j < swapMatrix.length; j++) {                
               matrix[i][j]=swapMatrix[j][i];
           }
       }
   

	for(int n=0;n<matrix.length;n++)
	{
		for(int a:matrix[n])
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}
	}
	
	
	public static void main(String[] args) {
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}

}
