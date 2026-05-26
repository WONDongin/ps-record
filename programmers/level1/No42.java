package level1;

import java.util.Arrays;
import java.util.TreeSet;
/*
문제-두 개 뽑아서 더하기: 프로그래머스 Level 1

[문제 요약]
- 정수 배열에서 서로 다른 두 수를 선택
- 두 수의 합으로 만들 수 있는 모든 값을 구함
- 중복 제거 후 오름차순 정렬하여 반환

[접근 방법]
- 이중 반복문으로 모든 두 수의 조합 탐색
- TreeSet을 사용하여 중복 제거와 자동 정렬 처리
- stream()을 이용해 int[] 배열로 변환

[핵심 아이디어]
- j를 i + 1부터 시작하여 동일 인덱스 중복 선택 방지
- TreeSet은 중복 제거 + 오름차순 정렬을 동시에 처리 가능
- stream().mapToInt().toArray()로 배열 변환 가능

[처리 흐름]
배열 순회
→ 두 수 조합 생성
→ TreeSet 저장
→ int[] 변환
→ 반환

[시간복잡도]
- O(N²)
- numbers 길이 최대 100이므로 충분히 가능
*/
public class No42 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = set.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(answer));
    }
}
