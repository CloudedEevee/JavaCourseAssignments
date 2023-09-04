import java.util.Date;
import java.util.Calendar;


public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        String newGuestGreeting = String.format("Hello %s, pleasure to make your aquaintance. I am AlfredBot.", name);
        return newGuestGreeting;
    } 

    public String guestGreeting(String name, String dayPeriod) {
        String newGuestGreeting = String.format("Good %s, %s. Pleasure to make your aquaintance. I am AlfredBot.", dayPeriod, name);
        return newGuestGreeting;
    }

    public String dateAnnouncement() {
        Calendar thisDate = Calendar.getInstance();
        int day, month, year;
        day = thisDate.get(Calendar.DATE);
        month = thisDate.get(Calendar.MONTH) + 1; // MONTH is 0-indexed, add 1 for human readability
        year = thisDate.get(Calendar.YEAR);
        String dateAnnounce = String.format("Today's date is %d/%d/%d.", month, day, year);
        return dateAnnounce;
    }
        
    public String respondBeforeAlexis(String conversation) {
        String response = "";
        if (conversation.indexOf("Alexis") != -1) {
            response = "Don't worry about her, sir. She's never much help anyways, so I'll take care of it.";
        }
        else if (conversation.indexOf("Alfred") != -1) {
            response = "Consider it done, sir.";
        }
        else {
            response = "I'm here if you need me, sir.";
            }
        return response;
    }

    public String profanityWarning(String heardPhrase) {
        String response = "";
        if (heardPhrase.indexOf("crap") != -1 || heardPhrase.indexOf("Crap") != -1) {
            response = "Please keep your words civil, sir!";
        }
        else {
            response = "Glad to hear you're watching your profanity more, sir.";
        }
        return response;
    }
        
        // NINJA BONUS
        // See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}

