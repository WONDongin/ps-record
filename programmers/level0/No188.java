package level0;
/*
문제: 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

로직
- myString에서 pat이 마지막으로 등장하는 시작 위치를 찾는다.
- 문자열의 시작부터 마지막 pat이 끝나는 위치까지 잘라서 반환한다.

핵심 구현
- lastIndexOf(pat)을 사용하여 pat의 마지막 시작 인덱스를 구한다.
- lastIndex + pat.length()를 substring의 끝 인덱스로 사용한다.
- substring(0, 끝 인덱스)로 가장 긴 부분 문자열을 구한다.

포인트
- 가장 긴 부분 문자열을 구하려면 pat이 처음 등장하는 위치가 아니라 마지막으로 등장하는 위치를 사용해야 한다.
- substring의 끝 인덱스는 포함되지 않으므로 pat의 길이를 더해야 한다.
- pat은 반드시 myString에 포함되어 있으므로 -1인 경우는 고려하지 않아도 된다.

회고
- lastIndexOf를 사용하여 반복문 없이 마지막 pat의 위치를 간단하게 찾았다.
- substring의 끝 인덱스가 포함되지 않는다는 점에 주의했다.
*/
public class No188 {
    class Solution {
        public String solution(String myString, String pat) {
            int lastIndex = myString.lastIndexOf(pat);

            return myString.substring(0, lastIndex + pat.length());
        }
    }
}
