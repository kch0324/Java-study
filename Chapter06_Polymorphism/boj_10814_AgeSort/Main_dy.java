package boj_10814_AgeSort;
import java.util.*;

public class Main_dy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.length() != b.length()) {
            System.out.println("false");
            return;
        }

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        if (Arrays.equals(arrA, arrB)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
