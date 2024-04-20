package com.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author fengxiang
 * @version 1.0.0
 * @description
 * @date
 */
public class TestMain {
    public static void main(String[] args) {
        /*
        1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        SuperMarket superMarket = new SuperMarket(new HashMap<String,Double>());
        superMarket.addStore("apple",8.0);
        superMarket.addStore("strawBerry",13.0);

        System.out.println(method1(superMarket));


         /*
        2、超市增加了一种水果芒果，其定价为 20 元/斤。
现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        superMarket.addStore("Mango",20.0);
        System.out.println(method2(superMarket));
         /*
       3、超市做促销活动，草莓限时打 8 折。
现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        System.out.println(method3(superMarket));
         /*
       4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        System.out.println(method4(superMarket));
    }
    public static double method1( SuperMarket superMarket){
        return superMarket.sell("apple",5)+ superMarket.sell("strawBerry",7);
    }

    public static double method2( SuperMarket superMarket){
        double apple = superMarket.sell("apple",5);
        double strawBerry = superMarket.sell("strawBerry",6);
        double mango = superMarket.sell("Mango",3);
        return apple+strawBerry+mango;
    }

    public static double method3( SuperMarket superMarket){
        double apple = superMarket.sell("apple",5);
        double strawBerry = superMarket.salePro("strawBerry",6,8);
        double mango = superMarket.sell("Mango",3);
        return apple+strawBerry+mango;
    }

    public static double method4( SuperMarket superMarket){
        double apple = superMarket.sell("apple",5);
        double strawBerry = superMarket.salePro("strawBerry",6,8);
        double mango = superMarket.sell("Mango",3);
        double sumPrice = apple+strawBerry+mango;
        return superMarket.saleDuce(sumPrice,100,10);
    }
}
