package level0;
/*
문제: 창고 정리

문제 요약
- 창고의 각 칸에는 물건 이름과 개수가 저장되어 있다.
- 같은 이름의 물건은 하나로 합쳐서 개수를 누적해야 한다.
- 정리 후 개수가 가장 많은 물건의 이름을 반환한다.

접근 방법
- clean_storage 배열에 중복 제거된 물건 이름을 저장한다.
- clean_num 배열에 해당 물건의 누적 개수를 저장한다.
- storage를 순회하면서 이미 등록된 물건인지 확인한다.
- 등록된 물건이면 개수를 더하고, 처음 나온 물건이면 새로 저장한다.
- 마지막에 clean_num에서 가장 큰 값을 찾아 해당 물건 이름을 answer로 저장한다.

핵심 아이디어
- clean_idx를 -1로 두고, 같은 물건을 찾으면 해당 인덱스를 저장한다.
- 같은 물건을 찾지 못한 경우 새로운 물건으로 clean_storage에 추가한다.
- 같은 물건을 찾은 경우 clean_num[clean_idx]에 개수를 누적한다.

주의할 점
- 문자열 비교는 ==가 아니라 equals()를 사용해야 한다.
- clean_storage 전체 길이가 아니라 실제 저장된 개수인 num_item까지만 탐색해야 한다.
- 최대 개수를 찾을 때도 num_item까지만 순회해야 한다.

배운 점
- 배열만 사용해서 중복 데이터를 직접 합치는 방법을 연습할 수 있었다.
- 중복 여부를 확인하기 위한 인덱스 변수 활용법을 익혔다.
*/
public class No35 {
    public static void main(String[] args) {
        String[] storage = {"pencil", "pencil", "pencil", "book"};
        int[] num = {2, 4, 3, 1};

        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for(int i=0; i<storage.length; i++){
            int clean_idx = -1;
            for(int j=0; j<num_item; j++){
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }
            if(clean_idx == -1){
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }

        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }

        System.out.println(answer);
    }
}
