package com.cowaine.coalong.chapter07;

import java.util.List;

public class Chap7 {

    boolean hasPrisonKey(List<Item> items) {
        return items.stream().anyMatch(
                item -> item.name.equals("감옥 열쇠")
        );
    }

    void decreaseHitPoints(List<Member> members) {
        for (Member member : members) {
            // 살아 있지 않다면 continue 로 다음 반복으로 넘어감.
            // 조기 continue 로 변경하려면 조건을 반전해야 함.
            if (member.hitPoint == 0) continue;
            if (!member.containsState(StateType.poison)) continue;

            member.hitPoint -= 10;

            if (0 < member.hitPoint) continue;

            member.hitPoint = 0;
            member.addState(StateType.dead);
            member.removeState(StateType.poison);
        }
    }

    static int comboAttackDamage(List<Member> members) {
        int totalDamage = 0;
        for (Member member : members) {
            if (!member.hasTeamAttackSucceeded()) break;

            int damage = (int) (member.attack() * 1.1);

            if (damage < 30) break;

            totalDamage += damage;
        }

        return totalDamage;
    }
}
