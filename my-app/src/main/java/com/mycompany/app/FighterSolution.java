package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbrown on 12/9/16.
 * Two fighters, one winner
 * Create a function that returns the name of the winner in a fight between two fighters.

 Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.

 Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.

 Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
 */
public class FighterSolution {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (true) {
            for (Fighter currentAttacker: fightOrder(fighter1, fighter2, firstAttacker)) {
                Fighter defender = fighter1.name.equals(currentAttacker.name) ? fighter2: fighter1;
                if (deathBlow(currentAttacker, defender)) {
                    return currentAttacker.name;
                }
            }
        }
 }

    private static boolean deathBlow(Fighter currentAttacker, Fighter defender) {
        defender.health -= currentAttacker.damagePerAttack;
        return defender.health <= 0;
    }

    private static List<Fighter> fightOrder(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        List<Fighter> fightOrder = new ArrayList<>();
        fightOrder.add(firstAttacker.equals(fighter1.name) ? fighter1 : fighter2);
        fightOrder.add(firstAttacker.equals(fighter1.name) ? fighter2 : fighter1);
        return fightOrder;
    }
}
