package com.bhattifaseeh.cannongame;

// Target.java
// Subclass of GameElement customized for the Target

public class Target extends GameElement {
    private int hitReward; // the hit reward for this target

    // constructor
    public Target(CannonView view, int color, int hitReward, int x, int y,
                  int width, int length, float velocityY) {
        super(view, color, CannonView.TARGET_SOUND_ID, x, y, width, length,
                velocityY);
        this.hitReward = hitReward;
    }

    // returns the hit reward for this Target
    public int getHitReward() {
        return hitReward;
    }
}
