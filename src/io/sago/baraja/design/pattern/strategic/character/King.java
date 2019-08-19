package io.sago.baraja.design.pattern.strategic.character;

import io.sago.hfz.baraja.pattern.strategic.strategic.ShoutName;
import io.sago.hfz.baraja.pattern.strategic.strategic.WeaponAxe;
import io.sago.hfz.baraja.pattern.strategic.strategic.WeaponSword;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version King, v 0.1 2019-07-15 14:12 by Harris Febryantony Z
 */
public class King extends Character {

    public King() {
        super("King");
        shoutBehavior = new ShoutName(this);
        weaponBehavior = new WeaponAxe();
    }
}
