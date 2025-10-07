package no_1931;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 문제 : 회의실 배정
public class No1931 {
    static class Meeting {
        int start, end;
        Meeting(int s, int e) { this.start = s; this.end = e; }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            meetings[i] = new Meeting(s, e);
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a.end != b.end) return Integer.compare(a.end, b.end);
            return Integer.compare(a.start, b.start);
        });

        int count = 0;
        int lastEnd = 0;

        for (Meeting m : meetings) {
            if (m.start >= lastEnd) {
                count++;
                lastEnd = m.end;
            }
        }

        System.out.println(count);
    }
}
