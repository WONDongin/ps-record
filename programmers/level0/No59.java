package level0;
/*
문제: 중앙값 구하기

로직
- 배열을 오름차순으로 정렬한다.
- 정렬된 배열의 가운데 인덱스를 계산한다.
- 가운데 값을 반환한다.

핵심 구현
- 핵심 코드
  Arrays.sort(array);
  System.out.println(array[array.length / 2]);
- 배열을 정렬한 후 `array.length / 2` 위치의 값을 조회하여 중앙값을 구한다.

포인트
- 문제에서 배열의 길이가 홀수이므로 가운데 인덱스를 `length / 2`로 바로 구할 수 있다.
- `Arrays.sort()`를 활용하면 별도의 정렬 로직을 구현할 필요가 없다.

회고
- 중앙값은 정렬이 선행되어야 정확하게 구할 수 있다는 점을 다시 확인했다.
- 배열의 길이가 홀수인 경우 가운데 인덱스를 간단한 계산으로 구할 수 있어 구현이 직관적이었다.
*/
public class No59 {
    public static void main(String[] args) {
        int n = 144;
        int half = n / 2;

        System.out.println(n == half * half ? "1" : "2");


    }
}
