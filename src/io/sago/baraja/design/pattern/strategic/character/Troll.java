package io.sago.baraja.design.pattern.strategic.character;

import io.sago.hfz.baraja.pattern.strategic.strategic.ShoutName;
import io.sago.hfz.baraja.pattern.strategic.strategic.WeaponKnife;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version Troll, v 0.1 2019-07-15 14:52 by Harris Febryantony Z
 */
public class Troll extends Character {

    public Troll() {
        super("Troll");
        shoutBehavior = new ShoutName(this);
        weaponBehavior = new WeaponKnife();
    }
}

