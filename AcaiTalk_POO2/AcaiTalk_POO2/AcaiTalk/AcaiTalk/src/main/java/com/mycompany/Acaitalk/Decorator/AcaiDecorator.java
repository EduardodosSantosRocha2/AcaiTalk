package com.mycompany.Acaitalk.Decorator;

public class AcaiDecorator implements IAcai{
    
    IAcai acai;
    String additional;
    public AcaiDecorator(IAcai acai) {
        this.acai = acai;
        
    }

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
            return acai.price();    
    }

    @Override
    public String getDesc() {
        return acai.getDesc();
    }
    
}
