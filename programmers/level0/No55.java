package level0;

import java.util.Arrays;
/*
문제: 최댓값 만들기 (1)

로직
- 배열을 오름차순으로 정렬한다.
- 가장 큰 두 수를 선택한다.
- 두 수를 곱한 값을 반환한다.

핵심 구현
- 핵심 코드
  ex) Arrays.sort(numbers);
- 배열을 오름차순으로 정렬하여 가장 큰 값들이 뒤쪽에 위치하도록 만든다.
- 핵심 코드
  ex) numbers[n - 1] * numbers[n - 2]
- 정렬된 배열의 마지막 두 원소를 곱해 최댓값을 구한다.

포인트
- 오름차순 정렬 후 마지막 두 원소만 사용하면 간단하게 해결할 수 있다.
- 배열의 길이를 변수(n)에 저장해 마지막 인덱스를 쉽게 계산할 수 있다.
- 제한사항에서 원소가 모두 0 이상의 정수이므로 가장 큰 두 수를 곱하면 항상 최댓값이 된다.

회고
- 정렬을 활용하면 복잡한 비교 없이 최대 곱을 쉽게 구할 수 있었다.
- 문제의 제한사항을 확인하면 음수를 고려할 필요가 없어 풀이를 더욱 단순하게 작성할 수 있다.
*/
public class No55 {
    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9};
        int n = numbers.length;

        Arrays.sort(numbers);

        System.out.println(numbers[n - 1] * numbers[n - 2]);
    }
}
