package io.sago.baraja.design.pattern.strategic.character;

import android.util.Log;

import io.sago.hfz.baraja.pattern.strategic.MainActivity;
import io.sago.hfz.baraja.pattern.strategic.strategic.ShoutBehavior;
import io.sago.hfz.baraja.pattern.strategic.strategic.WeaponBehavior;

import static io.sago.hfz.baraja.pattern.strategic.MainActivity.TAG;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version Character, v 0.1 2019-07-15 14:08 by Harris Febryantony Z
 */
public class Character {

    private final String name;

    protected WeaponBehavior weaponBehavior;

    protected ShoutBehavior shoutBehavior;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shout() {
        if (shoutBehavior != null) {
            shoutBehavior.shout();
        }else{
            Log.d(TAG, "muted.......");
        }
    }

    public void fight() {
        if (weaponBehavior != null) {
            weaponBehavior.useWeapon();
        }else{
            Log.d(TAG, "fight: Use Barehand");
        }
    }

    public void setShoutBehavior(ShoutBehavior shoutBehavior) {
        this.shoutBehavior = shoutBehavior;
    }

    public void setWeaponBehavior(
        WeaponBehavior weaponBehavior) {
        Log.d(TAG, "setWeaponBehavior: change weapon");
        this.weaponBehavior = weaponBehavior;
    }
}
