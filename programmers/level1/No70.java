package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/*
문제: [PCCE 기출문제] 10번 / 데이터 분석

로직
- ext 문자열을 배열의 인덱스로 변환한다.
- ext에 해당하는 값이 val_ext보다 작은 데이터만 리스트에 저장한다.
- sort_by 문자열을 배열의 인덱스로 변환한다.
- 해당 인덱스 값을 기준으로 오름차순 정렬한다.
- List<int[]>를 int[][]로 변환하여 반환한다.

핵심 구현
- 문자열을 배열 인덱스로 변환하는 메서드
  ex) getIndex(ext), getIndex(sort_by)
- Comparator.comparingInt()를 사용해 원하는 컬럼 기준으로 정렬
- list.toArray(new int[list.size()][])를 이용해 2차원 배열로 변환

포인트
- 문자열을 직접 비교하지 않고 인덱스로 변환하면 중복 코드를 줄일 수 있다.
- Comparator.comparingInt()를 사용하면 정렬 코드를 간결하게 작성할 수 있다.
- List<int[]>를 반환 형식인 int[][]로 변환하는 방법을 익힐 수 있었다.

회고
- 문자열을 배열의 인덱스로 변환하는 방식이 다양한 조건을 처리할 때 유용하다는 것을 배웠다.
- toArray()를 이용해 List를 배열로 변환하는 방법을 익힐 수 있었다.
*/
public class No70 {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        ArrayList<int[]> list = new ArrayList<>();

        int extIdx = getIndex(ext);
        int sortIdx = getIndex(sort_by);

        for(int i = 0; i < data.length; i++){
            if(data[i][extIdx] < val_ext){
                list.add(data[i]);
            }
        }

        list.sort(Comparator.comparingInt(l -> l[sortIdx]));

        int[][] answer = list.toArray(new int[list.size()][]);
        System.out.println(Arrays.deepToString(answer));
    }

    private static int getIndex(String type) {
        switch (type) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            default: return 3;
        }
    }
}
