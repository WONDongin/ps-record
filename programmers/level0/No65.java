package level0;
/*
문제: 배열의 유사도

로직
- 첫 번째 문자열 배열을 순회한다.
- 두 번째 문자열 배열을 순회하며 같은 문자열이 있는지 비교한다.
- 같은 문자열을 찾으면 결과 값을 1 증가시킨다.

핵심 구현
- if (s1[i].equals(s))
- result++;

- 이중 반복문을 사용하여 두 배열의 모든 문자열을 비교한다.
- equals()를 사용해 문자열의 내용을 비교하고, 같은 문자열이면 result를 증가시킨다.

포인트
- 문자열 비교는 ==가 아닌 equals()를 사용해야 한다.
- 향상된 for문을 사용해 두 번째 배열을 간결하게 순회했다.
- 두 배열의 공통 문자열 개수를 그대로 결과로 반환한다.

회고
- 문자열 비교 시 equals()를 사용하는 이유를 다시 확인할 수 있었다.
- 이중 반복문으로도 해결할 수 있지만, 데이터가 많아진다면 HashSet을 활용하면 더 효율적으로 구현할 수 있다는 점을 배웠다.
*/
public class No65 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int result = 0;

        for(int i = 0; i < s1.length; i++){
            for(String s : s2){
                if(s1[i].equals(s)){
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
