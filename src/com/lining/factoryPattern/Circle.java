package com.lining.factoryPattern;
/**
 * 描述：
 *
 * @author lining
 * createTime 2022/10/8 14:12
 * lastModify
 * lastModifyTime
 * 小组
 */
public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}