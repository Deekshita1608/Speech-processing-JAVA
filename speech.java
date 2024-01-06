package VoiceAssistant;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class speech
{
    public void say(String text)
    {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice;

        voice = VoiceManager.getInstance().getVoice("kevin16");
        if (voice != null)
        {
            voice.allocate();
        }
        try
        {
            voice.setRate(125);
            voice.getPitch();
            voice.getVolume();
            voice.speak(text);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}  