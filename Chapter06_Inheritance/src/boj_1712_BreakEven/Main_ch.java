package boj_1712_BreakEven;
import java.util.Scanner;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   // �������
        int B = sc.nextInt();   // �������
        int C = sc.nextInt();   // �ǸŰ���
        int cnt;                // ���ͺб��� �ǸŴ��

        if (C <= B) {
            cnt = -1;   // ���ͺб����� ������
        } else {
            cnt = A / (C - B) + 1;   
        }

        System.out.print(cnt);
        sc.close();
    }
}