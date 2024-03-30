package com.mycompany.Acaitalk.Observer;

import com.mycompany.Acaitalk.Observer.Subject;
import com.mycompany.Acaitalk.Observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class EventoComemorativo implements Subject {

    private List<Observer> observers;
    private String name,date;
    private double discountPrice;

    public EventoComemorativo() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observador) {
        observers.add(observador);
    }

    @Override
    public void removeObserver(Observer observador) {
        observers.remove(observador);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(name, discountPrice, date);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
        notifyObserver();
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
        notifyObserver();
    }

    public String getDate() {
        return date;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
        notifyObserver();
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
        notifyObserver();
    }

    

}
