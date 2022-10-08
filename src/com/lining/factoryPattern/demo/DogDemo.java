package com.lining.factoryPattern.demo;

/**
 * 描述：
 *
 * @author lining
 * createTime 2022/10/8 16:31
 * lastModify
 * lastModifyTime
 * 小组
 */
public class DogDemo {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        Dog hashiqi = dogFactory.createDog("hashiqi");
        hashiqi.bark();
        Dog keji = dogFactory.createDog("keji");
        keji.bark();
    }
}
