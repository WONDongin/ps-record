package level1;
/*
문제-없는 숫자 더하기

[문제 요약]
- 0 ~ 9까지 숫자 중 일부가 numbers 배열로 주어진다
- numbers에 없는 숫자들의 합을 구하는 문제

[접근 방법]
- 0 ~ 9의 총합은 45로 고정
- 배열에 존재하는 숫자들의 합을 먼저 구함
- 45 - 배열 합 계산

[핵심 아이디어]
- 불필요한 이중 반복문 없이 해결 가능
- 전체 합(45)을 이용하면 간단하게 처리 가능

[처리 흐름]
배열 순회 → 숫자 합 계산 → 45에서 차감 → 출력

[시간복잡도]
- O(N)
*/
public class No17 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,0};
        int answer = 0;

        for(int num : arr){
            answer += num;
        }

        System.out.println(45 - answer);
    }
}
