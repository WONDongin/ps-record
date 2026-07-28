package level0;

import java.util.ArrayList;
import java.util.List;
/*
문제: 배열의 원소만큼 추가하기

로직
- arr의 원소를 순서대로 확인한다.
- 각 원소 a를 새로운 리스트에 a번씩 추가한다.
- 완성된 List<Integer>를 int[] 배열로 변환해 반환한다.

핵심 구현
- 이중 반복문으로 각 원소를 원소의 값만큼 반복해서 추가
- stream().mapToInt()를 사용해 List<Integer>를 int[]로 변환

포인트
- 입력 배열의 순서를 유지하면서 새로운 배열을 생성한다.
- 결과 배열의 크기가 정해져 있지 않아 ArrayList를 활용한다.

회고
- ArrayList를 사용하면 결과 배열의 크기를 미리 계산하지 않아도 편리하게 원소를 추가할 수 있다.
- 컬렉션을 기본형 배열로 변환할 때 mapToInt()를 활용할 수 있다.
*/
public class No98 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {
                List<Integer> list = new ArrayList<>();

                for (int a : arr) {
                    for (int i = 0; i < a; i++) {
                        list.add(a);
                    }
                }

                return list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
            }
        }
    }
}
