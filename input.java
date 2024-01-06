package VoiceAssistant;
import java.util.Scanner;
public class input {
    speech greeting=new speech();
    Scanner sc=new Scanner(System.in);
    String command;
    public String takeinput(){
        greeting.say("Hello! Enter your command below");
        command=sc.nextLine();
        return command;
    }
}
