package learning.string.stringbuilderexample;

public class StringBuilderExample {
    public static void main(String[] args) {
        String j = "java";
        for (Character c : j.toCharArray()){
            j +=  " " + j;
        }
        System.out.println(j);
        StringBuilder sb = new StringBuilder("java");
        for (int i = 0; i < 5; i++){
            sb.append(i); // reuses the object without creating a new one
        }
        System.out.println(sb);
        StringBuilder sub = new StringBuilder(5);
        StringBuilder sub2 = sub.append("java");
        StringBuilder sub3 = sub.append(" is");
        StringBuilder sub4 = sub.append(" good.");
        System.out.println(sub == sub4);
        System.out.println(sub);
    }
}
