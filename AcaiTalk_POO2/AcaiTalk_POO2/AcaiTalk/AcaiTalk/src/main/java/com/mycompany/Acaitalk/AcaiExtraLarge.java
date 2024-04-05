package com.mycompany.Acaitalk;

import com.mycompany.Acaitalk.Decorator.IAcai;

public class AcaiExtraLarge implements IAcai{

    
    @Override
    public void make() {
        System.out.println("Açaí extra grande sendo feito!");
    }

    @Override
    public void pack() {
        System.out.println("O produto está embalado!"); 
    }

    @Override
    public double price() {
         return 20.0;
    }

    @Override
    public String getDesc() {
        return "Açai do tipo extra large.";
    }
    
}
