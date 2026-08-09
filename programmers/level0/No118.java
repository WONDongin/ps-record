package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
문제: 할 일 목록

로직
- todo_list와 finished를 같은 인덱스를 기준으로 순회한다.
- finished[i]가 false인 경우 아직 완료하지 않은 일로 판단한다.
- 완료하지 않은 todo_list[i]만 결과 리스트에 추가한다.
- 결과 리스트를 문자열 배열로 변환해 반환한다.

핵심 구현
- 일반 for문을 사용해 두 배열의 같은 인덱스에 접근한다.
- !finished[i] 조건으로 아직 완료하지 않은 일인지 확인한다.
- answer.add(todo_list[i])로 미완료 항목을 결과 리스트에 추가한다.
- answer.toArray(new String[0])으로 List<String>을 String[]로 변환한다.

포인트
- todo_list[i]와 finished[i]는 같은 할 일에 대한 정보를 나타낸다.
- finished가 false인 항목만 선택해야 하므로 NOT 연산자 !를 사용한다.
- todo_list를 처음부터 순회하며 추가하므로 기존 순서가 유지된다.
- 반환할 배열의 크기가 미리 정해져 있지 않으므로 ArrayList를 사용한다.

회고
- 서로 관련된 두 배열을 같은 인덱스를 기준으로 처리하는 방법을 복습했다.
- boolean 값과 NOT 연산자를 활용해 미완료 항목만 간단하게 필터링했다.
- List<String>을 String[]로 변환하는 방법을 확인했다.
*/
public class No118 {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(
                    String[] todo_list,
                    boolean[] finished
            ) {
                List<String> answer = new ArrayList<>();

                for (int i = 0; i < todo_list.length; i++) {
                    if (!finished[i]) {
                        answer.add(todo_list[i]);
                    }
                }

                return answer.toArray(new String[0]);
            }
        }

        Solution solution = new Solution();

        String[] todoList = {
                "problemsolving",
                "practiceguitar",
                "swim",
                "studygraph"
        };

        boolean[] finished = {
                true,
                false,
                true,
                false
        };

        System.out.println(
                Arrays.toString(
                        solution.solution(todoList, finished)
                )
        ); // [practiceguitar, studygraph]
    }
}