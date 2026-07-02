package level1;
/*
문제: 체육복

로직
- 학생마다 체육복 개수를 저장할 배열을 생성하고 모두 1로 초기화한다.
- 도난당한 학생은 -1, 여벌이 있는 학생은 +1을 적용하여 현재 체육복 개수를 저장한다.
- 체육복이 없는 학생을 순회하면서 앞 학생에게 먼저 빌릴 수 있는지 확인하고, 없으면 뒤 학생에게 빌린다.
- 마지막으로 체육복이 1벌 이상인 학생 수를 계산한다.

핵심 구현
- student[lost[i]]--;
- student[reserve[i]]++;
- if (p > 1 && student[p - 1] == 2)
- else if (p < n && student[p + 1] == 2)

포인트
- 학생 번호를 그대로 사용하기 위해 배열 크기를 n + 1로 생성했다.
- 앞 학생을 우선 확인한 뒤 뒤 학생을 확인하는 그리디 방식으로 구현했다.
- student 배열 하나로 도난과 여벌 상태를 모두 관리하여 구현을 단순화했다.

회고
- 학생별 상태를 배열 하나로 관리하면 구현이 훨씬 간단해진다는 점을 배웠다.
- 그리디 문제는 현재 상황에서 가장 최선의 선택을 하는 것이 전체 최적해가 되는지를 먼저 판단하는 것이 중요했다.
*/
public class No69 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        int[] student = new int[n + 1];
        int answer = 0;

        // 모든 학생 체육복 1개
        for(int i = 1; i <= n; i++){
            student[i] = 1;
        }
        // 체육복 도난
        for(int j = 0 ; j < lost.length; j++){
            student[lost[j]] -= 1;
        }
        // 체육복 여유
        for(int k = 0; k < reserve.length; k++){
            student[reserve[k]] += 1;
        }

        for(int p = 1; p <= n; p++){
            // 체육복 없는 학생
            if(student[p] == 0){
                // 앞 학생에게 빌리기
                if(p > 1 && student[p - 1] == 2){
                    student[p]++;
                    student[p - 1]--;
                } else if(p < n && student[p + 1] == 2){
                    student[p]++;
                    student[p + 1]--;
                }
            }
        }

        // 체육복 있는 학생 수 출력
        for(int c : student){
            if(c >= 1) answer++;
        }

        System.out.println(answer);
    }
}
