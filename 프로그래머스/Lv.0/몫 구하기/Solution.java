/*
*    몫 구하기
*    문제 : 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
*/

class Solution {
    public int solution(int num1, int num2) {
        int         answer = 0;
        boolean     chkVal = (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100);
        //
        if (chkVal) {
            answer = num1 / num2;
        }
        //
        return answer;
    }
}