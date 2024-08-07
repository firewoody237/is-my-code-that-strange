package com.cowaine.corock.chapter08;

import com.cowaine.corock.chapter08.game.FighterPhysicalAttack;
import com.cowaine.corock.chapter08.game.PhysicalAttack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp161To163();
    }

    private static void pp161To163() {
        PhysicalAttack physicalAttack = new FighterPhysicalAttack(new PhysicalAttack());
        log.info("damage: {}", physicalAttack.doubleAttackDamage());
    }

}
