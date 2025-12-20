package no_28702;

import java.util.Scanner;

/*
문제: 백준 28702번 - FizzBuzz (브론즈1)

입력: 3줄의 FizzBuzz 결과 문자열이 주어짐
출력: 다음 수(i+3)에 대한 FizzBuzz 결과를 출력

규칙:
- 3의 배수 && 5의 배수: FizzBuzz
- 3의 배수: Fizz
- 5의 배수: Buzz
- 아니면 숫자 그대로 출력

주요 메서드

1. main()
- 입력 처리: 3줄 문자열 입력

- 기준 숫자 추론:
    - Integer.parseInt()로 숫자인지 판단
    - 위치에 따라 i 계산 (ex. 마지막 줄이 숫자이면 기준은 i = s3 - 2)

- FizzBuzz 결과 출력:
    - target = i + 3에 대해 출력
    - 3과 5의 공배수는 "FizzBuzz"부터 체크 (우선순위 주의)
*/
public class No28702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[3];

        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextLine();
        }

        int base = -1;
        for (int i = 2; i >= 0; i--) {
            try {
                base = Integer.parseInt(input[i]) - i;
                break;
            } catch (NumberFormatException ignored) {}
        }

        int target = base + 3;

        if (target % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (target % 3 == 0) {
            System.out.println("Fizz");
        } else if (target % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(target);
        }
    }
}
