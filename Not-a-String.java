class NotaString {
    public static void main(String[] args) {
        String word = "semicolon";


        if (args.length > 0) {
            word = args[0];
        }


        if (!word.startsWith("not")) {
            word = "not " + word;
        }


        System.out.println(word);
    }
}
