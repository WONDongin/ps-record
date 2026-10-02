package level0;
/*
문제: 저주의 숫자 3

로직
- 숫자를 1부터 하나씩 증가시킨다.
- 현재 숫자가 3의 배수이거나 숫자 3을 포함하면 건너뛴다.
- 두 조건에 해당하지 않는 숫자를 찾을 때마다 count를 증가시킨다.
- count가 n이 되면 현재 숫자를 반환한다.

핵심 구현
- number % 3 == 0으로 3의 배수인지 확인한다.
- String.valueOf(number).contains("3")으로 숫자 3의 포함 여부를 확인한다.
- 사용할 수 없는 숫자는 continue를 사용하여 제외한다.
- 사용할 수 있는 숫자의 개수를 count로 관리한다.

포인트
- 3의 배수뿐만 아니라 숫자 안에 3이 포함된 경우도 제외해야 한다.
- number는 실제 숫자를 의미하고 count는 3x 마을에서의 순서를 의미한다.
- 두 조건 중 하나라도 만족하면 사용할 수 없는 숫자이다.

회고
- 실제 숫자를 순서대로 확인하면서 사용할 수 있는 숫자의 개수를 세었다.
- 숫자를 문자열로 변환하여 3이 포함되어 있는지 간단하게 확인했다.
*/
public class No189 {
    class Solution {
        public int solution(int n) {
            int number = 0;
            int count = 0;

            while (count < n) {
                number++;

                if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                    continue;
                }

                count++;
            }

            return number;
        }
    }
}
