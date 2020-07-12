package com.icyf.javaLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/23 16:49
 */
public class jiujiuchengfa {
    public static void main(String[] args) {
        jiujiuchengfa jj = new jiujiuchengfa();
        jj.jJCF();
        jj.zhiShu(100);

    }

    public void jJCF(){
        int i = 1;
        int j = 1;
        for (;i<10;i++){
            for (j=1;j<=i;j++){
                System.out.print(i+"x"+j+"="+(i*j)+"\t");
            }
            System.out.println();

        }
    }

    public void zhiShu(int num){
        int i,j;
        //方法一
        /*for (i=2;i<=num;i++){
            int count = 0;

            for (j=1;j<=i;j++){
                if ((i%j)==0) count++;
            }
            if (count == 2) System.out.print(i+"\t");
        }*/

        //方法二
        for (i=2;i<=num;i++){
            for (j=2;j<=i;j++){
                if (i%j==0&&(i!=j)) break;
                else if (i==j) System.out.print(i+"\t");
            }
        }

    }
}
