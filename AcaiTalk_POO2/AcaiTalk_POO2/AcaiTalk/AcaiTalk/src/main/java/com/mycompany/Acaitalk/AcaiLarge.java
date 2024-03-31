
package com.mycompany.Acaitalk;

import com.mycompany.Acaitalk.Decorator.IAcai;

public class AcaiLarge implements IAcai{

    
    @Override
    public void make() {
        System.out.println("Large acai being made");
    }

    @Override
    public void pack() {
        System.out.println("the product was packed"); 
    }

    @Override
    public double price() {
         return 15.0;
    }

    @Override
    public String getDesc() {
        return "Large acai";
    }
    
}
