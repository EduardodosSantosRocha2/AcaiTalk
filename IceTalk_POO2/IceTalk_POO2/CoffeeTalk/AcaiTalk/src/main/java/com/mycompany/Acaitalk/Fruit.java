package com.mycompany.Acaitalk;

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
