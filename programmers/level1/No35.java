package level1;

import java.util.Arrays;
/*
문제-예산: 부서별 물품 지원

[문제 요약]
- 각 부서가 신청한 금액 배열이 주어짐
- 제한된 예산 내에서 최대한 많은 부서를 지원해야 함
- 신청 금액은 부분 지원이 불가능하며 반드시 전액 지원해야 함

[접근 방법]
- 금액이 작은 부서부터 지원하는 것이 가장 많은 부서를 지원할 수 있는 방법
- 배열을 오름차순 정렬 후 순차적으로 예산 차감

[핵심 아이디어]
- Greedy(그리디) 알고리즘 활용
- 작은 금액부터 처리하면 최대로 많은 부서를 지원 가능

[처리 흐름]
배열 정렬
→ 작은 금액부터 확인
→ 예산 가능 시 차감
→ 지원 부서 수 증가
→ 예산 부족 시 종료

[시간복잡도]
- 정렬: O(N log N)
- 탐색: O(N)
- 총합: O(N log N)
*/
public class No35 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3};
        int budget = 10;
        int result = 0;

        Arrays.sort(arr);

        for(int money : arr){
            if(budget < money){
                break;
            }
            budget -= money;
            result++;
        }

        System.out.println(result);
    }
}
