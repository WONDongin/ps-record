package no_1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-1991 (실버1): 트리 순회

- 이진 트리의 각 노드에 대해 왼쪽 자식과 오른쪽 자식 정보가 주어진다
- 전위 순회, 중위 순회, 후위 순회 결과를 출력하는 문제

접근 방법

- 각 노드의 왼쪽 자식과 오른쪽 자식을 배열에 저장
- 루트 노드는 항상 A이므로 A부터 순회 시작
- 재귀를 이용해 전위/중위/후위 순회를 각각 구현

핵심 아이디어

- 이 문제는 트리를 직접 복잡하게 연결할 필요 없이
  부모 기준으로 왼쪽/오른쪽 자식만 저장하면 된다
- 순회의 차이는 방문 순서만 다르다
  - 전위: 부모 → 왼쪽 → 오른쪽
  - 중위: 왼쪽 → 부모 → 오른쪽
  - 후위: 왼쪽 → 오른쪽 → 부모
- '.' 은 자식이 없다는 뜻이므로 재귀 종료 조건으로 처리

처리 흐름

- 입력
- left[], right[] 배열에 트리 정보 저장
- preOrder('A') 호출
- inOrder('A') 호출
- postOrder('A') 호출
- 결과 출력
*/
public class No1991 {

    static char[] left = new char[26];
    static char[] right = new char[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char l = st.nextToken().charAt(0);
            char r = st.nextToken().charAt(0);

            int idx = parent - 'A';
            left[idx] = l;
            right[idx] = r;
        }

        preOrder('A');
        System.out.println();
        inOrder('A');
        System.out.println();
        postOrder('A');
    }

    static void preOrder(char node){
        if(node == '.') return;

        System.out.print(node);
        preOrder(left[node - 'A']);
        preOrder(right[node - 'A']);
    }

    static void inOrder(char node) {
        if (node == '.') return;

        inOrder(left[node - 'A']);
        System.out.print(node);
        inOrder(right[node - 'A']);
    }

    static void postOrder(char node) {
        if (node == '.') return;

        postOrder(left[node - 'A']);
        postOrder(right[node - 'A']);
        System.out.print(node);
    }
}
