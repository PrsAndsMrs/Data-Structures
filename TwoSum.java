/* 
Question:
Givassume that each input would have exactly one solution, and you may not use the same element twice.
en an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may 
Write code below 
*/

public class TwoSum{
	public static void main(String []args) {
 
        int[] nums = {2, 4, 9, 15};
        int target = 11;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers that add up to give the target are: " + result[0]+"and" +result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    // Function to find indices of two numbers that add up to the target
    private static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return nums;
    }
}

		
	
