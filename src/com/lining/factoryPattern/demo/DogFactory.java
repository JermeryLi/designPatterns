package com.lining.factoryPattern.demo;

/**
 * 描述：
 *
 * @author lining
 * createTime 2022/10/8 16:29
 * lastModify
 * lastModifyTime
 * 小组
 */
public class DogFactory {
    public Dog createDog(String dogName){
        if("keji".equals(dogName)){
            return new KeJi();
        }else if ("hashiqi".equals(dogName)){
            return new HaShiQi();
        }else{
            return null;
        }
    }
}
