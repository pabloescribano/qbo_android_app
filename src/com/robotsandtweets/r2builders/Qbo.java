package com.robotsandtweets.r2builders;

/**
 * Created by pablo_001 on 13/06/13.
 */
public class Qbo {
    public Qbo()
    {
        this.preferences = new Preferences();

        this.user = new User();
        this.user.name = "root";
        this.user.password = "toor";
    }

    Preferences preferences;
    User user;
}
