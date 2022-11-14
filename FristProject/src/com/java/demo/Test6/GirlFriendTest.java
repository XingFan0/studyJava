package com.java.demo.Test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend [] gfArr=new GirlFriend[4];

        GirlFriend gf1=new GirlFriend("朱朱",18,'女',"打游戏");
        GirlFriend gf2=new GirlFriend("婷婷",19,'女',"吃零食");
        GirlFriend gf3=new GirlFriend("小小",20,'女',"看电影");
        GirlFriend gf4=new GirlFriend("笑笑",21,'女',"刷抖音");

        gfArr[0]=gf1;
        gfArr[1]=gf2;
        gfArr[2]=gf3;
        gfArr[3]=gf4;

        int ageSum=0;
        for (int i = 0; i < gfArr.length; i++) {
            GirlFriend gf= gfArr[i];
            ageSum+=gf.getAge();
        }
        int vag=ageSum/gfArr.length;
        System.out.println("平均年龄为："+vag);

        //求低于评价年龄的女朋友
        int count=0;
        for (int i = 0; i < gfArr.length; i++) {
            GirlFriend gf= gfArr[i];
            if(gf.getAge()<vag){
                count++;
            }
        }
        System.out.println("年龄低于平均年龄的个数是："+count);
    }
}
