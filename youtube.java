package VoiceAssistant;
import java.io.IOException;
import java.net.URI;
import java.awt.Desktop;
import java.net.URISyntaxException;

public class youtube implements browse{

    public void find(String topic) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            String[] searchstr = topic.split(" ");
            String res="";
            for(int i=0;i<searchstr.length-1;i++){
                res=res.concat(searchstr[i]);
                res=res.concat("+");
            }
            res=res.concat(searchstr[searchstr.length-1]);
            try {
                URI uri = new URI("https://www.youtube.com/results?search_query="+res);
                desktop.browse(uri);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
