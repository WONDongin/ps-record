package no_11557;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 문제 11557 (브론즈 1): Yangjojang of The Year
 - 여러 테스트 케이스가 주어짐
 - 각 테스트 케이스마다 학교 이름과 술 소비량이 주어짐
 - 가장 술 소비량이 많은 학교의 이름을 출력

해결 전략
 - Map 없이 입력을 받으면서 최대값을 즉시 비교
 - 테스트 케이스마다 최대값 변수 초기화 (상태 공유 방지)

핵심 포인트
 - 테스트 케이스 단위로 변수를 초기화하지 않으면 이전 결과가 영향을 미침
 - 이는 실무에서 Stateless 원칙 위반 버그로 이어질 수 있음
 */
public class No11557 {
    public static void main(String[] args) throws IOException {

        // 입력을 빠르게 처리하기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());

        // 테스트 케이스 반복
        for (int i = 0; i < t; i++) {

            // 학교 수
            int n = Integer.parseInt(br.readLine());

            // 현재 테스트 케이스에서의 최대 소비 학교 정보
            String maxSchool = "";
            int maxDrink = 0;

            // 학교 정보 입력 처리
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String school = st.nextToken();     // 학교 이름
                int drink = Integer.parseInt(st.nextToken()); // 술 소비량

                // 최대 소비량 갱신
                if (maxDrink < drink) {
                    maxDrink = drink;
                    maxSchool = school;
                }
            }

            // 해당 테스트 케이스 결과 출력
            System.out.println(maxSchool);
        }
    }
}
