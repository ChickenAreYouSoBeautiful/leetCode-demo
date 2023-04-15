package day1;

public class Add {
    public static void main(String[] args) {

        int[] nums = {3,3,4};
        int target = 6;
        int[] add = add(nums, target);
        for (int i : add) {
            System.out.println(i);
        }

    }

    public static int[] add(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
