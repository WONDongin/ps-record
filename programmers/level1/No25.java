package level1;
/*
문제-77884: 약수의 개수와 덧셈

[문제 요약]
- left ~ right 범위 숫자를 순회
- 약수 개수가 짝수이면 더하기
- 약수 개수가 홀수이면 빼기
- 최종 합 반환

[접근 방법]
- 처음에는 약수 개수를 직접 구해서 판별
- 완전제곱수는 약수 개수가 홀수라는 특징 활용
- Math.sqrt() 를 사용해 완전제곱수 여부만 판별하도록 최적화

[핵심 아이디어]
- 약수는 일반적으로 쌍으로 존재
- 완전제곱수는 루트 값이 자기 자신과 겹침

  1 × 16
  2 × 8
  4 × 4

- 따라서 완전제곱수만 약수 개수가 홀수

[처리 흐름]
left ~ right 반복
→ 완전제곱수 판별
→ 완전제곱수면 빼기
→ 아니면 더하기
→ 최종 합 반환

[시간복잡도]
- O(N)
*/
public class No25 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int sum = 0;

        for(int i = left; i <= right; i++){
            if(isPerfectSquare(i)){
                sum -= i;
            } else {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public  static boolean isPerfectSquare(int num){
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
