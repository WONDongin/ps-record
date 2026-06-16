package level1;
/*
문제: 덧칠하기

- 벽에서 다시 칠해야 하는 구역들이 주어진다.
- 길이 m인 롤러로 칠해야 할 구역을 모두 포함하도록 최소 횟수를 구한다.

접근 방법

- section 배열을 왼쪽부터 순회한다.
- 현재 구역이 이미 칠해진 범위 안에 있으면 넘어간다.
- 칠해진 범위를 벗어난 구역을 만나면 그 구역부터 롤러를 한 번 사용한다.

핵심 아이디어

- end를 현재까지 칠해진 마지막 구역으로 관리한다.
- s > end인 경우에만 새로 칠하면 된다.
- 새로 칠하면 end는 s + m - 1로 갱신한다.

주의할 점

- n은 벽의 길이를 의미하지만, 최소 횟수 계산에서는 직접 사용하지 않아도 된다.
- section이 오름차순으로 정렬되어 있기 때문에 앞에서부터 한 번만 확인하면 된다.

배운 점

- 필요한 구역만 순회하면서 현재 칠해진 범위를 관리하면 효율적으로 문제를 해결할 수 있다.
*/
public class No59 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        int end = 0;
        int answer = 0;

        for(int s : section){
            if(s > end){
                answer++;
                end = s + m - 1;
            }
        }

        System.out.println(answer);
    }
}
