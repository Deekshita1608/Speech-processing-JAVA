package VoiceAssistant;

public class TitleCase {
    public String toTitle(String text){
        String[] arr=text.split("[ ,?!]");
        String ans="";
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
            ans=ans+" "+arr[i];
        }
        ans=ans.trim();
        return ans;
    }
}
