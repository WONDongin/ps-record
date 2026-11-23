package no_2477;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제: 참외밭 (백준 2477)

로직
- 가로와 세로의 최대 길이를 찾아 큰 직사각형의 넓이를 구한다.
- 잘려 나간 작은 직사각형의 넓이를 빼 참외밭의 넓이를 구한다.
- 참외밭의 넓이에 1㎡당 참외 개수 K를 곱해 출력한다.

핵심 구현
- 변의 길이 6개를 입력 순서대로 배열에 저장한다.
- 방향이 1 또는 2이면 가로, 3 또는 4이면 세로로 보고 최대 길이와 인덱스를 기록한다.
- 가장 긴 세로 변에서 세 칸 뒤의 길이가 작은 직사각형의 가로다.
- 가장 긴 가로 변에서 세 칸 뒤의 길이가 작은 직사각형의 세로다.

포인트
- (index + 3) % 6으로 배열 끝을 넘어가도 처음부터 이어서 찾는다.
- 변의 개수가 항상 6개이므로 시간 복잡도와 공간 복잡도는 모두 O(1)이다.

회고
- 시작 꼭짓점이 달라져도 변의 상대적인 순서는 유지되므로 나머지 연산으로 같은 방식으로 처리했다.
*/
public class No2477 {
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int melonsPerSquareMeter = Integer.parseInt(br.readLine().trim());

            int[] lengths = new int[6];
            int maxWidth = 0;
            int maxHeight = 0;
            int widthIndex = 0;
            int heightIndex = 0;

            for (int i = 0; i < lengths.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int direction = Integer.parseInt(st.nextToken());
                int length = Integer.parseInt(st.nextToken());
                lengths[i] = length;

                if (direction == 1 || direction == 2) {
                    if (length > maxWidth) {
                        maxWidth = length;
                        widthIndex = i;
                    }
                } else if (length > maxHeight) {
                    maxHeight = length;
                    heightIndex = i;
                }
            }

            int smallWidth = lengths[(heightIndex + 3) % lengths.length];
            int smallHeight = lengths[(widthIndex + 3) % lengths.length];
            int fieldArea = maxWidth * maxHeight - smallWidth * smallHeight;

            System.out.println(fieldArea * melonsPerSquareMeter);
        }
    }
}
