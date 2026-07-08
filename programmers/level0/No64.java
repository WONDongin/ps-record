package level0;

import java.util.Arrays;
/*
문제: 가장 큰 수 찾기

로직
- 배열을 처음부터 끝까지 순회한다.
- 현재 최댓값보다 큰 값을 발견하면 최댓값과 인덱스를 함께 갱신한다.
- 최종적으로 [최댓값, 인덱스]를 반환한다.

핵심 구현
- if (array[i] > answer[0])
- answer[0] = array[i];
- answer[1] = i;

- 현재 원소가 기존 최댓값보다 큰 경우에만 값을 갱신한다.
- 최댓값과 해당 위치의 인덱스를 동시에 저장하여 별도의 탐색 없이 결과를 얻는다.

포인트
- 최댓값을 갱신할 때 인덱스도 함께 갱신해야 한다.
- 배열을 한 번만 순회하므로 효율적으로 해결할 수 있다.
- 제한사항에서 배열의 원소가 자연수이므로 answer[0]을 0으로 초기화해도 문제없이 동작한다.

회고
- 최댓값뿐만 아니라 위치까지 함께 관리해야 하는 문제였다.
- 하나의 반복문으로 값과 인덱스를 동시에 관리하는 방법을 다시 한번 익힐 수 있었다.
*/
public class No64 {
    public static void main(String[] args) {
        int[] array = {9, 10, 11, 8};
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}