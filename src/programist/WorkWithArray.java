package programist;

import java.util.Arrays;

public class WorkWithArray {
    public static void main(String[] args) {
        char[] word = viceVersa(new char[]{'п','р','о','г','р','а','м','м','и','с','т'});
        System.out.println(Arrays.toString(word));
    }
    public static char[] viceVersa(char[] wordFirst){
        char[] wordSecond = new char[wordFirst.length];
        for (int i = wordFirst.length - 1,j= 0; i >= 0; i--,j++) {
            wordSecond[j] = wordFirst[i];
        }
        return wordSecond;
    }
}
