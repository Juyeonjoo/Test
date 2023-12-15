package leetcode;

import org.junit.jupiter.api.Test;

class BuildArrayfromPermutationTest {

    @Test
    public void buildArray(){
        BuildArrayfromPermutation buildArrayfromPermutation = new BuildArrayfromPermutation();

        int[] nums = new int[]{5,0,1,2,3,4};
        buildArrayfromPermutation.buildArray(nums);
    }
}