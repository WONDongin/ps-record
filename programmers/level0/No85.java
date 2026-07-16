package level0;
/*
문제: 부분 문자열인지 확인하기

- String.contains()를 사용하여 target이 my_string에 포함되어 있는지 확인하도록 구현

주요 메서드
- String.contains(String)

주요 알고리즘
- 문자열 탐색(String Search)

시간복잡도: O(n)
*/
public class No85 {
    public static void main(String[] args) {
        String my_string = "banana";
        String target = "ana";

        System.out.println( my_string.contains(target) ? 1 : 0);
    }
}
