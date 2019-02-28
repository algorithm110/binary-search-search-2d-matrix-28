
public class BSSearch2DMatrix {
	public static boolean searchMatrix(int[][] nums, int target) {
		// write your code here

		// array is empty
		if(nums.length == 0)
			return false;

		int num_row = nums.length;
		int num_col = nums[0].length;

		// target not in the nums range
		if(target < nums[0][0] || target > nums[num_row-1][num_col-1])
			return false;

		// binary search
		// search colomn first,
		int begin = 0;
		int end = num_row -1 ;
		int mid = 0;

		while (begin + 1 < end) {
			mid = begin +(end - begin)/2;
			if (target == nums[mid][0])
				return true;
			else if (target > nums[mid][0])
				begin = mid;
			else if (target < nums[mid][0])
				end = mid;   		
		}

		if (target ==  nums[begin][0])
			return true;
		else if (target == nums[end][0])
			return true;
		else {
			//check if it is in the last row
			int search_row;
			if (target > nums[end][0])
				 search_row = end;
			else search_row = begin;
			
			begin = 0;
			end = num_col - 1;
			mid = 0;

			while (begin + 1 < end) {
				mid = begin +(end - begin)/2;
				if (target == nums[search_row][mid])
					return true;
				else if (target > nums[search_row][mid])
					begin = mid;
				else if (target < nums[search_row][mid])
					end = mid;   		
			}

			if (target ==  nums[search_row][begin])
				return true;
			else if (target == nums[search_row][end])
				return true;
			else
				return false;

		} // start search begin row

	}
}
