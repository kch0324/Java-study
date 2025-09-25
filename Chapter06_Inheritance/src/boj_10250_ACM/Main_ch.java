package boj_10250_ACM;

import java.util.Scanner;

class Hotel {
    private int height;  // 층 수
    private int width;   // 층마다 방의 개수

    public Hotel(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // N번째 손님 방 배정
    public String RoomNum(int N) {
        int floor = N % height;	// 층 수
        int room = ((N - 1) / height) + 1;	// 호 수

        if (floor == 0) floor = height;  // 나누어떨어질 때 꼭대기층
        String result;
        if (room < 10) {
        	result = "0" + String.valueOf(room);	// 0을 더해서 문자열로 변환
        }
        else {
        	result = String.valueOf(room);	// 문자열로 변환 
        }
        return String.valueOf(floor) + result;
    }
}

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트케이스 개수

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();  // 층 수
            int W = sc.nextInt();  // 층마다 방의 개수
            int N = sc.nextInt();  // N번째 손님
            
            Hotel hotel;
            hotel = new Hotel(H, W);
            System.out.println(hotel.RoomNum(N));
        }

        sc.close();
    }
}
