package com.mycompany.coffeetalk;

public class AcaiSmall implements IAcai{

    @Override
    public void make() {
        System.out.println("Small acai being made");
    }

    @Override
    public String pack() {
        return "the product was packed";
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
