package com.mycompany.Acaitalk.Factory;

import com.mycompany.Acaitalk.Decorator.IAcai;

public interface IAcaiMaker {
    public IAcai makeAcai(String size);
}
