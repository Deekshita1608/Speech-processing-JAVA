import VoiceAssistant.*;

public class Main {
    public static void main(String[] args) {
        //Taking input from user using input class
        input in = new input();
        String text = in.takeinput();
        text = text.toLowerCase();
        if (text.contains("date") | text.contains("time")) {
            datetime dt = new datetime();
            dt.time();
        } else if (text.contains("weather")) {
            weather w= new weather();
            w.find("weather");
        } else if (text.contains("what is") | text.contains("where is") | text.contains("who is")) {
            int i = 0;
            if (text.contains("what is")) {
                i = text.indexOf("what is") + "what is".length();
            } else if (text.contains("where is")) {
                i = text.indexOf("where is") + "where is".length();
            } else if (text.contains("who is")) {
                i = text.indexOf("who is") + "who is".length();
                TitleCase t=new TitleCase();
                text=t.toTitle(text);
            }
            wiki w = new wiki();
            w.find(text.substring(i));
        } else if (text.contains("play")) {
            int i = text.indexOf("play") + "play".length();
            youtube y = new youtube();
            y.find(text.substring(i));
        } else if (text.equals("calculate") | text.equals("addition") | text.equals("subtraction") | text.equals("multiplication") |
                text.equals("division")) {
            calculations c = new calculations();
            c.answer();
        } else if (text.contains("hello") | text.contains("hii")) {
            greet g = new greet();
            g.Speak();
        } else if (text.contains("search for") | text.contains("google")) {
            int i = 0;
            if (text.contains("search for")) {
                i = text.indexOf("search for") + "search for".length();
            } else if (text.contains("google")) {
                i = text.indexOf("google") + "google".length();
            }
            google g = new google();
            g.find(text.substring(i));
        }
    }
}