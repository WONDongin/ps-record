package no_17219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
문제-17219 (실버4): 비밀번호 찾기
- 저장된 사이트 주소의 수 N, 비밀번호를 찾으려는 사이트 주소의 수 M
  첫 번째 줄부터 M개의 줄에 걸쳐 비밀번호를 찾으려는 사이트 주소의 비밀번호를 차례대로 각 줄에 하나씩 출력한다.

주요 메서드
- HashMap.put(key, value)
    - 사이트 주소(key)와 비밀번호(value)를 매핑하여 저장

- HashMap.get(key)
    - 입력된 사이트 주소에 대응하는 비밀번호를 빠르게 조회

- BufferedReader.readLine()
    - 빠른 입력 처리

- String.split(" ")
    - 사이트 주소와 비밀번호를 분리

- StringBuilder.append()
    - 출력 문자열을 효율적으로 생성

주요 알고리즘
- HashMap 기반 키-값 조회 알고리즘
사이트 주소를 해시값으로 변환하여 O(1)에 비밀번호 접근

- 시간 복잡도: O(N + M)
    - N: 저장할 사이트 개수
    - M: 조회할 사이트 개수

- 입·출력 최적화
    - BufferedReader + StringBuilder 조합으로 I/O 성능 향상
*/
public class No17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        // 저장된 사이트 주소의 수
        int N = Integer.parseInt(arr[0]);
        // 비밀번호를 찾으려는 사이트 주소의 수
        int M = Integer.parseInt(arr[1]);

        // 사이트주소 + 비밀번호 저장
        HashMap<String, String> map = new HashMap<>(N);
        for(int i = 0; i < N; i++){
            String[] tmp = br.readLine().split(" ");
            map.put(tmp[0], tmp[1]);
        }

        // 사이트 비번찾기
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String address = br.readLine();
            sb.append(map.get(address)).append("\n");
        }

        // 비밀번호 출력
        System.out.println(sb);
    }
}
