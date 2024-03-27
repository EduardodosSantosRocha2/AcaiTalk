package com.mycompany.coffeetalk;

public class TemplateSorveteria {
    double size;
    double value;
    String FormPay;
    public TemplateSorveteria(int size, double value, String FormPay){
        this.size = size;
        this.value = value;
        this.FormPay = FormPay;
    }
    public void execute(){
        System.out.println("Fazendo açai");
    }
    public void pack(){
        System.out.println("embalando...");
    }
     public void price(){
        System.out.println("Precificando...");
    }
     public void ReadyRequest(){
         execute();
         pack();
         price();
     }

}

