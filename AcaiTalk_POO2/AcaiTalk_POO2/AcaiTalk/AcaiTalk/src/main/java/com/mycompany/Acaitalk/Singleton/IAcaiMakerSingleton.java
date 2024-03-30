package com.mycompany.Acaitalk.Singleton;

import com.mycompany.Acaitalk.Factory.AcaiStore1;
import com.mycompany.Acaitalk.Factory.IAcaiMaker;

public class IAcaiMakerSingleton {
    private static AcaiStore1 acaiStore1;
    
    public static IAcaiMaker getInstance(String loja){
        if(loja.equals("acaiStore1")){
            if(acaiStore1 == null){
                 acaiStore1 = new AcaiStore1();
            }
        }
        return acaiStore1;
        
    }  
}
