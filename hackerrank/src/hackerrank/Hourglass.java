package hackerrank;

public class Hourglass {
	
	 public static void main(String[] args) {
		 int [][]mat = {{0, -4, -6, 0 ,-7,-6},
				 	    {-1,-2,-6 ,-8 ,-3 ,-1},
				 	    {-8,-4 ,-2 ,-8, -8 ,-6},
				 	    {-3 ,-1, -2, -5, -7, -4},
				 	    {-3 ,-5 ,-3 ,-6, -6 ,-6},
				 	    {-3 ,-6, 0 ,-8, -6, -7}};
		 
		 
		 
		 
		 int maxsum = Hourglass.maxHourglassSum(mat);
		 System.out.println("maxsum == " + maxsum);
		 
	    }

	private static int maxHourglassSum(int[][] mat) {
		// TODO Auto-generated method stub
		
		// if hourglass size is < 3 rows and < 3 cols then return -1
		
		System.out.println(mat.length);
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < mat.length - 2; i++) {
			for(int j = 0; j < mat.length - 2; j++) {
				int sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]) + mat[i+1][j+1] + (mat[i+2][j]+mat[i+2][j+1] + mat[i+2][j+2]);
				System.out.println(sum);
				maxSum = Math.max(maxSum, sum);
			}
		}
		
		return maxSum;
	}

}
