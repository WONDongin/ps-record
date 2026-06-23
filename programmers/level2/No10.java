package level2;
/*
문제: 다음 큰 숫자

문제 요약
- 자연수 n보다 큰 수 중에서 2진수로 변환했을 때 1의 개수가 같은 가장 작은 수를 찾는다.

접근 방법
- 현재 숫자 n의 1의 개수를 Integer.bitCount()로 구한다.
- n을 1씩 증가시키면서 1의 개수를 비교한다.
- 처음으로 1의 개수가 같은 숫자를 찾으면 반환한다.

핵심 아이디어
- 문제의 핵심은 숫자의 크기가 아니라 2진수에서 1의 개수이다.
- Integer.bitCount()를 사용하면 1의 개수를 쉽게 구할 수 있다.
- n보다 큰 수를 순차적으로 탐색하면서 조건을 만족하는 가장 작은 수를 찾는다.

주의할 점
- 단순히 다음 숫자를 찾는 것이 아니라 1의 개수가 같아야 한다.
- 조건을 만족하는 가장 작은 수를 찾아야 하므로 n + 1부터 순차 탐색해야 한다.

배운 점
- Integer.bitCount()를 활용하면 비트 연산 문제를 간결하게 해결할 수 있다.
- 2진수 문자열로 변환하지 않고도 1의 개수를 구할 수 있다는 점을 알게 되었다.
*/
public class No10 {
    public static void main(String[] args) {
        int n = 78;
        int num = Integer.bitCount(n);

        while (true){
            n++;

            if(num == Integer.bitCount(n)){
                System.out.println(n);
                break;
            }

        }
    }
}
