package com.icyf.athleteAndCoach;

/**
 * @Author: ESy
 * @Date: 2020/5/26 16:09
 */
public class TabelTennisAthlete extends Athlete implements SpeakEnglish {
    public TabelTennisAthlete() {
    }

    public TabelTennisAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学个球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃桌子");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
