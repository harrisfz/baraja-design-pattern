package io.sago.baraja.design.pattern.strategic.character;

import io.sago.hfz.baraja.pattern.strategic.strategic.ShoutName;
import io.sago.hfz.baraja.pattern.strategic.strategic.WeaponBowAndArrow;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version Queen, v 0.1 2019-07-15 14:49 by Harris Febryantony Z
 */
public class Queen extends Character {

    public Queen() {
        super("Queen");
        shoutBehavior = new ShoutName(this);
        weaponBehavior = new WeaponBowAndArrow();
    }
}
