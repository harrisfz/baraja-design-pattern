package io.sago.baraja.design.pattern.strategic;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version WeaponSword, v 0.1 2019-07-15 15:19 by Harris Febryantony Z
 */
public class WeaponSword implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("useWeapon: Draw Sword!");
    }
}
