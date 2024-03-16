
package com.mycompany.coffeetalk;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FuncionarioProvider {  
    CollectionReference references;
    static Firestore db;
    
    public static boolean salvarFuncionario(String coleccion, String documento, Map<String, Object> data){
        try{
             db = FirestoreClient.getFirestore();
             DocumentReference docRef = db.collection(coleccion).document(documento);
             ApiFuture<WriteResult> result = docRef.set(data);
             System.out.println("Connection successful");
             return true;
        }catch(Exception e){
            System.err.println("Erro: " + e.getMessage());
        }
        
       return false;
    }
    
    public static boolean atualizarFuncionario(String coleccion, String documento, Map<String, Object> data){
        try{
             db = FirestoreClient.getFirestore();
             DocumentReference docRef = db.collection(coleccion).document(documento);
             ApiFuture<WriteResult> result = docRef.update(data);
             System.out.println("Update successful");
             return true;
        }catch(Exception e){
            System.err.println("Erro: " + e.getMessage());
        }
        
       return false;
    }
    
    public static boolean eliminarFuncionario(String coleccion, String documento){
        try{
             db = FirestoreClient.getFirestore();
             DocumentReference docRef = db.collection(coleccion).document(documento);
             ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
             System.out.println("Eliminate successful");
             return true;
        }catch(Exception e){
            System.err.println("Erro: " + e.getMessage());
        }
        
       return false;
    }
    
    public static void carregarTabelaFuncionario(JTable table){
        
        DefaultTableModel model = new  DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nome");
        model.addColumn("CPF");
        model.addColumn("Idade");
        model.addColumn("Email");
        model.addColumn("Numero telefone");
        try{
           CollectionReference funcionarios = Conexion.db.collection("Funcionario");
           ApiFuture<QuerySnapshot> querySnap = funcionarios.get();
           
           for(DocumentSnapshot document :  querySnap.get().getDocuments()){
               model.addRow(new Object[]{
                  document.getId(),
                  document.getString("Nome"),
                  document.getString("CPF"),
                  document.getDouble("Idade"),
                  document.getString("Email"),
                  document.getString("Numero Telefone")
           }); 
            }  
        }catch(Exception e){
            System.err.println("Erro: " + e.getMessage());
        }
        
        
        table.setModel(model);
    }
}
