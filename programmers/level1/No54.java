package level1;
/*
문제: 옹알이 (2)

문제 요약

* 조카는 "aya", "ye", "woo", "ma" 네 가지 발음만 할 수 있다
* 여러 발음을 이어 붙여 단어를 만들 수 있다
* 같은 발음을 연속해서 사용하는 것은 불가능하다
* 발음 가능한 단어의 개수를 반환한다

접근 방법

* 문자열을 하나씩 순회한다
* 먼저 연속 발음(ayaaya, yeye, woowoo, mama)이 있는지 검사한다
* 연속 발음이 있으면 다음 문자열로 넘어간다
* 발음 가능한 문자열을 모두 공백으로 치환한다
* 치환 후 공백만 남아 있으면 발음 가능한 단어로 판단하여 answer를 증가시킨다

핵심 아이디어

* 발음 가능한 문자열을 제거했을 때 아무 문자도 남지 않으면 올바른 단어이다
* 연속 발음은 문제 조건상 허용되지 않으므로 먼저 제외한다
* replace()를 이용하면 문자열 조합 여부를 간단하게 검증할 수 있다

주의할 점

* 연속 발음 검사는 replace() 전에 수행해야 한다
* replace() 이후 공백만 남기 때문에 isBlank()로 최종 검증해야 한다
* 단순히 contains("aya") 여부만 확인하면 올바른 정답을 구할 수 없다

배운 점

* 문자열 검증 문제는 특정 패턴을 제거하는 방식으로 해결할 수 있다
* 예외 조건을 먼저 처리하면 이후 로직을 단순하게 만들 수 있다
* isBlank()를 활용하면 공백 문자열 여부를 쉽게 확인할 수 있다
*/
public class No54 {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            String str = babbling[i];

            if (str.contains("ayaaya") ||
                    str.contains("yeye") ||
                    str.contains("woowoo") ||
                    str.contains("mama")) {
                continue;
            }

            str = str.replace("aya", " ");
            str = str.replace("ye", " ");
            str = str.replace("woo", " ");
            str = str.replace("ma", " ");

            if (str.isBlank()) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
