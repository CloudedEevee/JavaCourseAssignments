import java.util.Set;
import java.util.HashMap;

public class Hashmatique {

    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Clean the Rain", "It's never too late / To clean the rain");
        trackList.put("Dragon Call", "When dragons call / They'll breath me back to life");
        trackList.put("Hands Who Hurt", "As your words squeeze my veins / Your hands are always blank");
        trackList.put("Current Dilemna", "To call you is to hurt me / To leave you is to starve me");

        System.out.println("\n**********************************************************************");
        System.out.println(String.format("\n Dragon Call: %s", trackList.get("Dragon Call")));
        System.out.println("\n");
        Set<String> titles = trackList.keySet();
        for(String title : titles) {
            System.out.println(String.format("%s: %s", title, trackList.get(title)));
        }
        System.out.println("\n**********************************************************************");

    }

}