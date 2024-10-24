package problemsolving;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution1 solution1 = new Solution1();
//        System.out.println(solution.threeSum(new int[]{-2,0,1,1,2}));
//        System.out.println(solution1.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296));
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                if(-nums[i] == nums[left] + nums[right]){
                    List<Integer> micList = Arrays.asList(nums[i],nums[left],nums[right]);
                    list.add(micList);
                    left++;
                }
                else if(-nums[i] > nums[left] + nums[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(list);
    }
}
class Solution1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {List<List<Integer>> list = new ArrayList<>();
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
                        list.add(new ArrayList(Arrays.asList(nums[i],nums[j],nums[l],nums[r])));
                        l++;
                        while(l < r && nums[l] == nums[l - 1]) l++;
                    }
                }
            }
        }
        return list;
    }
}