package com.mycompany.Acaitalk.Decorator;

public class Complement extends AcaiDecorator {
    
    private String complement;
    public Complement(IAcai acai, String complement) {  
       super(acai);
       this.complement = complement;     
    }
    
    @Override
    public double price(){
        return super.price() + 6.00;
    }
    
    @Override
    public String getDesc(){
        return super.getDesc() + "Complementos adicionada: " + complement +" .";
    }
}
