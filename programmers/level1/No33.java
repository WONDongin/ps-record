package level1;
/*
문제-12940: 최대공약수와 최소공배수

[문제 요약]
- 두 수 n, m의 최대공약수와 최소공배수를 구하는 문제
- 결과는 [최대공약수, 최소공배수] 형태의 배열로 반환

[접근 방법]
- 유클리드 호제법을 이용하여 최대공약수(GCD) 계산
- 최소공배수(LCM)는
  (n * m) / gcd 공식 사용

[핵심 아이디어]
- 최대공약수:
  두 수를 나눈 나머지를 반복적으로 계산
- 최소공배수:
  두 수의 곱을 최대공약수로 나누면 구할 수 있음

[처리 흐름]
GCD 계산
→ 최소공배수 계산
→ int[] 배열 반환

[시간복잡도]
- O(log N)
  (유클리드 호제법)
*/
public class No33 {
    class Solution {
        public int[] solution(int n, int m) {

            int gcd = getGCD(n, m);

            return new int[]{
                    gcd,
                    (n * m) / gcd
            };
        }

        public static int getGCD(int n, int m){
            if(n % m == 0){
                return m;
            }

            return getGCD(m, n % m);
        }
    }
}
