package Week1.Day4;

public class Count {
    public static int singNum(int[] nums){
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

            }
            if (count == 0) {
                result=nums[i];
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 4, 3, 4};
        System.out.println(singNum(nums));
    }
}
