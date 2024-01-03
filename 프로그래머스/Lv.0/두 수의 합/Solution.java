/*
*    두 수의 합
*    문제 : 정수 num1과 num2가 주어질때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요
*/

class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        //
        boolean chkVal = (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000);

        if (chkVal) {
            answer = num1 + num2;
        }
        //
        return answer;
    }
}