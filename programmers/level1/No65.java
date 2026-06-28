package level1;
/*
문제: 동영상 재생기

문제 요약
- 동영상 재생 위치에서 prev, next 명령을 수행한다.
- 현재 위치가 오프닝 구간에 포함되면 자동으로 오프닝 종료 시점으로 이동한다.
- 모든 명령 수행 후 최종 재생 위치를 "mm:ss" 형식으로 반환한다.

접근 방법
- 시간을 모두 초(second) 단위의 정수로 변환하여 계산한다.
- 시작 위치가 오프닝 구간인지 먼저 확인한 후 오프닝 종료 위치로 이동한다.
- commands를 순회하며 prev, next 명령을 수행한다.
- 명령 수행 후마다 현재 위치가 오프닝 구간인지 다시 확인하여 op_end로 이동시킨다.
- 마지막에 초 단위를 다시 "mm:ss" 형식으로 변환하여 반환한다.

핵심 아이디어
- 문자열 시간은 계산하기 어려우므로 초 단위 정수로 변환한다.
- prev : Math.max(0, pos - 10)
- next : Math.min(videoLen, pos + 10)
- 이동이 끝날 때마다 현재 위치가 op_start ~ op_end 사이인지 확인한다.

주의할 점
- 명령 수행 전 시작 위치도 오프닝 구간인지 확인해야 한다.
- 오프닝 판별 조건은 op_start <= pos && pos <= op_end 이다.
- next는 영상 길이를 넘지 않도록 처리해야 한다.
- prev는 0초보다 작아지지 않도록 처리해야 한다.

배운 점
- 문자열 시간을 초 단위로 변환하면 조건 처리와 계산이 매우 단순해진다.
- 공통으로 수행되는 오프닝 체크는 별도 메서드로 분리하면 코드 중복을 줄일 수 있다.
*/
public class No65 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
                int videoLen = toSecond(video_len);
                int current = toSecond(pos);
                int opStart = toSecond(op_start);
                int opEnd = toSecond(op_end);

                current = skipOpening(current, opStart, opEnd);

                for (String command : commands) {
                    if (command.equals("prev")) {
                        current = Math.max(0, current - 10);
                    } else {
                        current = Math.min(videoLen, current + 10);
                    }

                    current = skipOpening(current, opStart, opEnd);
                }

                return toTime(current);
            }

            private int toSecond(String time) {
                String[] arr = time.split(":");
                return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
            }

            private int skipOpening(int current, int opStart, int opEnd) {
                if (opStart <= current && current <= opEnd) {
                    return opEnd;
                }

                return current;
            }

            private String toTime(int second) {
                int min = second / 60;
                int sec = second % 60;

                return String.format("%02d:%02d", min, sec);
            }
        }
    }
}
