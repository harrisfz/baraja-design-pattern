package io.sago.baraja.design.pattern.strategic.character;

import io.sago.hfz.baraja.pattern.strategic.strategic.ShoutName;
import io.sago.hfz.baraja.pattern.strategic.strategic.WeaponSword;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version Knight, v 0.1 2019-07-15 14:51 by Harris Febryantony Z
 */
public class Knight extends Character {

    public Knight() {
        super("Knight");
        shoutBehavior = new ShoutName(this);
        weaponBehavior = new WeaponSword();
    }
}
