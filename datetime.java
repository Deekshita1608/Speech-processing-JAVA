package VoiceAssistant;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class datetime {
    public void time(){
        speech speak=new speech();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String ans= dtf.format(now);
        String res= "Today's date is: "+ans.substring(0,2)+" "+ans.substring(3,5)+" "+ans.substring(6,10)+".";
        String res2="The time right now is "+ans.substring(11,13)+" hours "+ans.substring(14,16)+" minutes and "+ans.substring(17,19)+" seconds.";
        System.out.println(res);
        System.out.println(res2);
        speak.say(res);
        speak.say(res2);
    }
}