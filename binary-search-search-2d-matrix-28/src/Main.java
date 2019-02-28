
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums1 = {
				{5}				
		};
		int target1 = 2;
		
		int[][] nums2 = {
			    {1, 3, 5, 7},
			    {10, 11, 16, 20},
			    {23, 30, 34, 50}			
		};
		int target2 = 5;
		
		int[][] nums3 = {
			    {1,4,5},
			    {6,7,8}			
		};
		int target3 = 8;
		
		
		boolean ans1 = BSSearch2DMatrix.searchMatrix(nums1, target1);
		boolean ans2 = BSSearch2DMatrix.searchMatrix(nums2, target2);
		boolean ans3 = BSSearch2DMatrix.searchMatrix(nums3, target3);
		
		System.out.println("ans = " + ans1 + " VS false");
		System.out.println("ans = " + ans2 + " VS ture");
		System.out.println("ans = " + ans3 + " VS ture");
	}

}
