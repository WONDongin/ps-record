package no_7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
문제 7785 (실버5) - 회사에 있는 사람

- n개의 출입 기록이 주어지며, 각 줄에 이름과 "enter"/"leave"가 제공됨
- "enter" → 회사에 들어옴, "leave" → 회사에서 나감
- 최종적으로 회사에 남아 있는 사람을 사전 역순으로 출력

사용한 주요 자료구조 및 알고리즘:
- `HashSet` : 빠른 삽입/삭제(O(1))을 위해 사용
- `StringTokenizer` : 공백으로 구분된 이름/명령어를 빠르게 파싱
   `StringTokenizer st = new StringTokenizer(str, ",")` : ,(쉼표) 기준으로 나누기
- `Collections.sort(list, Collections.reverseOrder())` : 사전 역순(내림차순) 정렬
- `StringBuilder` : 출력 문자열을 모아 한 번에 출력해 성능 향상
*/
public class No7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String record = st.nextToken();

            if(record.equals("enter")){
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        // HashSet → list 변환 및 사전 역순으로 정렬
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        // 출력
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}