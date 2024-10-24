package problemsolving;

public class TwoPointers {
    public static void main(String[] args) {
        Bsc bsc = new Bsc();
        System.out.println(bsc.backspaceCompare("ab#c","ad#c"));
    }
}
class Bsc {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() -1;
        StringBuilder ss = new StringBuilder();
        StringBuilder ts = new StringBuilder();
        while(i >= 0 || j >= 0){
            int sHash = 0;
            int tHash = 0;
            while(i >= 0 && (s.charAt(i) == '#'|| sHash > 0)){
                if(s.charAt(i) == '#') {
                    sHash++;
                    i--;
                }
                else{
                    i--;
                    sHash--;
                }
            }
            while(j >= 0 && (t.charAt(j) == '#'|| tHash > 0)){
                if(t.charAt(j) == '#') {
                    tHash++;
                    j--;
                }
                else{
                    j--;
                    tHash--;
                }
            }
            if(i >= 0){
                ss.append(s.charAt(i));
                i--;
            }
            if(j >= 0){
                ts.append(t.charAt(j));
                j--;
            }
        }
        if(ss.toString().contentEquals(ts)) return true;
        return false;
    }
}