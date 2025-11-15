package No1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1475 (실버5): 방번호
- 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오. (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

주요 메서드 및 알고리즘

1. 역할별로 메서드 분리
- countDigits
- calculateSixNineSets
- findMaxDigitCount

2. 상수 사용
- “6”, “9”, “10” 등 매직 넘버 제거 (유지보수성)

3. 예외 처리
- try/catch 내부에서 메시지 출력
- main 함수가 불필요하게 throws 하지 않음

4. 네이밍
- 변수명/메서드명이 동사+명사 형태 또는 역할 중심 (협업 시 가독성 증가)
*/
public class No1475 {

    private static final int DIGITS = 10;
    private static final int SIX = 6;
    private static final int NINE = 9;

    public static void main(String[] args) {
        try {
            String roomNumber = inputRoomNumber();
            int result = calculateRequiredSets(roomNumber);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("입력 처리 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    // 사용자 입력
    private static String inputRoomNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().trim();
    }

    // 필요한 세트 개수 계산
    private static int calculateRequiredSets(String roomNumber) {
        int[] digitCount = countDigits(roomNumber);
        int sixNineSetCount = calculateSixNineSets(digitCount);

        return Math.max(sixNineSetCount, findMaxDigitCount(digitCount));
    }

    // 각 숫자 개수 세기
    private static int[] countDigits(String roomNumber) {
        int[] count = new int[DIGITS];

        for (char c : roomNumber.toCharArray()) {
            count[c - '0']++;
        }
        return count;
    }

    // 6, 9 뒤집에서 사용가능 한 세트로 계산
    private static int calculateSixNineSets(int[] count) {
        int total = count[SIX] + count[NINE];
        return (total + 1) / 2;
    }

    // 6, 9 제외한 숫자 중 최댓값
    private static int findMaxDigitCount(int[] count) {
        int max = 0;

        for (int i = 0; i < DIGITS; i++) {
            if (i == SIX || i == NINE) {
                continue;
            }
            max = Math.max(max, count[i]);
        }
        return max;
    }
}