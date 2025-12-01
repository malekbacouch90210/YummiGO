package com.example.yummigo.config;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class FirebaseConfig {

    private static boolean isInitialized = false;

    /**
     * Initialise Firebase avec les options manuelles
     * @param context Context de l'application
     */
    public static void initialize(Context context) {
        if (!isInitialized) {
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setApiKey("")  // Remplacez par votre API Key
                    .setApplicationId("")  // Remplacez par votre App ID
                    .setProjectId("")  // Remplacez par votre Project ID
                    .setDatabaseUrl("")  // URL de Realtime Database
                    .setStorageBucket("")  // Storage bucket
                    .build();

            try {
                FirebaseApp.initializeApp(context, options);
                isInitialized = true;
            } catch (IllegalStateException e) {
                // Firebase déjà initialisé
                isInitialized = true;
            }
        }
    }

    /**
     * Vérifie si Firebase est initialisé
     * @return true si initialisé, false sinon
     */
    public static boolean isFirebaseInitialized() {
        return isInitialized;
    }
}