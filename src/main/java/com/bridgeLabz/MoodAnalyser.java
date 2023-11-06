package com.bridgeLabz;

public class MoodAnalyser {
    
    public String moodAnalyse(String message) {
        if (message.contains("My mood is sad")){
            return "SAD";
        }
        if (message.contains("My mood is happy")){
            return "HAPPY";
        }
        return null;
    }
}
