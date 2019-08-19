package io.sago.baraja.design.pattern.strategic;

import android.util.Log;

import io.sago.hfz.baraja.pattern.strategic.strategic.character.Character;

import static io.sago.hfz.baraja.pattern.strategic.MainActivity.TAG;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version ShoutWinning, v 0.1 2019-07-15 15:04 by Harris Febryantony Z
 */
public class ShoutWinning implements ShoutBehavior {
    Character character;

    public ShoutWinning(Character character) {
        this.character = character;
    }

    @Override
    public void shout() {
        System.out.printf("shout: "+character.getName()+" is winning!!");
    }
}
