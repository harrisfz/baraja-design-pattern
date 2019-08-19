package io.sago.baraja.design.pattern.strategic;

import android.util.Log;

import io.sago.hfz.baraja.pattern.strategic.strategic.character.Character;

import static io.sago.hfz.baraja.pattern.strategic.MainActivity.TAG;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version ShoutLosing, v 0.1 2019-07-15 15:15 by Harris Febryantony Z
 */
public class ShoutLosing implements ShoutBehavior {

    public ShoutLosing(Character character) {
        this.character = character;
    }

    Character character;

    @Override
    public void shout() {
        System.out.printf("shout: "+character.getName()+" is lose. :(");
    }
}
