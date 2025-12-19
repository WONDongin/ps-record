package no_10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
문제-10773 (실버4): 제로
- 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
- 최종적으로 적어 낸 수의 합을 출력

주요 메서드

- `BufferedReader`: 입력 속도 향상
- `Integer.parseInt()`: 문자열 → 정수 변환
- `ArrayDeque`
    - push(): 값 저장
    - pop(): 최근 값 제거
- 향상된 for문 (`for-each`): 스택에 남은 값 합산

주요 알고리즘

- 스택(`Stack`) 을 이용한 입력 처리
- 0 입력 시 직전 숫자 취소(`Undo`)
- 모든 입력을 순차적으로 처리
- 최종적으로 스택에 남은 값들의 합 계산
- 별도 시뮬레이션 없이 자료구조 동작으로 해결
*/
public class No10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack  = new ArrayDeque<>();

        for(int i = 0; i < k; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                stack .pop();
            } else {
                stack .push(n);
            }
        }
        int sum = 0;
        for(int n : stack ){
            sum += n;
        }

        System.out.println(sum);
    }
}
