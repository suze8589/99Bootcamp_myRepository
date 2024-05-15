 class FrontBack {
    public static void main(String[] args) {
        String word = "heisenberg";

        // Receive command line argument if available
        if(args.length > 0) {
            word = args[0];
        }

        // Check if the word has more than one character
        if (word.length() > 1) {
            // Extract the first and last characters
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);

            // Replace the first and last characters
            word = lastChar + word.substring(1, word.length() - 1) + firstChar;
        }

        // Print the modified word
        System.out.println("The modified word is: " + word);
    }
}
