package com.mycompany.Acaitalk.Decorator;

public class Complement extends AcaiDecorator {
    
    public Complement(IAcai acai) {
        super(acai);
    }
    
    @Override
    public double price(){
        return super.price() + 6.00;
    }
    
    @Override
    public String getDesc(){
        return super.getDesc() + "complemento adicionada!";
    }
}
