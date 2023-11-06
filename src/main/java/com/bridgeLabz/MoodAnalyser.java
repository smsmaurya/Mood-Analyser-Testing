package com.bridgeLabz;

public class MoodAnalyser {

    String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {

    }

    public String moodAnalyse(String message) {
        if (message.contains("My mood is sad")){
            return "SAD";
        }
        if (message.contains("My mood is happy")){
            return "HAPPY";
        }
        return "";
    }

    public String moodAnalyserConstructor() {
        if(message.contains("I am in sad mood")){
            return "SAD";
        } else if(message.contains("I am in Happy mood")){
            return "HAPPY";
        }
        return "";
    }
}
