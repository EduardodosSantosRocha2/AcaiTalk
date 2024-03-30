package com.mycompany.Acaitalk.Factory;

import com.mycompany.Acaitalk.AcaiExtraLarge;
import com.mycompany.Acaitalk.AcaiLarge;
import com.mycompany.Acaitalk.AcaiMedium;
import com.mycompany.Acaitalk.AcaiSmall;
import com.mycompany.Acaitalk.IAcai;

public class AcaiStore1 implements IAcaiMaker{

    @Override
    public IAcai makeAcai(String size) {
        if(size.equals("small")){
            return new AcaiSmall();
        }else if(size.equals("medium")){
             return new AcaiMedium();
        }else if(size.equals("large")){
             return new AcaiLarge();
        }else if(size.equals("extra large")){
             return new AcaiExtraLarge();
        }
        else{
            return null;
        }
        
    }   
}
