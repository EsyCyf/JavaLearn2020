package com.icyf.athleteAndCoach;

/**
 * @Author: ESy
 * @Date: 2020/5/26 16:06
 */
public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃！！！");
    }
}
