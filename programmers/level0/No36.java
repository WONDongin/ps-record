package level0;
/*
문제 : 문자 리스트를 문자열로 변환하기

문제 요약

문자들이 담겨있는 배열 arr가 주어집니다.
arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
*/
public class No36 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        StringBuilder sb = new StringBuilder();

        for(String s : arr){
            sb.append(s);
        }

        System.out.println(sb);
    }
}
