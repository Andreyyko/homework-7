public class Main {
    public static void main(String[] args) {
        StringStats string = new StringStats("Monsters are real, and ghosts are real too. They live inside us, and sometimes, they win.");
        string.analyseString();
        System.out.println(string);
        System.out.println("Total count of letters: "+string.letterCount());
        System.out.println("Total count of digits: "+string.countDigits());
        System.out.println("Total count of punctuation symbols: "+string.countPunctuation());
        System.out.println("Total count of whitespaces: "+ string.whitespaceCount());
    }
}