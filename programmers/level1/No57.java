package level1;
/*
문제: 기사단원의 무기

문제 요약
- 1번부터 number번 기사까지 각 번호의 약수 개수를 공격력으로 사용한다.
- 약수 개수가 limit을 초과하면 power 값으로 대체한다.
- 모든 무기를 만들기 위해 필요한 철의 총 무게를 구하는 문제이다.

접근 방법
- 1부터 number까지 반복하면서 각 숫자의 약수 개수를 구한다.
- 약수는 제곱근까지만 확인하여 짝이 되는 약수까지 함께 카운트한다.
- 구한 약수 개수가 limit보다 크면 power를 더하고, 아니면 약수 개수를 더한다.

핵심 아이디어
- 약수는 한 쌍으로 존재하므로 j가 i의 약수라면 i / j도 약수이다.
- 단, j와 i / j가 같은 경우는 같은 약수이므로 한 번만 카운트한다.
- 약수 개수를 구한 즉시 answer에 누적하면 별도 리스트가 필요 없다.

주의할 점
- 완전제곱수는 가운데 약수가 중복으로 세어지지 않도록 처리해야 한다.
- limit을 초과하는 경우에는 count가 아니라 power를 더해야 한다.

배운 점
- 약수 개수는 제곱근까지만 탐색해도 구할 수 있다.
- 불필요한 저장 없이 계산과 누적을 동시에 처리하면 코드가 더 간결해진다.
*/
public class No57 {
    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;
        int answer = 0;

        // 약수 구하기
        for(int i = 1; i <= number; i++){
            int count = 0;

            for(int j = 1; j * j <= i; j++){
                if(i % j == 0){
                    count++;

                    if(j != i / j){
                        count++;
                    }
                }
            }

            if(count > limit){
                answer += power;
            } else {
                answer += count;
            }
        }

        System.out.println(answer);
    }
}
