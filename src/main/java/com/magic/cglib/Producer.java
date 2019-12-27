package com.magic.cglib;

import com.magic.proxy.IProducer;

/**
 * @Description 一个生产者
 * @Author Chelsea
 * @Date 2019/12/26 21:33
 */

public class Producer {

    /**
     * @Description 销售
     * @Author Chelsea
     * @Date 2019/12/26 21:37
     */
    public void saleProduct(float money){
        System.out.println("销售产品，并拿到钱："+money);

    }

    /**
     * @Description 售后
     * @Author Chelsea
     * @Date 2019/12/26 21:37
     */
    public void afterService(float money){
        System.out.println("提供售后服务并拿到钱："+money);

    }
}
