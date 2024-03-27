package com.mycompany.Acaitalk;

public class AcaiTalk {

    public static void main(String[] args) {
        Conexion.concetarFirebase();
        IAcaiMakerSingleton singleton  = new IAcaiMakerSingleton();
        IAcaiMaker acaiStore1 = singleton.getInstance("acaiStore1");
        IAcai small = acaiStore1.makeAcai("small");
        TemplateAcai templateAcai  = new TemplateAcai(small);
        templateAcai.ReadyRequest();
        
        
        small = new Fruit(new Complement(small));
        
        System.out.println(small.price());
        System.out.println(small.getDesc());
        
        Subject eventoComemorativo = new EventoComemorativo();
        Observer instagram = new Instagram();
        eventoComemorativo.addObserver(instagram);
        
        eventoComemorativo.setName("Palestra como investir seu dinheiro com IA");
        eventoComemorativo.setDate("03/11/2024");
        eventoComemorativo.setDiscountPrice(0.5);
        
        
    }
}
