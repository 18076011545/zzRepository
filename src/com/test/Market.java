package com.test;

/**
 * @author fengxiang
 * @version 1.0.0
 * @description
 * @date
 */
public interface Market {
    /**
     * 购买商品
     * @param name 商品名
     * @param num 商品数量
     * @return
     */
    double sell(String name,Integer num);
}
