package com.mycompany.Acaitalk;

import com.mycompany.Acaitalk.Decorator.IAcai;

public class AcaiExtraLarge implements IAcai{

    
    @Override
    public void make() {
        System.out.println("Extra large acai being made");
    }

    @Override
    public void pack() {
        System.out.println("the product was packed"); 
    }

    @Override
    public double price() {
         return 20.0;
    }

    @Override
    public String getDesc() {
        return "Extra large acai";
    }
    
}
