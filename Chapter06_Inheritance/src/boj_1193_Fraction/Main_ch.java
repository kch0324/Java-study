package boj_1193_Fraction;
import java.util.Scanner;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int N = 1;   // ���� �밢�� ��ȣ
        int cnt = X;    // �밢�� �ȿ����� ��ġ

        // �밢�� ��ȣ�� �밢�� �ȿ����� ��ġ  ã��
        // N��° �밢����  [N/1, N-1/2, ..., 2/N-1, 1/N]
        // N��° �밢���� N���� ���� �������
        while (cnt > N) {
            cnt -= N;
            N++;
        }

        int left, right;

        
        // N�� Ȧ��/¦�������� ���� ����/�и� ���
        if (N % 2 == 0) {  // ¦���϶� (����:1, �и�:N���ͽ���)
            left = cnt;                
            right = N - cnt + 1;    
        } else {            // Ȧ���϶� (����:N, �и�:1���� ����)
            left = N - cnt + 1;     
            right = cnt;               
        }

        System.out.println(left + "/" + right);
        sc.close();
    }
    
}
