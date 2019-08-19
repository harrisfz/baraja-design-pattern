package io.sago.baraja.design.pattern.strategic.character;

import io.sago.baraja.design.pattern.strategic.ShoutName;
import io.sago.baraja.design.pattern.strategic.WeaponAxe;

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
