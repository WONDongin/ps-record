package level0;
/*
문제 : [PCCE 기출문제] 7번 / 버스
- 주어진 solution함수는 버스의 좌석 개수 seat,
- 기점에서 출발한 버스가 순서대로 방문한 정거장에서 승객이 승/하차한 정보를 담은 2차원 문자열 리스트 passengers가 주어질 때,
- 버스에 남아있는 좌석의 개수를 return 하는 함수
*/
class Solution30 {
    public int solution(int seat, String[][] passengers){
        int num_passenger = 0;
        for(int i = 0; i < passengers.length; i++){
            num_passenger += func4(passengers[i]);
            num_passenger -= func3(passengers[i]);
        }
        int answer = func1(seat - num_passenger);
        return  answer;
    }

    public int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }

    public int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }
}
public class No30 {
    public static void main(String[] args) {
        Solution30 sol = new Solution30();

        // 테스트
        int seat = 10;
        String[][] passengers = {
                {"On", "On", "Off"},
                {"On", "Off"},
                {"Off", "On"}
        };

        int result = sol.solution(seat,passengers);
        System.out.println(result);
    }
}
