package level1;
/*
문제: [PCCP 기출문제] 1번 / 붕대 감기

로직
- 이전 공격과 현재 공격 사이의 회복 가능한 시간을 계산한다.
- 초당 회복량과 연속 성공에 따른 추가 회복량을 체력에 더한다.
- 최대 체력을 넘지 않도록 제한한 뒤 현재 공격의 피해량을 차감한다.
- 체력이 0 이하가 되면 -1을 반환한다.

핵심 구현
- 현재 공격 시간 - 이전 공격 시간 - 1로 회복 시간을 계산한다.
- 회복 시간을 시전 시간으로 나눈 몫으로 추가 회복 횟수를 구한다.
- Math.min으로 회복 후 체력을 최대 체력 이하로 제한한다.

포인트
- 공격받는 순간에는 체력을 회복할 수 없다.
- 공격마다 연속 성공 시간이 초기화되므로 공격 사이 구간을 독립적으로 계산한다.
- 마지막 공격 직후의 체력을 반환한다.

회고
- 매초 반복하지 않고 공격 사이의 회복량을 한 번에 계산했다.
- 공격 횟수만큼만 순회하여 효율적으로 해결했다.
*/
public class No77 {
    class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {
            int currentHealth = health;
            int previousAttackTime = 0;

            for (int[] attack : attacks) {
                int attackTime = attack[0];
                int damage = attack[1];

                int recoveryTime = attackTime - previousAttackTime - 1;

                int recovery = recoveryTime * bandage[1];
                int bonusRecovery = (recoveryTime / bandage[0]) * bandage[2];

                currentHealth = Math.min(
                        health,
                        currentHealth + recovery + bonusRecovery
                );

                currentHealth -= damage;

                if (currentHealth <= 0) {
                    return -1;
                }

                previousAttackTime = attackTime;
            }

            return currentHealth;
        }
    }
}
