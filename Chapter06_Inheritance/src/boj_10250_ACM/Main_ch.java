package boj_10250_ACM;

import java.util.Scanner;

class Hotel {
    private int height;  // �� ��
    private int width;   // ������ ���� ����

    public Hotel(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // N��° �մ� �� ����
    public String RoomNum(int N) {
        int floor = N % height;	// �� ��
        int room = ((N - 1) / height) + 1;	// ȣ ��

        if (floor == 0) floor = height;  // ��������� �� �������
        String result;
        if (room < 10) {
        	result = "0" + String.valueOf(room);	// 0�� ���ؼ� ���ڿ��� ��ȯ
        }
        else {
        	result = String.valueOf(room);	// ���ڿ��� ��ȯ 
        }
        return String.valueOf(floor) + result;
    }
}

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // �׽�Ʈ���̽� ����

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();  // �� ��
            int W = sc.nextInt();  // ������ ���� ����
            int N = sc.nextInt();  // N��° �մ�
            
            Hotel hotel;
            hotel = new Hotel(H, W);
            System.out.println(hotel.RoomNum(N));
        }

        sc.close();
    }
}
