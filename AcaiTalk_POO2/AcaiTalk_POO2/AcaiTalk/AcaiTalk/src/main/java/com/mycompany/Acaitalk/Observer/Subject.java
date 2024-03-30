package com.mycompany.Acaitalk.Observer;

import com.mycompany.Acaitalk.Observer.Observer;

public interface Subject {
    public void addObserver(Observer observador);
    public void removeObserver(Observer observador);
    public void notifyObserver();
    public void setName(String name);
    public void setDiscountPrice(double discountPrice);
    public void setDate(String date);   
}
