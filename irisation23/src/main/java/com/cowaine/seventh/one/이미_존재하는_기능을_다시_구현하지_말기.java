package com.cowaine.seventh.one;

import com.cowaine.seventh.domain.Item;
import com.cowaine.sixth.domain.Member;
import com.cowaine.sixth.domain.MemberState;

import java.util.ArrayList;
import java.util.List;

public class 이미_존재하는_기능을_다시_구현하지_말기 {
    public static void main(String[] args) {
        // 7.1.1 '감옥 열쇠'를 소지하고 있는지 확인하는 코드
        boolean hasPrisonKey = false;
        List<Item> items = new ArrayList<>();
        items.add(new Item("일반 열쇠"));
        items.add(new Item("감옥 열쇠"));

        for (Item item : items) {
            if (item.getName().equals("감옥 열쇠")) {
                hasPrisonKey = true;
                break;
            }
        }

        // 7.1.2 anyMatch 메서드
        boolean hasPrisonKey2 = items.stream().anyMatch(
                i -> i.getName().equals("감옥 열쇠")
        );

        // 7.1.3 자주 볼 수 있는 중첩 구조
        List<Member> members = new ArrayList<>();
        members.add(Member.ofNewbie());
        members.add(Member.ofNewbie());
        members.add(Member.ofNewbie());
        members.add(Member.ofNewbie());

        for (Member member : members) {
            if (0 < member.getHp()) {
                if (member.getState() == MemberState.PRISON) {
                    member = member.damageHp(10);

                    if (member.getHp() <= 0) {
                        member.damageHp(member.getHp());
                        member.changeState(MemberState.DIE);
                    }
                }
            }
        }

        // 7.1.4 조기 컨티뉴로 중첩 제거하기
        for (Member member : members) {
            // 살아 있지 않다면 continue로 다음 반복으로 넘어감.
            // 조기 continue로 변경하려면 조건을 반전해야 함.

            if (member.getHp() == 0) {
                continue;
            }

            if (member.getState() == MemberState.PRISON) {
                member = member.damageHp(10);

                if (member.getHp() <= 0) {
                    member.damageHp(member.getHp());
                    member.changeState(MemberState.DIE);
                }
            }
        }

        // 7.1.5 if 조건문의 중첩을 모두 제거한 상태
        for (Member member : members) {
            if (member.getHp() == 0) {
                continue;
            }

            if (member.getState() != MemberState.PRISON) {
                continue;
            }

            member.damageHp(10);

            if (0 < member.getHp()) {
                continue;
            }

            member.damageHp(member.getHp());
            member.changeState(MemberState.DIE);
        }
    }
}
