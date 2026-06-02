package level1;
/*
문제: 프로그래머스 - 숫자 문자열과 영단어
난이도: Level 1

문제 요약
- 숫자와 영단어(zero ~ nine)가 섞인 문자열이 주어진다.
- 영단어를 숫자로 변환하여 원래 숫자를 반환하는 문제.

접근 방법
- 숫자에 대응하는 영단어를 배열에 저장한다.
- replace()를 이용하여 영단어를 숫자로 치환한다.
- 모든 치환이 끝난 문자열을 Integer.parseInt()로 변환한다.

핵심 아이디어
- 배열의 인덱스(0~9)를 숫자로 활용한다.
- words[0] = "zero", words[1] = "one" ...
- 반복문으로 영단어를 순회하며 숫자 문자열로 변경한다.

주요 메서드
- String.replace()
- String.valueOf()
- Integer.parseInt()

처리 흐름
입력 문자열
    ↓
영단어 배열 순회
    ↓
replace()로 숫자 치환
    ↓
모든 영단어 변환 완료
    ↓
Integer.parseInt()
    ↓
결과 반환
*/
public class No45 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i  <  words.length; i++){
            s = s.replace(words[i], String.valueOf(i));
        }

        System.out.println(s);
    }
}
