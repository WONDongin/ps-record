package level1;

import java.util.HashMap;

/*
문제-142086: 가장 가까운 같은 글자

[문제 요약]
- 문자열에서 각 문자의 이전 등장 위치와의 거리를 구하는 문제
- 이전에 등장한 적이 없다면 -1 저장
- 가장 최근에 나온 같은 문자와 현재 위치 차이를 계산

[접근 방법]
- 각 문자의 마지막 등장 위치를 저장
- 문자열을 순회하면서 현재 문자의 이전 위치 확인
- 처음 등장한 문자면 -1
- 이미 등장했던 문자면 현재 인덱스 - 이전 인덱스 계산
- 처리 후 현재 위치로 최신화

[핵심 아이디어]
- "가장 가까운 같은 글자"는 가장 최근 위치만 저장하면 해결 가능
- HashMap<Character, Integer> 사용
- 문자 → 마지막 등장 인덱스 형태로 관리

[처리 흐름]
문자 순회
→ 이전 등장 여부 확인
→ 거리 계산 또는 -1 저장
→ 현재 위치 갱신

[시간복잡도]
- O(N)
- 문자열을 한 번만 순회
*/
public class No40 {
    public int[] solution(String s) {

        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // 처음 등장한 문자
            if (!map.containsKey(ch)) {
                answer[i] = -1;
            } else {
                // 현재 위치 - 이전 위치
                answer[i] = i - map.get(ch);
            }

            // 현재 위치 저장
            map.put(ch, i);
        }

        return answer;
    }
}
