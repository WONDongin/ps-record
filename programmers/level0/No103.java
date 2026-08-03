package level0;
/*
문제: 가위 바위 보

로직
- rsp의 문자를 앞에서부터 하나씩 확인한다.
- 가위(2)에는 바위(0), 바위(0)에는 보(5), 보(5)에는 가위(2)를 추가한다.
- 완성된 문자열을 반환한다.

핵심 구현
- charAt()을 사용해 각 문자를 확인한다.
- StringBuilder에 각 문자를 이길 수 있는 값을 추가한다.
- 2 → 0, 0 → 5, 5 → 2로 변환한다.

포인트
- rsp는 2, 0, 5로만 구성되므로 else에서는 5인 경우를 처리할 수 있다.
- 반복적인 문자열 연결에는 StringBuilder를 사용하는 것이 효율적이다.
- 숫자가 아닌 문자이므로 '2', '0'과 같이 작은따옴표로 비교한다.

회고
- 각 가위바위보 값에 대응하는 승리 값을 조건문으로 변환해 해결했다.
*/
public class No103 {
    public static void main(String[] args) {
        String rsp = "205";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < rsp.length(); i++){
            char c = rsp.charAt(i);

            if(c == '2'){
                sb.append("0");
            } else if (c == '0') {
                sb.append("5");
            } else {
                sb.append("2");
            }
        }

        System.out.println(sb);
    }
}
