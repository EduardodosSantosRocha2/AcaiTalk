package com.mycompany.Acaitalk.Decorator;

public class SweetSauce extends AcaiDecorator{
    
    public SweetSauce(IAcai acai) {
        super(acai);
    }
    
    @Override
    public double price(){
        return super.price() + 4.00;
    }
    
    @Override
    public String getDesc(){
        return super.getDesc() + "frutinha adicionada!";
    }
}
