package ClassLecture;

import java.util.Scanner;

public class subseq{



    static boolean isSubSeq(String str, String seq){
        int i = 0;
        int j = 0;
        while (i<str.length() && j<seq.length()) {
            if (str.charAt(i)==seq.charAt(j)) {
                j++;
            }
            i++;
        }
        return j==seq.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // String seq = sc.next();

        // // System.out.println(isSubSeq(str, seq));

        // System.out.println(isSubSeq("abcde", "ac"));
        // System.out.println(isSubSeq("abcde", "abd"));

        String word = "madam";
        char[] charArray = word.toCharArray();
        int start = 0;
        int end  = word.length()-1;
        while (start<end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
        }
        start++;
        end++;
        return true;

    }
}