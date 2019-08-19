package io.sago.baraja.design.pattern.strategic;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version WeaponBowAndArrow, v 0.1 2019-07-15 15:23 by Harris Febryantony Z
 */
public class WeaponBowAndArrow implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("useWeapon: Aim bow!");
    }
}
