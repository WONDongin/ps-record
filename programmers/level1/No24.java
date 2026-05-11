package level1;
/*
문제-70128: 내적

[문제 요약]
- 두 정수 배열의 같은 인덱스끼리 곱한 값을 모두 더한 결과 반환
- 배열 길이는 항상 동일

[접근 방법]
- 반복문을 사용하여 같은 인덱스의 값을 곱함
- 곱한 결과를 sum 변수에 누적

[핵심 아이디어]
- 내적(Dot Product)은
  각 원소를 순서대로 곱한 뒤 모두 더하는 방식
- A[i] * B[i] 값을 누적하면 정답

[처리 흐름]
반복문 실행
→ 같은 인덱스 값끼리 곱셈
→ sum에 누적
→ 최종 합 출력

[시간복잡도]
- O(N)
*/
public class No24 {
    public static void main(String[] args) {
        int[] A = {-1,0,1};
        int[] B = {1,0,-1};
        int sum = 0;

        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[i];
        }

        System.out.println(sum);
    }
}
