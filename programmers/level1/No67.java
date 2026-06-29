package level1;

import java.util.Arrays;
/*
문제: 로또의 최고 순위와 최저 순위

로직
- 로또 번호를 순회하며 0의 개수와 당첨 번호 일치 개수를 계산한다.
- 0은 어떤 번호로도 바뀔 수 있으므로 최고 순위는 (일치 개수 + 0의 개수)로 계산한다.
- 최저 순위는 현재 일치 개수를 그대로 사용한다.

핵심 구현
- 핵심 코드
  if (lotto == 0) {
      zero++;
      continue;
  }

  for (int w : win_nums) {
      if (lotto == w) {
          win++;
          break;
      }
  }

- 핵심 코드
  int[] result = {getRank(zero + win), getRank(win)};

- 핵심 코드
  static int getRank(int count) {
      return Math.min(6, 7 - count);
  }

- 0의 개수와 일치 개수를 각각 계산한 뒤 최고/최저 순위를 구했다.
- 순위 변환은 Math.min(6, 7 - count) 공식을 사용하여 조건문 없이 처리했다.

포인트
- 향상된 for문을 사용해 배열을 간결하게 순회했다.
- 0은 비교 대상이 아니므로 continue로 불필요한 반복을 제거했다.
- 당첨 번호를 찾으면 break를 사용해 중복 비교를 방지했다.
- 순위 계산을 별도 메서드로 분리하여 재사용성과 가독성을 높였다.

회고
- 처음에는 순위를 조건문으로 모두 작성했지만, 규칙을 찾아 Math.min(6, 7 - count)로 단순화할 수 있었다.
- 구현 문제에서도 반복되는 규칙을 찾아 수식으로 치환하면 코드가 훨씬 간결해진다는 점을 배웠다.
*/
public class No67 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int zero = 0;
        int win = 0;

        for(int lotto : lottos){
            if(lotto == 0){
                zero++;
                continue;
            }

            for(int w : win_nums){
                if(lotto == w){
                    win++;
                    break;
                }
            }
        }

        int[] result = {getRank(zero + win), getRank(win)};

        System.out.println(Arrays.toString(result));
    }

    static int getRank(int count) {
        return Math.min(6, 7 - count);
    }
}
