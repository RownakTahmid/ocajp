package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        FSum fSum = new FSum();
        System.out.println(fSum.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
    }

}
class FSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1; j < nums.length -2; j++){
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int need =  target - (nums[i] + nums[j]);
                int l = j + 1, r = nums.length -1;
                while(l < r){
                    int sum  = nums[l] + nums[r];
                    if(sum > need)r--;
                    else if(sum < need) l++;
                    else{
                        list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[l],nums[r])));
                        l++;
                        while(l < r && nums[l] == nums[l - 1]) l++;
                    }
                }
            }
        }
        return list;
    }
}