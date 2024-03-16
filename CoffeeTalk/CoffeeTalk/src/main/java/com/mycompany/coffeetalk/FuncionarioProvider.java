
package com.mycompany.coffeetalk;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;


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
}
