package com.mycompany.Acaitalk.Decorator;

public class Acai implements IAcai{

    @Override
    public void make() {
        System.out.println("Açaí sendo feito!");
    }

    @Override
    public void pack() {
        System.out.println("O produto está embalado!");
    }

    @Override
    public double price() {
        
        return 0;
        
    }

    @Override
    public String getDesc() {
        return "Açai normal";
    }
    
}
