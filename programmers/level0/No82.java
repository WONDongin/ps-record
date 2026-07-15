package level0;
/*
문제: 문자열을 정수로 변환하기

- Integer.parseInt()를 사용하여 문자열을 정수로 변환하도록 구현

주요 메서드
- Integer.parseInt(String)

주요 알고리즘
- 문자열 파싱(Parsing)

시간복잡도: O(n)
*/
public class No82 {
    public static void main(String[] args) {
        String n_str = "8542";
        System.out.println(Integer.parseInt(n_str));
    }
}
