package com.mycompany.coffeetalk;

public class AcaiTalk {

    public static void main(String[] args) {
        Conexion.concetarFirebase();
        IAcaiMakerSingleton singleton  = new IAcaiMakerSingleton();
        IAcaiMaker acaiStore1 = singleton.getInstance("acaiStore1");
        IAcai small = acaiStore1.makeAcai("small");
        small.make();
        
        small = new Fruit(new Complement(small));
        
        System.out.println(small.price());
        System.out.println(small.getDesc());
        
        
    }
}
