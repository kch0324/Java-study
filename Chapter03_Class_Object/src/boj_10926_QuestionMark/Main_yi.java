package boj_10926_QuestionMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_yi {
    private static String name;

    public static class ReadName{
        public ReadName(String a){
            name = a;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ReadName rn = new ReadName(br.readLine());
        System.out.println(name+"??!");
    }
}
