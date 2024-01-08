/*
*    숫자의 합
*    문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        Scanner sc  = new Scanner(System.in);
        int     n   = sc.nextInt();
        //
        if (n >= 1 && n <= 100){
            //
            String sNum = sc.next();
            char[] cNum = sNum.toCharArray();

            int     sum = 0;
            //
            for (int i = 0; i < cNum.length; i++) {
                sum += Character.getNumericValue(cNum[i]);
            }
            //
            System.out.println(sum);
            //
        }
        //
    }
}