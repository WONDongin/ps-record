package level1;
/*
문제 : [PCCE 기출문제] 7번 / 가습기
상우가 사용하는 가습기에는 "auto", "target", "minimum"의 세 가지 모드가 있습니다.
가습기의 가습량은 0~5단계로 구분되며 각 모드 별 동작 방식은 다음과 같습니다.

"auto" 모드
습도가 0 이상 10 미만인 경우 : 5단계
습도가 10 이상 20 미만인 경우 : 4단계
습도가 20 이상 30 미만인 경우 : 3단계
습도가 30 이상 40 미만인 경우 : 2단계
습도가 40 이상 50 미만인 경우 : 1단계
습도가 50 이상인 경우 : 0단계

"target" 모드
습도가 설정값 미만일 경우 : 3단계
습도가 설정값 이상일 경우 : 1단계

"minimum"모드
습도가 설정값 미만일 경우 : 1단계
습도가 설정값 이상일 경우 : 0단계

상우가 설정한 가습기의 모드를 나타낸 문자열 mode_type,
현재 공기 중 습도를 나타낸 정수 humidity,
설정값을 나타낸 정수 val_set이 주어질 때
현재 가습기가 몇 단계로 작동 중인지 return

주요 알고리즘
조건문 기반 분기 처리
- if-else 조건문을 통해 모드별로 적절한 로직 선택
*/
public class No11 {
    public static void main(String[] args) {
        No11 controller = new No11();

        // 테스트 입력값 설정
        String mode_type = "auto";
        int humidity = 35;
        int val_set = 40;

        // solution 메서드 호출
        int result = controller.solution(mode_type, humidity, val_set);

        // 결과 출력
        System.out.println("Result: " + result);
    }
    // "target" 모드
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3;
        return 1;
    }
    // "auto" 모드
    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else
            return 5;
    }
    // "target" 모드
    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0;
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity);
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity,  val_set);
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}