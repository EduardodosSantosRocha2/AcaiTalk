package com.mycompany.Acaitalk.Decorator;

import com.mycompany.Acaitalk.IAcai;

public class AcaiDecorator implements IAcai{
    
    IAcai acai;

    public AcaiDecorator(IAcai acai) {
        this.acai = acai;
    }

    @Override
    public void make() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
