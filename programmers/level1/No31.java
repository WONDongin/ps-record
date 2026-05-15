package level1;

import java.util.Scanner;
import java.util.stream.IntStream;
/*
문제-12969: 직사각형 별찍기

[문제 요약]
- 가로 길이 n, 세로 길이 m이 주어질 때
  직사각형 형태로 '*'을 출력하는 문제

[접근 방법]
- StringBuilder를 사용해 가로 길이만큼 '*' 문자열 생성
- 생성된 문자열을 세로 길이만큼 반복 출력
- IntStream.range()를 활용해 반복문을 함수형 스타일로 구현

[핵심 아이디어]
- 한 줄을 먼저 완성한 뒤 반복 출력하면 효율적
- StringBuilder로 문자열 누적 후 재사용
- IntStream.range()로 간결한 반복 처리 가능

[처리 흐름]
가로 길이 입력 →
'*' 문자열 생성 →
세로 길이만큼 반복 출력

[시간복잡도]
- O(n + m)
*/
public class No31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, n).forEach(s -> sb.append("*"));
        IntStream.range(0, m).forEach(s -> System.out.println(sb.toString()));
    }
}
