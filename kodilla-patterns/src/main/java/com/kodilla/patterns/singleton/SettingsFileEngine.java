package com.kodilla.patterns.singleton;

public class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileNme = "";

    private SettingsFileEngine() {
    }

    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            synchronized (SettingsFileEngine.class) {
                if (settingsFileEngineInstance == null)
                    settingsFileEngineInstance = new SettingsFileEngine();
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFileNme() {
        return fileNme;
    }

    public void open(final String fileName) {
        this.fileNme = fileName;
        System.out.println( "Opening the settings file" );
    }

    public void close() {
        this.fileNme = "";
        System.out.println( "Closing the settings file" );
    }

    public boolean loadSettings() {
        System.out.println( "Loading settings from file" );
        return true;
    }

    public boolean saveSettings() {
        System.out.println( "Saving setting to file" );
        return true;
    }
}
