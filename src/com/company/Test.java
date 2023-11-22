package com.company;
import org.junit.Assert;
import org.junit.Test;
public class Test {
    @Test
    public void testPackagePriceStandard(){
        Product product = new Product(10, new StandardShipping(), new InTransitState());
        Assert.assertEquals(25, product.calculatePrice(), 0.0001);
    }

    @Test
    public void testPackagePriceExpress(){
        Product product = new Product(20, new StandardShipping(), new InTransitState());
        product.setShippingStrategy(new ExpressShipping());
        Assert.assertEquals(70, product.calculatePrice(), 0.0001);
    }
}
