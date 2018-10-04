package com.jsample;

public class Test {
    public static  void main(String[] args)
    {
        int money = 1000000000;  //10亿
        int years = 20;
        int total = money*years;   //返回的是负数
        long total1 = money*years;  //返回的仍然是负数。默认是int，因此结果会转成int值，再转成long。但是已经发生了数据丢失
        long total2 = money*((long)years);   //先将一个因子变成long，整个表达式发生提升。全部用long来计算。
        System.out.println(total);
        System.out.println(total1);
        System.out.println(total2);
    }
}
