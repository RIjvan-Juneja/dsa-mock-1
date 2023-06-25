public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int k = 0;   // first array trawse and replce that non zero

        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                nums[k++] = nums[i];
            }
        }
        // remaining array fill 0's
        while(k<nums.length){
            nums[k++] = 0;
        }

    }
}