package no_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
문제-10816 (실버4): 숫자 카드2
- 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력

주요 메서드
`BufferedReader.readLine()`
- 빠른 입력 처리를 위해 사용
- 한 줄 단위 입력을 받아 공백 기준으로 분리해 배열로 변환

`HashMap<Integer, Integer>`
- 숫자 카드 값(key)과 등장 횟수(value)를 저장
- 중복 숫자의 빈도 관리를 위한 자료구조

`map.getOrDefault(key, defaultValue)`
- key가 존재하지 않을 때 기본값 반환
- NullPointerException 방지
- 빈도수 누적 계산에 활용

`StringBuilder`
- 반복적인 출력 문자열 생성 시 성능 향상을 위한 도구

주요 알고리즘

1. 숫자 카드 리스트(N개)를 입력받아 HashMap에 빈도수 기록
- 각 숫자에 대해 기존 값 + 1

2. 조회 대상 숫자(M개)에 대해
- HashMap에서 해당 숫자의 빈도수를 조회
- 존재하지 않는 경우 0 처리

3. 조회 결과를 공백으로 구분하여 출력
*/
public class No10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 상근이가 가지고 있는 숫자 카드의 개수
        int N = Integer.parseInt(br.readLine());
        // 숫자 카드 입력
        String[] input = br.readLine().split(" ");

        HashMap<Integer, Integer> map = new HashMap<>(N);

        // 개수 세기
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(input[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 찾을 카드 갯수와 종류
        int M = Integer.parseInt(br.readLine());
        String[] output = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(output[i]);
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
