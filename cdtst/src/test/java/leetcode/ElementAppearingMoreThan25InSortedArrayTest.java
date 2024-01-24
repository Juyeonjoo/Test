package leetcode;

import org.junit.jupiter.api.Test;

class ElementAppearingMoreThan25InSortedArrayTest {
    @Test
    public void findSpecialInteger(){

        ElementAppearingMoreThan25InSortedArray elementAppearingMoreThan25InSortedArray = new ElementAppearingMoreThan25InSortedArray();
        int[] arr = {1,2,2,6,6,6,6,7,10};

        elementAppearingMoreThan25InSortedArray.findSpecialInteger(arr);
    }
}