package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
/*
문제 : 정수 n이 주어질 때, n의 모든 약수를 더한 값을 반환하는 함수를 작성하라.

약수 정의 : 어떤 수 n을 나누어떨어지게 하는 수 i → n % i == 0

단순 반복문 풀이 (O(n))
- 1부터 n까지 순회하며 약수인 수만 더함
- 리스트(List) 불필요 (약수는 중복되지 않음)
public int solution(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) sum += i;
    }
    return sum;
}

최적화 풀이 (O(√n))
- √n까지만 검사하여 시간 단축
- 중복 약수(√n) 방지 처리
public int solution(int n) {
    int sum = 0;
    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            sum += i;
            if (i != n / i) sum += n / i; // 짝이 되는 약수 더함
        }
    }
    return sum;
}

- 약수 (Divisor)
- 반복문 / 나머지 연산
- 시간 복잡도 최적화 (√n)
- List 불필요 (중복 없음)
*/
public class No4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) sum += N / i; // 짝이 되는 약수도 더함
            }
        }
        System.out.println(sum);
        // IntStream.rangeClosed(1, N).filter(v -> N % v == 0).sum();
    }
}
