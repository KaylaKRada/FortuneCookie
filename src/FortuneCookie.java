import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        String[] fortunes = {
              "Your kindness will be repaid in ways you never imagined",
              "The answer you seek is hidden in plain sight... or your junk drawer",
              "A smile is your superpower - use it wisely",
              "You will debug something successfully.. but only after asking for help",
              "An unexpected detour may take you exactly where you need to be",
              "The best way to predict the future is to create it",
              "You will find a solution to a problem that has been bugging you",
              "You will soon find joy in the simple things - pay attention",
        };

        Random random = new Random();
        int index = random.nextInt(fortunes.length);
        System.out.println("Your fortune: " + fortunes[index]);
    }
}
