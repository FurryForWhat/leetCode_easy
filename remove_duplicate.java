import java.util.ArrayList;

public class remove_duplicate {
    public static void main(String[] args){
        int[] data = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(data);
        for (int i = 0; i < result; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums){
        int range = nums.length;
        for(int i = 0 ; i <range; i++){
            for(int j = i+1; j < range; j++){
                if(nums[i] == nums[j]){

                    for(int z = j; z<range-1; z++){
                        nums[z] = -1;
                        nums[z] = nums[z+1];
                    }
                    range--;
                    j--;

                }
            }
        }

        return range ;
    }
    public static int removeDuplicates1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // Pointer for the last unique element position

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // Move to the next position
                nums[i] = nums[j]; // Place the new unique element
            }
        }

        return i + 1; // The number of unique elements
    }
}
