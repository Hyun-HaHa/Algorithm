/*
*    팰린드롬인지 확인하기
*    문제 : 알파벳 소문자로만 이루어진 단어가 주어진다.
*           이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
*           팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 독같은 단어를 말한다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        Scanner sc      = new Scanner(System.in);
        String  word    = sc.next();

        int     result  = 1;
        //
        if( word.length() >= 1 && word.length() <= 100 ) {
            //
            for (int i = 0; i < word.length() / 2; i++){
                //
                if( word.charAt(i) != word.charAt(word.length() - i -1)){
                    result = 0;
                }
                //
            }
            //
            System.out.println(result);
        }
        //
    }
}
