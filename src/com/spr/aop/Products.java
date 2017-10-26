/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr.aop;

public class Products implements Stock{
    public static double availstock=10000.0;

    @Override
    public double sell(double products) {
        if(products>availstock)
            return availstock;
        else
        {  
            availstock-=products;  
            System.out.println("current stock:"+availstock);
            return products;
        }
    }
}
