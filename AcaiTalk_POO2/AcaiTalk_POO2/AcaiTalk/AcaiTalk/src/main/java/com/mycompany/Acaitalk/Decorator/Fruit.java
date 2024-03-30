package com.mycompany.Acaitalk.Decorator;

import com.mycompany.Acaitalk.IAcai;

public class Fruit extends AcaiDecorator{
    
    public Fruit(IAcai acai) {
        super(acai);
    }
    public double price(){
        return super.price() + 4.00;
    }
    
    public String getDesc(){
        return super.getDesc() + "frutinha adicionada!";
    }
    
}
