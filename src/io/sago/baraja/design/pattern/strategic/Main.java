package io.sago.baraja.design.pattern.strategic;

import io.sago.baraja.design.pattern.strategic.character.Character;
import io.sago.baraja.design.pattern.strategic.character.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // All character ready to war.
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll1 = new Troll();
        Character troll2 = new Troll();
        Character troll3 = new Troll();

        List<Character> chars = new ArrayList<>();
        chars.add(king);
        chars.add(queen);
        chars.add(knight);
        chars.add(troll1);
        chars.add(troll2);
        chars.add(troll3);

        // All shouting their name
        allShout(chars);

        setWar(chars);

        allShout(chars);

        allWar(chars);

        // switch weapon

        king.setWeaponBehavior(new WeaponSword());
        queen.setWeaponBehavior(new WeaponKnife());
        knight.setWeaponBehavior(null);

        troll1.setWeaponBehavior(null);
        troll3.setWeaponBehavior(new WeaponAxe());

        // war again
        allWar(chars);

        king.setShoutBehavior(new ShoutWinning(king));
        queen.setShoutBehavior(new ShoutWinning(queen));
        knight.setShoutBehavior(null);

        troll1.setShoutBehavior(new ShoutLosing(troll1));
        troll2.setShoutBehavior(null);
        troll3.setShoutBehavior(new ShoutLosing(troll2));

        allShout(chars);
    }
    static void allShout(List<Character> characters) {
        for (Character character : characters) {
            character.shout();
        }
    }

    static void setWar(List<Character> characters) {
        for (Character character : characters) {
            character.setShoutBehavior(new ShoutWar());
        }
    }

    static void allWar(List<Character> characters) {
        for (Character character : characters) {
            character.fight();
        }
    }
}
