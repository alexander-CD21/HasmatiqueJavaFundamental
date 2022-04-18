import java.util.HashMap;
import java.util.Set;

public class Hasmatique{
    public static void main(String args[]){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Bullets","I used to know a man that could");
        trackList.put("Face Myself","Regarding to all those thoughts i had");
        trackList.put("Call the brothers","All right i want to hear from you");
        trackList.put("Forgetting You"," Maybe god is playing the dice again");

        Set<String> titleID = trackList.keySet();
        for( String key: titleID ){
            System.out.println( key + " : " + trackList.get(key));
            System.out.println("------------------------");
        }
    }
}