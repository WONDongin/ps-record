package level0;

import java.util.Arrays;
/*
문제: 전국 대회 선발 고사

문제 요약

- 학생 번호가 담긴 numbers 배열이 주어진다.
- 우리 반 학생 점수와 전체 학생 점수를 비교한다.
- 해당 학생의 점수가 일치하면 "Same", 다르면 "Different"를 반환한다.

접근 방법

- numbers에 있는 학생 번호를 이용해 score_list의 실제 점수를 조회한다.
- 학생 번호는 1번부터 시작하므로 배열 인덱스 접근 시 -1을 해준다.
- our_score와 score_list의 점수를 비교하여 결과를 저장한다.

핵심 아이디어

- score_list[numbers[i] - 1]로 해당 학생의 실제 점수를 찾는다.
- our_score[i]와 비교하여 같으면 "Same", 다르면 "Different"를 저장한다.
- 모든 학생을 순회하며 결과 배열을 완성한다.

주의할 점

- 학생 번호는 1부터 시작하지만 배열 인덱스는 0부터 시작한다.
- score_list 접근 시 반드시 numbers[i] - 1을 사용해야 한다.
- 문자열 비교가 아니라 점수(int) 비교이므로 == 사용이 가능하다.

배운 점

- 특정 번호를 배열 인덱스로 변환할 때 오프셋(-1)을 고려해야 한다.
- 두 배열의 값을 매핑하여 비교하는 기본적인 구현 문제를 연습할 수 있었다.
*/
public class No34 {
    public static void main(String[] args) {
        int[] numbers = {3, 4};
        int[] our_score = {85, 93};
        int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};

        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
