package io.sago.baraja.design.pattern.strategic;

import io.sago.baraja.design.pattern.strategic.character.Character;

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
