package level0;
/*
문제: 원소들의 곱과 합

로직
- 배열을 순회하면서 모든 원소의 곱과 합을 구한다.
- 모든 원소의 곱과 합의 제곱을 비교한다.
- 원소의 곱이 합의 제곱보다 작으면 1, 아니면 0을 반환한다.

핵심 구현
- 원소의 곱: product *= num
- 원소의 합: sum += num
- 결과 비교: product < sum * sum ? 1 : 0

포인트
- 곱셈의 초깃값은 1, 덧셈의 초깃값은 0으로 설정한다.
- 향상된 for문을 사용해 배열의 원소를 간단하게 순회한다.
- 별도의 변수 없이 삼항 연산자로 비교 결과를 반환한다.

회고
- 변수명을 product와 sum으로 작성하여 각 변수의 역할을 명확하게 표현했다.
- 합의 제곱을 별도로 저장하지 않고 비교식에서 바로 계산해 코드를 간결하게 만들었다.
*/
public class No90 {
    public static void main(String[] args) {
        int[] num_list = {5, 7, 8, 3};
        int x = 1;
        int sum = 0;

        for(int n : num_list){
            x *= n;
            sum += n;
        }

        System.out.println(x < sum * sum ? 1 : 0);
    }
}
