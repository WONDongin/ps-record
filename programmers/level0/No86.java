package level0;
/*
문제: 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

- 향상된 for문으로 문자열 배열을 순회하며 ex를 포함하지 않는 문자열만 StringBuilder에 이어 붙이도록 구현

주요 메서드
- String.contains(String)
- StringBuilder.append()

주요 알고리즘
- 문자열 탐색(String Search)
- 배열 순회

시간복잡도: O(n)
*/
public class No86 {
    public static void main(String[] args) {
        String[] str_list = {"abc", "bbc", "bbc"};
        String ex = "c";
        StringBuilder sb =  new StringBuilder();

        for (String s : str_list) {
            if (!s.contains(ex)) {
                sb.append(s);
            }
        }

        System.out.println(sb);
    }
}
