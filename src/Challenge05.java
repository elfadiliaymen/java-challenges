import java.util.Arrays;
public class Challenge05 {
    public static void main(String[] args){
        int[] nums = {4, 9, 1, 7, 3};
        int[] sorted = Arrays.copyOf(nums, nums.length);

        for(int i = 0 ; i< sorted.length ; i++){
            for (int j = 0 ; j < sorted.length - 1 ; j++){
                if(sorted[j] < sorted[j + 1]){
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j+ 1] = temp;
                }
            }
        }

        System.out.println(sorted[1]);

    }
}
