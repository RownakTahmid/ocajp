package problemsolving;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
    public static void main(String[] args) {
        System.out.println(HN.isHappy(19));
        Set<T> set = new HashSet<>();
    }
}
class T{
    int x =10;
}
class HN {
    public static boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();
        while(!nums.contains(n)){
            nums.add(n);
            double sum = 0;
            while(n/10 != 0 || n % 10 != 0){
                sum = sum + Math.pow((n % 10),2);
                n = n / 10;
            }
            if(sum == 1) return true;
            else{
                n = (int)sum;
            }
        }
        return false;
    }
}
