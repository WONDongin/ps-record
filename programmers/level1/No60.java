package level1;
/*
문제: 소수 만들기

- 숫자 3개를 선택
- 합이 소수인 경우 개수 반환

접근 방법
- 3중 for문으로 조합 생성
- 합 계산
- 소수 판별 후 카운트

핵심 아이디어
- i < j < k로 중복 제거
- 소수 판별은 √N까지만 검사

주의할 점
- 1은 소수가 아님
- 같은 인덱스 중복 선택 불가

배운 점
- 조합 생성 방법
- 제곱근을 활용한 소수 판별
*/
public class No60 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }

    // 소수 판별
    public static boolean isPrime(int num) {
        // 1 필터링
        if (num < 2) return false;

        // 짝수 필터링
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
