// HiddenWord.java - Andrew Khadder

public class HiddenWord {
    private String word = "";

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String getHint (String guess) {
        String result = "";
        for (int i = 0; i < guess.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.substring(j, j+1).equals(guess.substring(i, i+1)) && j == i) { // checks if the letter is in the same place and is the same.
                    result += word.substring(j, j+1);
                } else if (word.substring(j, j+1).equals(guess.substring(i, i+1)) && j != i) { // checks if the letter is in the word, but not in the same place
                    result += "+";
                }
            }
            if (result.length() <= i) { // checks if the letter wasnt found in the word at all
                result += "*";
            }
        }
        return result;
    }
}