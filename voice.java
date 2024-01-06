package VoiceAssistant;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

import java.io.IOException;

public class voice {
    public static void main(String[] args) throws IOException {
        Configuration configuration=new Configuration();
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("file:\\C:\\Users\\Admin\\IdeaProjects\\OOP assignment\\src\\voice_resources\\4280.dic");
        configuration.setLanguageModelPath("file:\\C:\\Users\\Admin\\IdeaProjects\\OOP assignment\\src\\voice_resources\\4280.lm");
        LiveSpeechRecognizer recognize= new LiveSpeechRecognizer(configuration);
        recognize.startRecognition(true);
        SpeechResult result;
        while((result=recognize.getResult())!=null) {
            String command = result.getHypothesis();
            System.out.println("Input command: "+command);
        }
    }
}
