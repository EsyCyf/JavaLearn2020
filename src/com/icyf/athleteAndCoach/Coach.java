package com.icyf.athleteAndCoach;

/**
 * @Author: ESy
 * @Date: 2020/5/26 16:01
 */
public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
