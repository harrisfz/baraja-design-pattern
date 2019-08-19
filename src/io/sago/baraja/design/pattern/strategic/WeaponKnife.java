package io.sago.baraja.design.pattern.strategic;

import android.util.Log;

import static io.sago.hfz.baraja.pattern.strategic.MainActivity.TAG;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version WeaponKnife, v 0.1 2019-07-15 15:22 by Harris Febryantony Z
 */
public class WeaponKnife implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("useWeapon: Draw a little knife.");
    }
}
