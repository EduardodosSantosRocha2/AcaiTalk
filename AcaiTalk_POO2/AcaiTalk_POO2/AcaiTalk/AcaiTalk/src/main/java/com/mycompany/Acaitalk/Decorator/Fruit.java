package com.mycompany.Acaitalk.Decorator;

public class Fruit extends AcaiDecorator{
    private String fruit;
    public Fruit(IAcai acai, String fruit) {
        super(acai);
        this.fruit = fruit;    
    }
    
    @Override
    public double price(){
        return super.price() + 4.00;
    }
    
    @Override
    public String getDesc(){
        return super.getDesc() + "Fruta adicionada: " + fruit +" .";
    }
    
}
