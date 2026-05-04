package level1;
/*
문제-프로그래머스: 음양 더하기

[문제 요약]
- 정수 배열 absolutes와 boolean 배열 signs가 주어짐
- signs[i]가 true면 양수, false면 음수로 처리
- 최종 합을 구하는 문제

[접근 방법]
- 배열을 순회하면서 signs 값에 따라 더하기/빼기 수행

[핵심 아이디어]
- boolean 값을 이용해 부호를 결정
- 삼항 연산자를 사용하면 코드 간결화 가능

[처리 흐름]
입력 배열 → 반복문 순회 → 부호 판단 → 누적 합 계산 → 결과 출력

[시간복잡도]
- O(N)
*/
public class No16 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++){
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }

        System.out.println(answer);
    }
}
