package level1;
/*
문제: 카드 뭉치

문제 요약
- 두 개의 카드 뭉치(cards1, cards2)가 주어진다.
- 각 카드 뭉치의 순서는 변경할 수 없다.
- 카드도 중간에 건너뛸 수 없다.
- goal 배열을 순서대로 만들 수 있으면 "Yes", 아니면 "No"를 반환한다.

접근 방법
- cards1, cards2 각각의 현재 위치를 가리키는 인덱스를 사용한다.
- goal을 앞에서부터 순회하며 현재 단어가 cards1 또는 cards2의 사용 가능한 카드와 일치하는지 확인한다.
- 일치하면 해당 카드 뭉치의 인덱스를 증가시킨다.
- 둘 다 일치하지 않으면 goal을 만들 수 없으므로 즉시 "No"를 반환한다.

핵심 아이디어
- 카드 뭉치의 순서를 유지해야 하므로 큐(Queue)처럼 앞에서부터만 사용 가능하다.
- 별도의 자료구조 없이 인덱스만으로 현재 사용 가능한 카드 위치를 관리할 수 있다.
- goal을 모두 순회했다면 조건을 만족하므로 "Yes"를 반환한다.

주의할 점
- 카드를 건너뛸 수 없으므로 현재 인덱스 위치의 카드만 비교해야 한다.
- 배열 범위를 벗어나지 않도록 인덱스 길이 체크가 필요하다.

배운 점
- 순서를 유지하며 데이터를 소비하는 문제는 인덱스 또는 큐를 활용하면 효율적으로 해결할 수 있다.
- 조건을 만족하지 못하는 순간 즉시 종료하는 방식이 코드 가독성과 성능 측면에서 유리하다.
*/
public class No51 {
    class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            int index1 = 0;
            int index2 = 0;

            for(int i = 0; i < goal.length; i++){
                if(index1 < cards1.length && goal[i].equals(cards1[index1])){
                    index1++;
                } else if(index2 < cards2.length && goal[i].equals(cards2[index2])){
                    index2++;
                } else {
                    return "No";
                }
            }

            return "Yes";
        }
    }
}
