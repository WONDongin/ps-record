package level0;
/*
문제: 홀짝에 따라 다른 값 반환하기

로직
- n이 짝수인지 홀수인지 확인한다.
- 짝수라면 2부터 n까지 짝수의 제곱을 모두 더한다.
- 홀수라면 1부터 n까지 홀수의 합을 구한다.

핵심 구현
- if (n % 2 == 0)
- n의 홀짝 여부에 따라 반복문의 시작값과 계산식을 분기 처리했다.

포인트
- 반복문의 증가값을 2로 설정해 필요한 숫자만 순회했다.
- 짝수는 제곱의 합, 홀수는 합계를 계산하도록 구현했다.

회고
- 조건에 따라 반복문의 시작값과 계산식을 변경하면 불필요한 연산 없이 효율적으로 문제를 해결할 수 있다는 점을 배웠다.
*/
public class No80 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;

        if(n % 2 == 0){
            for(int i = 2; i <= n; i += 2){
                System.out.println(i);
                answer += i * i;
            }
        } else {
            for(int i = 1; i <= n; i += 2){
                answer += i;
            }
        }

        System.out.println(answer);
    }
}
