package level0;
/*
문제 : [PCCE 기출문제] 5번 / 산책
"N"은 북쪽으로 1만큼 움직입니다.
"S"는 남쪽으로 1만큼 움직입니다.
북쪽으로 -1만큼 움직인 것과 같습니다.
"E"는 동쪽으로 1만큼 움직입니다.
"W"는 서쪽으로 1만큼 움직입니다.
동쪽으로 -1만큼 움직인 것과 같습니다.
*/
public class No22 {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];

        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}