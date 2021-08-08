import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 0;
        String currentChampion = "";

        while (!StdIn.isEmpty()) {
            i++;
            String word = StdIn.readString();
            StdOut.println("word: " + word);

            if (StdRandom.bernoulli((double) 1 / i)) {
                currentChampion = word;
            }
        }
        StdOut.println(currentChampion);
    }
}
