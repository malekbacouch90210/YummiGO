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
                    .setApiKey("AIzaSyBqA-luA2kLW8K5D9l6AkN8Q3aGnxGd2MM")  // Remplacez par votre API Key
                    .setApplicationId("1:853800301446:android:c52f5bc1586273116cb207")  // Remplacez par votre App ID
                    .setProjectId("yummigo-dff4e")  // Remplacez par votre Project ID
                    .setDatabaseUrl("https://yummigo-dff4e.firebaseio.com")  // URL de Realtime Database
                    .setStorageBucket("yummigo-dff4e.appspot.com")  // Storage bucket
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