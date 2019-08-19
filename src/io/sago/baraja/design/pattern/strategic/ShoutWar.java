package io.sago.baraja.design.pattern.strategic;

/**
 * @author Harris Febryantony Z (harris.febryantony@dana.id)
 * @version ShoutWar, v 0.1 2019-07-15 15:00 by Harris Febryantony Z
 */
public class ShoutWar implements ShoutBehavior {

    @Override
    public void shout() {
        System.out.println("shout: Lets war!!!!!!");
    }
}
