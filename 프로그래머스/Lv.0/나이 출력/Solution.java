/*
*    나이 출력
*    문제 : 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
*/

class Solution {
    public int solution(int age) {
        int         answer = 0;
        boolean     chkVal = (0 < age && age <= 120);
        //
        if (chkVal) {
            answer = 2022 - age + 1;
        }
        //
        return answer;
    }
}