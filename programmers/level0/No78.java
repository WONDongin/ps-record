package level0;
/*
문제: 홀수 vs 짝수

로직
- 배열을 순회하며 짝수와 홀수를 구분한다.
- 짝수는 even, 홀수는 odd StringBuilder에 이어 붙인다.
- 완성된 문자열을 정수로 변환한 뒤 두 값을 더해 출력한다.

핵심 구현
- (num % 2 == 0 ? even : odd).append(num);
- 삼항 연산자를 사용해 짝수와 홀수를 구분하여 각각의 StringBuilder에 값을 추가하도록 구현했다.

포인트
- 향상된 for문을 사용해 인덱스 없이 배열을 순회했다.
- StringBuilder를 활용해 문자열을 효율적으로 생성했다.
- 삼항 연산자를 활용해 if-else 문을 한 줄로 간결하게 표현했다.
- toString()으로 문자열을 얻은 뒤 Integer.parseInt()를 이용해 정수로 변환했다.

회고
- StringBuilder와 삼항 연산자를 함께 사용하면 코드가 더욱 간결해질 수 있다는 점을 배웠다.
- 단순히 정답을 구현하는 것뿐만 아니라 가독성과 코드의 간결함도 함께 고려하는 습관이 중요하다는 것을 느꼈다.
*/
public class No78 {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 2, 1};

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int num : numList) {
            (num % 2 == 0 ? even : odd).append(num);
        }

        System.out.println(Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString()));
    }
}
