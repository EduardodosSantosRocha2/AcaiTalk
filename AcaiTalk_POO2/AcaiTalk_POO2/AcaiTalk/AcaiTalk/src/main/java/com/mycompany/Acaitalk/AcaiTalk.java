package com.mycompany.Acaitalk;

import com.mycompany.Acaitalk.Template.TemplateAcai;
import com.mycompany.Acaitalk.Firebase.Conexion;
import com.mycompany.Acaitalk.Observer.Instagram;
import com.mycompany.Acaitalk.Decorator.Fruit;
import com.mycompany.Acaitalk.Decorator.Complement;
import com.mycompany.Acaitalk.Observer.EventoComemorativo;
import com.mycompany.Acaitalk.Observer.Subject;
import com.mycompany.Acaitalk.Observer.Observer;
import com.mycompany.Acaitalk.Factory.IAcaiMaker;
import com.mycompany.Acaitalk.Singleton.IAcaiMakerSingleton;
import com.mycompany.Acaitalk.Excel.Devedores;
import com.mycompany.Acaitalk.Excel.LerArquivoExcel;
import com.mycompany.Acaitalk.Excel.PrintArquivoExcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class AcaiTalk {

    public static void main(String[] args) throws IOException {
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
