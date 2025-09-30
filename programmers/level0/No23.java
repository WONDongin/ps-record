package level0;

// 문제 : [PCCE 기출문제] 5번 / 심폐소생술
/*
"respiration", "repeat", "check", "pressure", "call"은
각각 4, 5, 1, 3, 2 번째 순서이므로 [4, 5, 1, 3, 2]를 리턴합니다.
*/
public class No23 {
    public static void main(String[] args) {
        String[] cpr = {"check", "call", "pressure", "respiration", "repeat"};
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i< cpr.length; i++){
            for(int j=0; j< basic_order.length; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j + 1;
                    break;
                }
            }
        }
    }
}

