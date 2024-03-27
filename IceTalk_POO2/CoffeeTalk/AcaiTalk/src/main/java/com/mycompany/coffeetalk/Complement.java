package com.mycompany.coffeetalk;

public class Complement extends AcaiDecorator {
    
    public Complement(IAcai acai) {
        super(acai);
    }
    public double price(){
        return super.price() + 6.00;
    }
    
    public String getDesc(){
        return super.getDesc() + "complemento adicionada!";
    }
}
