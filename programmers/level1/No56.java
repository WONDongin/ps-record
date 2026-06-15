package level1;

import java.util.HashSet;
import java.util.Set;
/*
문제: 폰켓몬

문제 요약
- N마리의 폰켓몬 중 N/2마리를 선택할 수 있다.
- 최대한 다양한 종류의 폰켓몬을 선택했을 때 가질 수 있는 종류 수를 구하는 문제이다.

접근 방법
- HashSet을 사용하여 중복을 제거하고 폰켓몬 종류의 개수를 구한다.
- 선택 가능한 폰켓몬 수는 nums.length / 2 이다.
- 실제 선택 가능한 최대 종류 수는 "종류 개수"와 "선택 가능 마리 수" 중 작은 값이 된다.

핵심 아이디어
- 같은 종류를 여러 마리 가지고 있어도 종류 수는 증가하지 않는다.
- 따라서 중복 제거 후 종류 개수만 구하면 된다.
- 정답은 Math.min(종류 수, 선택 가능 마리 수)로 계산할 수 있다.

주의할 점
- 폰켓몬 개수가 아닌 종류 개수를 구해야 한다.
- 모든 조합을 구할 필요 없이 중복 제거만으로 해결 가능하다.

배운 점
- HashSet을 사용하면 중복 제거를 간단하게 처리할 수 있다.
- 문제의 핵심 조건을 파악하면 조합 문제처럼 보이지만 훨씬 간단하게 해결할 수 있다.
*/
public class No56 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};

        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        System.out.println(Math.min(set.size(), nums.length / 2));
    }
}
