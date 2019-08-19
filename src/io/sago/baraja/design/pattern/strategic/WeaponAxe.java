package io.sago.baraja.design.pattern.strategic;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version WeaponAxe, v 0.1 2019-07-15 15:20 by Harris Febryantony Z
 */
public class WeaponAxe implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("useWeapon: Draw Axe!");
    }
}
