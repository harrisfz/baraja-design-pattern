package io.sago.baraja.design.pattern.strategic;

import android.util.Log;

import io.sago.hfz.baraja.pattern.strategic.strategic.character.Character;

import static io.sago.hfz.baraja.pattern.strategic.MainActivity.TAG;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version ShoutName, v 0.1 2019-07-15 14:56 by Harris Febryantony Z
 */
public class ShoutName implements ShoutBehavior {

    private Character character;

    public ShoutName(Character character) {
        this.character = character;
    }

    @Override
    public void shout() {
        System.out.println( "shout: I am " + character.getName());
    }
}
