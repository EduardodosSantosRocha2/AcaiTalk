package com.mycompany.Acaitalk.Facade;

import com.mycompany.Acaitalk.Decorator.IAcai;

public class FacadeAcai {
    
    IAcai acai;
    
    public FacadeAcai(IAcai acai){
        this.acai = acai;
       
    }
    
    public void execute(){
        acai.make();
    }
    public void pack(){
        acai.pack();
    }
    public void price(){
        acai.price();
    }
     public void ReadyRequest(){
         execute();
         pack();
         price();
     }

}

