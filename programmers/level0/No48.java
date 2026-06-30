package level0;

import java.util.Arrays;
/*
문제: 분수의 덧셈

로직
- 두 분수의 통분을 통해 분자와 분모를 계산한다.
- 최대공약수(GCD)를 구해 분자와 분모를 각각 나누어 기약분수로 만든다.

핵심 구현
- 핵심 코드
  int numer = numer1 * denom2 + numer2 * denom1;
  int denom = denom1 * denom2;

- 핵심 코드 설명
  두 분수를 공통 분모로 통분하여 새로운 분자와 분모를 계산한다.

- 핵심 코드
  int gcd = gcd(numer, denom);

- 핵심 코드 설명
  유클리드 호제법으로 최대공약수를 구한 뒤 분자와 분모를 나누어 기약분수로 만든다.

포인트
- 분수의 덧셈은 먼저 통분을 해야 한다.
- 최대공약수를 이용하면 기약분수로 간단하게 만들 수 있다.
- 유클리드 호제법은 최대공약수를 효율적으로 구하는 대표적인 알고리즘이다.

회고
- 통분 공식과 최대공약수만 이해하면 어렵지 않은 구현 문제였다.
- 유클리드 호제법을 다시 한번 익힐 수 있는 문제였다.
*/
public class No48 {
    public static void main(String[] args) {
        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int gcd = gcd(numer, denom);

        int[] answer = {numer / gcd, denom / gcd};

        System.out.println(Arrays.toString(answer));
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
