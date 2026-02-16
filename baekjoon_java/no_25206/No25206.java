package no_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/*
문제-25206(실버5): 너의 평점은
- 20개 과목의 학점과 성적이 주어진다.
- 전공평점 = (학점 × 과목평점의 합) / (학점의 합)
- 단, 성적이 P인 과목은 계산에서 제외한다.

주요 메서드

- Map<String, Double> : 성적 → 점수 매핑
- sumScore += 학점 * 점수
- sumCredit += 학점
- printf("%.6f") : 소수점 6자리 출력

주요 알고리즘

- 반복문 20회 입력 처리
- P인 경우 continue
- 가중 평균 계산
- 시간 복잡도: O(1) (고정 20회)
- 공간 복잡도: O(1)

*/
public class No25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sumScore = 0;
        double sumCredit = 0;

        Map<String,Double> grade = new HashMap<>();
        grade.put("A+", 4.5);
        grade.put("A0", 4.0);
        grade.put("B+", 3.5);
        grade.put("B0", 3.0);
        grade.put("C+", 2.5);
        grade.put("C0", 2.0);
        grade.put("D+", 1.5);
        grade.put("D0", 1.0);
        grade.put("F", 0.0);

        for(int i = 0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명 (사용하지 않음)
            double credit = Double.parseDouble(st.nextToken());
            String gradeStr = st.nextToken();

            if(gradeStr.equals("P")){
                continue;
            }

            sumScore += credit * grade.get(gradeStr);
            sumCredit += credit;
        }

        System.out.printf("%.6f", sumScore / sumCredit);
    }
}
