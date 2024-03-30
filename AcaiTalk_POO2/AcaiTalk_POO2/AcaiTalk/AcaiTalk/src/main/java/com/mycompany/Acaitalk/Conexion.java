package com.mycompany.Acaitalk;

import java.io.FileInputStream;
import java.io.IOException;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class Conexion {

    public static com.google.cloud.firestore.Firestore db;

    public static void concetarFirebase() {
        try (FileInputStream coffeeTalkToken = new FileInputStream("coffeetalk.json")) {
            FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(coffeeTalkToken))
                .build();
            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();
            System.out.println("Connection successful");
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}