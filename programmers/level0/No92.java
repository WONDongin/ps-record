package level0;
/*
문제: 부분 문자열인지 확인하기

로직
- str2에 str1이 포함되어 있는지 확인한다.
- 포함되어 있으면 1, 포함되어 있지 않으면 0을 반환한다.

핵심 구현
- String.contains()를 사용해 부분 문자열 포함 여부를 확인한다.
- 삼항 연산자로 결과에 따라 1 또는 0을 출력한다.

포인트
- contains()는 문자열 안에 특정 문자열이 연속해서 포함되어 있는지 boolean 값으로 반환한다.
- 포함 여부만 판단하면 되므로 반복문 없이 간단하게 구현할 수 있다.

회고
- contains()를 활용하면 부분 문자열 문제를 짧고 직관적으로 해결할 수 있다.
*/
public class No92 {
    public static void main(String[] args) {
        String str1 = "tbt";
        String str2 = "tbbttb";

        System.out.println(str2.contains(str1) ? 1 : 0);
    }
}
