package level1;
/*
문제-서울에서 김서방 찾기: 문자열 배열 탐색

[문제 요약]
- 문자열 배열 seoul에서 "Kim"의 위치를 찾는 문제
- 찾은 인덱스를 이용해
  "김서방은 x에 있다" 형식으로 출력

[접근 방법]
- 배열을 처음부터 순회
- 현재 값이 "Kim"인지 비교
- 찾으면 해당 인덱스 출력 후 종료

[핵심 아이디어]
- 인덱스가 필요한 문제이므로 일반 for문 사용
- equals()로 문자열 비교
- 찾은 뒤 break로 반복 종료

[처리 흐름]
배열 순회
→ 현재 문자열 비교
→ "Kim"이면 인덱스 출력
→ break 종료

[시간복잡도]
- O(N)
- 배열을 한 번 순회
*/
public class No19 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                System.out.println("김서방은 " + i + "에 있다");
                break;
            };
        }
    }
}
