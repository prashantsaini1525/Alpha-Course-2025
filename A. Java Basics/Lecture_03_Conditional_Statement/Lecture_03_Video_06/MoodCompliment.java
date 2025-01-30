import java.util.Scanner;

public class MoodCompliment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey Himani, how are you feeling today? (Happy, Sad, Excited, Tired, Romantic, Periods): ");
        String mood = scanner.nextLine().toLowerCase();

        if (mood.equals("happy")) {
            System.out.println("You shine brighter than the sun when you're happy, Himani! 🌞❤️");
        } else if (mood.equals("sad")) {
            System.out.println("Don’t worry, Himani, my arms are always here to hug your sadness away! 🤗💖");
        } else if (mood.equals("excited")) {
            System.out.println("Your excitement makes the world so much more vibrant, Himani! 😍✨");
        } else if (mood.equals("tired")) {
            System.out.println("You work so hard, Himani. Let me take care of you today! 🛌💤");
        } else if (mood.equals("romantic")) {
            System.out.println("My heart skips a beat every time I see you, Himani. You’re my forever and always. ❤️💋");
        } else if (mood.equals("periods")) {
            System.out.println("Hey Himani, I know this time can be tough, but I’m here to make it a little easier for you. Rest up, and remember you're my strongest girl! 💕🌸");
            System.out.println("Special Quote for You: 'Even on your toughest days, you are the most beautiful and brave person I know.' ❤️");
        } else {
            System.out.println("No matter what mood you're in, Himani, you are perfect to me. 💕");
        }

        scanner.close();
    }
}
