package level0;
/*
문제: 글자 이어 붙여 문자열 만들기

로직
- index_list의 인덱스를 순서대로 확인한다.
- my_string에서 해당 인덱스의 문자를 가져온다.
- 가져온 문자를 StringBuilder에 차례대로 추가한다.

핵심 구현
- 향상된 for문으로 index_list의 값을 순회한다.
- charAt(n)을 사용해 n번째 문자를 가져온다.
- append()로 문자를 이어 붙여 결과 문자열을 만든다.

포인트
- index_list의 값은 my_string에서 가져올 문자의 위치를 의미한다.
- 문자열을 반복해서 연결할 때는 StringBuilder를 사용하면 효율적이다.
- index_list에 같은 인덱스가 여러 번 있으면 해당 문자도 여러 번 추가된다.

회고
- charAt()과 StringBuilder를 활용해 원하는 위치의 문자들을 순서대로 조합할 수 있었다.
*/
public class No93 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        StringBuilder sb = new StringBuilder();

        for(int n : index_list){
            sb.append(my_string.charAt(n));
        }

        System.out.println(sb);
    }
}
