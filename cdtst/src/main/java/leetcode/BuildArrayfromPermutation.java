package leetcode;

public class BuildArrayfromPermutation {

    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int arrayNums = nums[i];
            ans[i] = nums[arrayNums];
        }//for

        for(int a: ans){
            System.out.println(a);
        }

        return ans;
    }//
}//class

