package level1;
/*
문제-삼총사: 세 수의 합이 0인 경우 찾기

[문제 요약]
- 학생들의 번호 배열이 주어짐
- 서로 다른 학생 3명의 번호 합이 0이면 삼총사
- 가능한 모든 삼총사 조합 개수 출력

[접근 방법]
- 서로 다른 3명을 선택하는 모든 경우 탐색
- 3중 반복문을 사용하여 조합 생성
- 세 수의 합이 0이면 count 증가

[핵심 아이디어]
- 브루트포스(완전탐색) 활용
- 중복 없는 조합 생성을 위해
  j = i + 1
  k = j + 1 방식 사용

[처리 흐름]
첫 번째 학생 선택
→ 두 번째 학생 선택
→ 세 번째 학생 선택
→ 세 수의 합 확인
→ 0이면 count 증가

[시간복잡도]
- O(N³)
- N 최대 13이라 충분히 가능
*/
public class No36 {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        int count = 0;

        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                for(int k = j + 1; k < number.length; k++){

                    if(number[i] + number[j] + number[k] == 0){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
