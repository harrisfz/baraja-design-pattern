package io.sago.baraja.design.pattern.strategic.character;

import io.sago.baraja.design.pattern.strategic.ShoutBehavior;
import io.sago.baraja.design.pattern.strategic.WeaponBehavior;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version Character, v 0.1 2019-07-15 14:08 by Harris Febryantony Z
 */
public class Character {

    private final String name;

    WeaponBehavior weaponBehavior;

    ShoutBehavior shoutBehavior;

    Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shout() {
        if (shoutBehavior != null) {
            shoutBehavior.shout();
        }else{
            System.out.println("muted.......");
        }
    }

    public void fight() {
        if (weaponBehavior != null) {
            weaponBehavior.useWeapon();
        }else{
            System.out.println("fight: Use Barehand");
        }
    }

    public void setShoutBehavior(ShoutBehavior shoutBehavior) {
        this.shoutBehavior = shoutBehavior;
    }

    public void setWeaponBehavior(
        WeaponBehavior weaponBehavior) {
        System.out.println("setWeaponBehavior: change weapon");
        this.weaponBehavior = weaponBehavior;
    }
}
