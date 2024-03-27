package com.mycompany.Acaitalk;

public class Instagram implements Observer{

    @Override
    public void update(String name, double discountPrice, String date) {
        System.out.println("Post de nome "+name+" criado no instagram");
        System.out.println("data do evento "+date);
        System.out.println("Porcentagem de desconto "+(discountPrice*100)+ "%");
    }
    
}
