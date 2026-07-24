package level0;
/*
문제: 배열 원소의 길이

로직
- 배열의 모든 원소를 순서대로 확인한다.
- 현재 원소가 n과 같으면 result를 1 증가시킨다.
- 최종적으로 n이 등장한 횟수를 출력한다.

핵심 구현
- 향상된 for문을 사용해 array의 원소를 순회한다.
- if문으로 각 원소와 n이 같은지 비교한다.
- 값이 같을 때 result++로 개수를 누적한다.

포인트
- 배열 전체를 한 번 순회하므로 시간 복잡도는 O(N)이다.
- 원소의 개수만 세면 되므로 별도의 배열이나 컬렉션이 필요하지 않다.

회고
- 향상된 for문을 활용해 배열에서 특정 값이 등장하는 횟수를 간단하게 구할 수 있었다.
*/
public class No94 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int result = 0;

        for(int i : array){
            if(i == n){
                result++;
            }
        }

        System.out.println(result);
    }
}
