package no_9654;
/*
문제-9654: 나부 함대 데이터

[문제 요약]
- 주어진 함대 데이터를 표 형태로 출력하는 문제
- 각 컬럼은 정해진 너비에 맞게 정렬되어야 함
- 공백 및 자리수 정렬이 핵심

[접근 방법]
- printf를 사용하여 고정 폭 출력
- %-ns 형식을 이용해 왼쪽 정렬 처리

[핵심 아이디어]
- 단순 println이 아닌, 서식 지정 출력이 필요
- 각 컬럼의 폭을 맞춰야 정답 처리됨
  (SHIP NAME / CLASS / DEPLOYMENT / IN SERVICE)

[처리 흐름]
데이터 정의 → printf 포맷 적용 → 정렬 출력

[시간복잡도]
- O(1)
*/
public class No_9654 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-11s%-10s%n", "SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE");
        System.out.printf("%-15s%-15s%-11s%-10d%n", "N2 Bomber", "Heavy Fighter", "Limited", 21);
        System.out.printf("%-15s%-15s%-11s%-10d%n", "NX Cruiser", "Medium Fighter", "Limited", 18);
        System.out.printf("%-15s%-15s%-11s%-10d%n", "N1 Starfighter", "Medium Fighter", "Unlimited", 25);
        System.out.printf("%-15s%-15s%-11s%-10d%n", "Royal Cruiser", "Light Combat", "Limited", 4);
    }
}
