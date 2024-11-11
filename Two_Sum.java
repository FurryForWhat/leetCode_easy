import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args){
        int[] mydata = {2,3,4};
        int target = 6;
       int[] indices =  twoSum(mydata,target);
       System.out.print("Indices are :"+ Arrays.toString(indices));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
