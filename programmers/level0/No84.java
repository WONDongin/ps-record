package level0;

import java.util.ArrayList;
/*
문제: n개 간격의 원소들

- n만큼 증가시키며 배열을 순회하여 n개 간격의 원소를 ArrayList에 저장한 뒤 배열로 변환하도록 구현

주요 메서드
- ArrayList.add()
- ArrayList.get()

주요 알고리즘
- 구현(Implementation)
- 배열 순회

시간복잡도: O(n)
*/
public class No84 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            list.add(num_list[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
