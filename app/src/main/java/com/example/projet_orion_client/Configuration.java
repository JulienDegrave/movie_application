package com.example.projet_orion_client;

public class Configuration {
    private static final String TAG = "Configuration";

    private static Configuration INSTANCE = null;

    private String background;

    private Configuration() {
        background = "black";
    }

    public static Configuration getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Configuration();
        }
        return INSTANCE;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackground() {
        return background;
    }
}
