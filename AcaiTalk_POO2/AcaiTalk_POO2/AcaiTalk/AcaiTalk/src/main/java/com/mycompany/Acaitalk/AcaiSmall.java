package com.mycompany.Acaitalk;

import com.mycompany.Acaitalk.Decorator.IAcai;

public class AcaiSmall implements IAcai{

    @Override
    public void make() {
        System.out.println("Small acai being made");
    }

    @Override
    public void pack() {
        System.out.println("the product was packed"); 
    }

    @Override
    public double price() {
         return 10.0;
    }

    @Override
    public String getDesc() {
        return "small acai";
    }
    
}
