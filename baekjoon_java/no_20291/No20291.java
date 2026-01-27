package no_20291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
/*
문제-20291 (실버3): 파일정리
- 파일 이름 목록이 주어질 때, 각 파일의 확장자별 개수를 구하는 문제
- 결과는 확장자 기준 사전순(오름차순) 으로 출력

접근 방법

- 파일 이름에서 . 이후 문자열을 확장자로 추출
- TreeMap을 사용해 확장자별 개수를 누적하며 자동 정렬 처리

핵심 아이디어

- `lastIndexOf('.')`를 이용해 확장자를 안정적으로 추출
- `TreeMap을` 사용해 별도의 정렬 로직 없이 사전순 출력

주요 메서드

`BufferedReader.readLine()` : 입력 처리
`String.lastIndexOf()` : 확장자 위치 탐색
`Map.getOrDefault()` : 카운트 누적
`TreeMap` : 자동 정렬 자료구조

정리

- 자료구조 선택이 핵심인 문제
- `TreeMap을` 사용하면 구현이 단순해지고 코드 가독성이 좋아짐
*/
public class No20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for(int i = 0; i < n; i++){
            String file = br.readLine();
            int idx = file.lastIndexOf('.');
            String ext = file.substring(idx + 1);

            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }

        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
