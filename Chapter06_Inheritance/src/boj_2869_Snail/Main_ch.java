package boj_2869_Snail;

import java.util.Scanner;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   // ���� �ö󰡴� ����
        int B = sc.nextInt();   // �㿡 �������� ����
        int V = sc.nextInt();   // ��ǥ ����
        int cnt;                // �ö󰡴µ� �ɸ��� �� ��
     
        if (A <= B) {
            cnt = -1;   // ���ö󰥶�
        } else {
            cnt = (V - A) / (A - B) + 1;	// �Ѱ����ϴ� �Ÿ� = V-A
            if ((V - A) % (A - B) != 0) {	// ����������� ������ �Ϸ簡 �� �ɸ�
                cnt++;
            }
        }

        System.out.print(cnt);
        sc.close();
    }
}