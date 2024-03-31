package com.mycompany.Acaitalk.Decorator;

public class AcaiDecorator implements IAcai{
    
    IAcai acai;
    public AcaiDecorator(IAcai acai) {
        this.acai = acai;
        
    }

    @Override
    public void make() {
        System.out.println("acai being made"); 
    }

    @Override
    public void pack() {
        System.out.println("the product was packed"); 
    }

    @Override
    public double price() {
            return acai.price();    
    }

    @Override
    public String getDesc() {
        return acai.getDesc();
    }
    
}
