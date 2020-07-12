package com.icyf.exceptionLearn.diyException;

/**
 * @Author: ESy
 * @Date: 2020/5/26 21:55
 */
public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if (score < 0 || score > 100) {
//            throw new ScoreException();
            throw new ScoreException("分数有误，超出范围");
        }else {
            System.out.println("分数正常");
        }
    }
}
