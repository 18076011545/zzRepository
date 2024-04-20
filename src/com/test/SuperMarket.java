package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengxiang
 * @version 1.0.0
 * @description
 * @date
 */
public class SuperMarket implements Market{
    /**
     * 存放售卖的东西
     */
    private Map<String,Double> store = new HashMap<>();

    SuperMarket(Map store){
       this.store = store;
    }
    @Override
    public double sell(String name,Integer num) {
        if(num<=0){
            System.out.println("斤数要大于零");
            return 0.0;
        }
        Double price = store.get(name);
        return (double)price*num;
    }

    /**
     * 打折促销商品
     * @param name 商品名字
     * @param num   数量
     * @param level  打折的折数
     * @return 打折后的价格
     */
    public double salePro(String name,Integer num,Integer level){
        double lev = level*0.1;
        return this.sell(name,num)*lev;
    }

    /**
     * 满减商品
     * @param sumPrice 商品总价格
     * @param sum      达到满减价格
     * @param duce     满减的金钱
     * @return 满减后的价格
     */
    public double saleDuce(double sumPrice,double sum,double duce){
        if (sumPrice>sum){
            return sumPrice-duce;
        }
        return sumPrice;
    }

    /**
     * 增加商品
     */
    public void addStore(String name,Double price){
        this.store.put(name,price);
    }

    /**
     * 减少商品
     */
    public void reduceStore(String name){
        this.store.remove(name);
    }
}
