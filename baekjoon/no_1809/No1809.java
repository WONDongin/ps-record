package no_1809;

/*
문제 : Moo (GolfScript)
"(___)\n(o o)____/\n @@      \\\n  \\ ____,/\n  //   //\n ^^   ^^"
GolfScript는 코드골프(code golf)에 특화된 아주 간견한 스택 기반언어

목표 : 가능한 한 적은 문자 수로 프로그램 작성
- 스택 기반 언어 : 모든 값은 스택에 쌓이고, 명령어들은 스택 위의 값을 꺼내서 처리
- 문자열 출력 : "..." 또는 여러 줄은 (...) 로 감싸서 출력, 마지막에 남아있는 값이 자동 출력
- 제어구조 : {} 로 함수를 만들고, ~ 같은 연산자도 자주 사용
*/
public class No1809 {
    public static void main(String[] args) {
        System.out.println("(___)");
        System.out.println("(o o)____/");
        System.out.println(" @@      \\");
        System.out.println("  \\ ____,/");
        System.out.println("  //   //");
        System.out.println(" ^^   ^^");
    }
}