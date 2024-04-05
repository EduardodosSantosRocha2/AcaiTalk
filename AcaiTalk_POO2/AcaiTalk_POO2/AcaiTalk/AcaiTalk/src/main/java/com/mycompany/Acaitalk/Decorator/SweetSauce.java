package com.mycompany.Acaitalk.Decorator;

public class SweetSauce extends AcaiDecorator{
    
    String sweetSauce;
    public SweetSauce(IAcai acai, String sweetSauce) {
        super(acai);
        this.sweetSauce = sweetSauce;
    }
    
    @Override
    public double price(){
        return super.price() + 5.00;
    }
    
    @Override
    public String getDesc(){
        return super.getDesc() +"Calda adicionada: "+ sweetSauce + " .";
    }
}
