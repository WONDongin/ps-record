package no_4673;
/*
문제-4673 (실버5): 셀프 넘버
- 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력

주요 메서드

`d(int n)`
- 숫자 n과 각 자리수 합을 더해 생성자 값 계산
- % 10, / 10을 이용한 자리수 분해

주요 알고리즘

1. boolean[10001] 배열로 생성된 수 기록
2. 1 ~ 10000까지 순회하며 d(n) 계산
3. 생성되지 않은 수만 출력 → 셀프 넘버

시간 / 공간
- 시간복잡도: O(N log N) (자리수 분해)
- 공간복잡도: O(N)
*/
public class No4673 {

    // 생성자 함수 d(n): n + 각 자리수 합
    static int d(int n){
        int sum = n;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean[] generated  = new boolean[10001]; // 0 ~ 10000

        //  1~10000까지 돌며 생성되는 수 체크
        for(int i = 1; i <= 10000; i++){
            int g = d(i);
            if(g <= 10000){
                generated[g] = true;
            }
        }

        // 생성되지 않은 수(셀프 넘버) 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!generated[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }
}
