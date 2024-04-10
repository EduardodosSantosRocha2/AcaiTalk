package com.mycompany.Acaitalk.Observer;

import com.mycompany.Acaitalk.Observer.Observer;
import javax.swing.JOptionPane;

public class Instagram implements Observer{

    @Override
    public void update(String name, double discountPrice, String date) {
        System.out.println("Post de nome "+name+" criado no instagram");
        System.out.println("data do evento "+date);
        System.out.println("Porcentagem de desconto "+(discountPrice*100)+ "%");
        
        
         String message = "<html><body style='width: 300px;'>"
                + "<h1 style='color: blue;'>Post de nome " + name + " criado no Instagram</h1>"
                + "<p>Data do evento: " + date + "</p>"
                + "<p>Porcentagem de desconto: " + (discountPrice * 100) + "%</p>"
                + "</body></html>";
        
        JOptionPane.showMessageDialog(null, message, "Detalhes do Post", JOptionPane.INFORMATION_MESSAGE);
  
    }
    
}
