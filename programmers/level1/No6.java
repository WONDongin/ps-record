package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제 : 자연수 뒤집기 (입력 → 배열 변환)

웹/서버 환경 (Spring, REST API)
- 사용자 입력은 HTTP 요청(request body or parameter)
- 사용자로부터 입력받은 자연수를 역순(int 배열) 으로 변환하는 기능 구현.
예: 입력 12345 → 출력 [5, 4, 3, 2, 1]


주요 메서드 및 역할
1. main(String[] args)
- 콘솔 입력(BufferedReader)을 통해 사용자 입력 수신
- 입력값 유효성 검사 : `input.matches("\\d+")` : 숫자 외 문자 차단
- 유효 입력이면 `solution()` 호출
- 결과 배열을 `Arrays.toString()`으로 문자열 변환 후 출력

2️. solution(String input)
핵심 로직 (문자열 → 역순 배열 변환)

처리 순서:
- 입력 문자열 길이만큼 int[] 배열 생성
- `charAt()`으로 각 자리 문자 추출
- 뒤에서부터 읽어와 앞에서부터 배열에 저장
- 문자 '0'을 빼서 실제 숫자(int)로 변환
- 결과 배열 반환

3️. 예외 처리
- `try-with-resources` 문법 사용 → `BufferedReader` 자동 닫힘 보장
- `IOException` 발생 시 사용자 친화적 메시지 출력

코드 품질 포인트
- 가독성: 명확한 변수명(input, reversed, result)
- 안정성: 정규식 기반 입력 검증
- 확장성: 메서드 분리로 로직 재사용 가능
- 표준 자바 스타일: try-with-resources, 명확한 예외 처리


웹/서버 환경에서도 동일 로직을 재활용할 수 있도록
- solution()은 순수 함수 형태로 설계됨.
예: Spring REST API Controller에서 @GetMapping("/reverse")로 변환 가능.

웹/서버 환경 (Spring, REST API)
@RestController
@RequestMapping("/api")
public class NumberController {

    @GetMapping("/reverse")
    public int[] reverse(@RequestParam long number) {
        String s = String.valueOf(number);
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(s.length() - 1 - i) - '0';
        }
        return result;
    }
}
호출 : GET /api/reverse?number=12345
*/
public class No6 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();

            // 유효성 검사
            if(!input.matches("\\d+")){
                System.out.println("숫자만 입력가능");
                return;
            }

            // 출력
            int[] reversed = solution(input);
            System.out.println("출력 : " + Arrays.toString(reversed));
        } catch (IOException e){
            System.out.println("입력 중 오류 발생");
        }
    }

    // 배열 역순정렬
    private static int[] solution(String input){
        int[] result = new int[input.length()];
        for(int i = 0; i < input.length(); i++){
            result[i] = input.charAt(input.length() - 1 - i) - '0';
        }
        return  result;
    }
}
