package com.example.yummigo;

import android.app.Application;
import com.example.yummigo.config.FirebaseConfig;

/**
 * Classe Application personnalisée pour initialiser Firebase
 * au démarrage de l'application
 */
public class YummiGoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialiser Firebase
        FirebaseConfig.initialize(this);
    }
}