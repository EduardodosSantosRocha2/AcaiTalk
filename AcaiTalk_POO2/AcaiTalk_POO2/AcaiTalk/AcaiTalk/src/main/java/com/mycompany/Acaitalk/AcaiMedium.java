package com.mycompany.Acaitalk;

import com.mycompany.Acaitalk.Decorator.IAcai;

public class AcaiMedium implements IAcai{

    
    @Override
    public void make() {
        System.out.println("Medium acai being made");
    }

    @Override
    public void pack() {
        System.out.println("the product was packed"); 
    }

    @Override
    public double price() {
         return 12.0;
    }

    @Override
    public String getDesc() {
        return "Medium acai";
    }
    
}
