package com.magic.proxy;

/**
 * @Description
 * @Author Chelsea
 * @Date 2019/12/26 21:37
 */
public interface IProducer {
    /**
     * @Description 销售
     * @Author Chelsea
     * @Date 2019/12/26 21:37
     */
    public void saleProduct(float money);
    /**
     * @Description 售后
     * @Author Chelsea
     * @Date 2019/12/26 21:37
     */
    public void afterService(float money);
}
