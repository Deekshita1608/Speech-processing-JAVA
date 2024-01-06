package VoiceAssistant;

public class greet
{
    speech speak = new speech();
    public void Speak()
    {
        speak.say("Hello, how are you ?");
        System.out.println("Hello, how are you ?");
        speak.say("HHow may I help you ?");
        System.out.println("How may I help you ?");
    }
}
