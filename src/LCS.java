import java.util.*;

public class LCS {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LCS o= new LCS();
        System.out.println("Enter 2 words");
        String S1 = in.next();
        String S2 = in.next();
        int m = S1.length();
        int n = S2.length();
        System.out.println("Length of LCS is " + o.lcs(S1, S2, m, n));
    }
    int lcs(String X, String Y, int m, int n)
    {
        if (m == 0 || n == 0)
            return 0;
        if (X.charAt(m - 1) == Y.charAt(n - 1))
            return 1 + lcs(X, Y, m - 1, n - 1);
        else
            return max(lcs(X, Y, m, n - 1),lcs(X, Y, m - 1, n));
    }
    int max(int a, int b) { return (a > b) ? a : b; }

}