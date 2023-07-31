package src.pkg1;

import java.util.Arrays;
import java.util.HashMap;

public class MyList {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 26;
        int []ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]= hm.get(target-nums[i]);
            }
            hm.put(nums[i],i );
        }
        System.out.println(Arrays.toString(ans));

    }
}
