package level0;
/*
문제: 영어로 표기된 숫자

로직
- zero부터 nine까지의 영어 단어를 숫자 문자로 바꾼다.
- 변환된 문자열을 숫자로 반환한다.

핵심 구현
- 숫자 단어를 배열에 0부터 9까지 순서대로 저장한다.
- 각 단어를 해당 숫자 문자로 치환한다.
- 최종 문자열을 Long.parseLong()으로 변환한다.

포인트
- 숫자 단어 사이에 공백이 없어도 문자열 치환으로 처리할 수 있다.
- 결과가 int 범위를 넘을 수 있으므로 long으로 반환한다.

회고
- 단어를 직접 하나씩 끊어 읽지 않고, 각 숫자 단어를 치환해 간단하게 해결했다.
- 문자열로 숫자를 모두 만든 뒤 한 번에 정수로 변환했다.
*/
public class No221 {
    class Solution {
        public long solution(String numbers) {
            String[] words = {
                    "zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine"
            };

            for (int i = 0; i < words.length; i++) {
                numbers = numbers.replace(words[i], String.valueOf(i));
            }

            return Long.parseLong(numbers);
        }
    }
}
