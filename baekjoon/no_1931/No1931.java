package no_1931;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//문제 : 회의실 배정
/*
주어진 회의들의 시작시간과 종료시간이 있을 때,
한 회의실에서 가장 많은 회의를 진행할 수 있는 최대 개수를 구하는 문제

핵심 아이디어: "그리디 알고리즘"
- 회의가 일찍 끝나는 순서대로 정렬하면, 더 많은 회의를 배정할 수 있음.

| **입력 처리**       | `BufferedReader` + `StringTokenizer`   | 빠르게 입력받기 위한 조합                |
| **Meeting 클래스** | `static class Meeting`                 | 각 회의의 시작/종료 시간을 저장하는 데이터 구조   |
| **정렬**          | `Arrays.sort(meetings, (a, b) -> ...)` | 회의를 종료 시간 기준으로 정렬 (그리디 핵심 부분) |
| **회의 선택 로직**    | `if (m.start >= lastEnd)`              | 이전 회의가 끝난 이후 시작하는 회의만 선택      |
| **출력**          | `System.out.println(count)`            | 최대 배정 가능한 회의 수 출력             |

그리디 전략 (Greedy Algorithm)
→ “끝나는 시간이 가장 이른 회의”를 우선적으로 선택
→ 가능한 한 많은 회의를 배정 가능

시간 복잡도 :입력 정렬 때문에 O(N log N)
공간 복잡도 : 회의 배열 저장을 위한 O(N)
*/
public class No1931 {

    // 회의 정보를 저장하는 내부 클래스
    static class Meeting {
        int start, end;

        Meeting(int s, int e) {
            this.start = s;  // 시작 시간
            this.end = e;    // 종료 시간
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 회의 개수 입력
        int N = Integer.parseInt(br.readLine().trim());

        // 회의 정보를 담을 배열 생성
        Meeting[] meetings = new Meeting[N];

        // 각 회의의 시작/종료 시간 입력받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            meetings[i] = new Meeting(s, e);
        }

        // 정렬 기준
        // 1. 종료 시간이 빠른 순으로
        // 2. 종료 시간이 같다면 시작 시간이 빠른 순으로 정렬
        Arrays.sort(meetings, (a, b) -> {
            if (a.end != b.end) return Integer.compare(a.end, b.end);
            return Integer.compare(a.start, b.start);
        });

        int count = 0;     // 배정된 회의 개수
        int lastEnd = 0;   // 마지막으로 배정된 회의의 종료 시간

        // 회의 선택
        for (Meeting m : meetings) {
            // 현재 회의의 시작 시간이 마지막 회의 종료 시간 이후라면 배정 가능
            if (m.start >= lastEnd) {
                count++;
                lastEnd = m.end; // 종료 시간을 업데이트
            }
        }

        // 최종 배정 가능한 회의 개수 출력
        System.out.println(count);
    }
}
