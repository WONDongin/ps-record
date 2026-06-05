package level1;
/*
문제: 모의고사

문제 요약
- 수포자 3명이 각자 정해진 패턴으로 문제를 찍는다.
- 정답 배열이 주어졌을 때 가장 많은 문제를 맞힌 사람의 번호를 반환한다.
- 동점자가 여러 명이면 오름차순으로 반환한다.

접근 방법
- 각 수포자의 찍는 패턴을 배열로 저장한다.
- answers를 순회하면서 % 연산을 이용해 패턴을 반복 적용한다.
- 각 수포자의 정답 개수를 카운트한다.
- 가장 높은 점수를 찾은 뒤 해당 점수를 가진 수포자 번호를 결과에 담는다.

핵심 아이디어
- 패턴이 반복되므로 인덱스를 직접 증가시키는 것이 아니라
  i % 패턴길이 를 사용하여 현재 찍은 답을 구한다.
- 모든 점수를 계산한 후 최댓값과 비교하여 정답자를 찾는다.

주의할 점
- 패턴 길이가 모두 다르므로 각각의 배열 길이를 사용해야 한다.
- 동점자가 있을 수 있으므로 최댓값과 같은 사람을 모두 추가해야 한다.

배운 점
- 반복되는 패턴 문제는 % 연산을 사용하면 쉽게 구현할 수 있다.
- 배열을 활용하면 복잡한 조건문 없이 패턴을 관리할 수 있다.
*/
import java.util.*;

public class No49 {
    class Solution {
        public int[] solution(int[] answers) {

            int[] p1 = {1, 2, 3, 4, 5};
            int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            int[] score = new int[3];

            for (int i = 0; i < answers.length; i++) {

                if (answers[i] == p1[i % p1.length]) score[0]++;
                if (answers[i] == p2[i % p2.length]) score[1]++;
                if (answers[i] == p3[i % p3.length]) score[2]++;
            }

            int max = Math.max(score[0],
                    Math.max(score[1], score[2]));

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < score.length; i++) {
                if (score[i] == max) {
                    list.add(i + 1);
                }
            }

            return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
