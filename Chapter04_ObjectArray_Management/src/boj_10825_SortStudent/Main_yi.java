package boj_10825_SortStudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_yi {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        List<studentScore> list = new ArrayList<>();
        for(int i = 0;i<num;i++){
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);

            String name = st.nextToken();
            int korea = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            studentScore sc = new studentScore(name,korea,english,math);
            list.add(sc);
        }
        list.sort(Comparator.comparing(studentScore::getKorea).reversed()
                .thenComparing(studentScore::getEnglish)
                .thenComparing(Comparator.comparing(studentScore::getMath).reversed())
                .thenComparing(studentScore::getname));
        for(studentScore idx:list){
            System.out.println(idx.name);
        }
    }
}
class studentScore{
    String name;
    int korea;
    int english;
    int math;
    public studentScore(String name, int korea, int english, int math){
        this.name = name;
        this.korea = korea;
        this.english = english;
        this.math = math;
    }
    public String getname() {
        return name;
    }

    public int getKorea() {
        return korea;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }
}
