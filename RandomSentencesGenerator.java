import java.util.Random;
import java.util.Scanner;


public class RandomSentencesGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Ivan", "Petar", "Georgi", "Ivailo", "Dido"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};

        System.out.println("Hello this is random-generated sentence: ");

        String command = "";

        while (!command.equals("End")) {

            String randomName = getRandomWords(names);
            String randomPlaces = getRandomWords(places);
            String randomverbs = getRandomWords(verbs);
            String randomNouns = getRandomWords(nouns);
            String randomAdverbs = getRandomWords(adverbs);
            String randomDetails = getRandomWords(details);

            System.out.printf("%s from %s %s %s %s %s\n", randomName, randomPlaces, randomverbs, randomNouns, randomAdverbs, randomDetails);
            System.out.println("Press [ENTER] to new one or write End to exit");

            command = scanner.nextLine();
        }


    }

    public static String getRandomWords(String[] words) {

        Random random = new Random();

        int randomIndex = random.nextInt(words.length);

        String word = words[randomIndex];

        return word;
    }

}