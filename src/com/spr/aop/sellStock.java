/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author VI391762
 */
public class sellStock implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] value, Object target) throws Throwable {
       boolean flag=false;
       double products=0;
       for(Object inn:value)
       {
           if( Double.parseDouble(String.valueOf(inn).trim())>Products.availstock)
           {
               products=Double.parseDouble(inn.toString().trim());
               flag=false;
               break;
           }
           else
               flag=true;
       }
       if(!flag)
            System.out.println("sorry you have not enough stock....Current stock:"+Products.availstock);
       else
            System.out.println("proceed to sell your products.....current stock:");
    }
    
}
