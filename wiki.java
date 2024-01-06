package VoiceAssistant;
import io.github.fastily.jwiki.core.*;
import io.github.fastily.jwiki.dwrap.*;

public class wiki implements browse {
    Wiki wiki = new Wiki.Builder().build();
    speech speak=new speech();
    public void find(String topic){
        if(wiki.exists(topic)) {
            String res = wiki.getTextExtract(topic);
            System.out.println(res);
            int i=res.indexOf("(");
            int j=res.indexOf(")");
            res=res.substring(0,i)+" "+res.substring(j);
            speak.say(res);
        }
        else {
            System.out.println("Sorry! No search results found!");
            speak.say("Sorry! No search results found!");
        }
        }
    }
