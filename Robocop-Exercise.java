class Robocopexercise {
    public static void main(String[] args) {
        String word = "Robocop";
        int characterIndex = 3;
        String rob = word.substring(0, characterIndex);
        String cop = word.substring(characterIndex + 1);
        System.out.println(rob + cop);
    }
}
