package com.icyf.athleteAndCoach;

/**
 * @Author: ESy
 * @Date: 2020/5/26 16:01
 */
public abstract class Athlete extends Person{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
