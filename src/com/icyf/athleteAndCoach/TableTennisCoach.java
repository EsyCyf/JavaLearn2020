package com.icyf.athleteAndCoach;

/**
 * @Author: ESy
 * @Date: 2020/5/26 16:07
 */
public class TableTennisCoach extends Coach implements SpeakEnglish{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃！！！！！！！");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
