import java.util.*;
public class StringStats {
        private final HashMap <Character, Integer> strStats;
        private String originalString = "";
        StringStats() {
            strStats = new HashMap<>();
        }

        StringStats(String strToAnalyse) {
            this();
            originalString = strToAnalyse.toLowerCase();
            setStringForAnalysis(originalString);
        }

        public void setStringForAnalysis(String strToAnalyse) {

            char[] strToAnalyseArray = strToAnalyse.toCharArray();

            for (Character ch : strToAnalyseArray) {
                strStats.put(ch, 0);
            }
        }

        public void analyseString() {

            for (Character ch : originalString.toCharArray()) {

                if (strStats.containsKey(ch))
                    strStats.put(ch, strStats.get(ch) + 1);
            }
        }

        public int countDigits() {
            int digitCount = 0;
            for (Character ch : strStats.keySet()) {
                if (Character.isDigit(ch))
                    digitCount += strStats.get(ch);

            }
            return digitCount;
        }

        public int letterCount() {
            int lettersCount = 0;
            for (Character ch : strStats.keySet()) {
                if (Character.isAlphabetic(ch))
                    lettersCount += strStats.get(ch);
            }
            return lettersCount;
        }

        public int whitespaceCount() {
            return strStats.get(' ');
        }

        public int countPunctuation() {
            int punctuationCount = 0;
            for (Character ch : strStats.keySet()) {
                if (ch.equals('!') | ch.equals('.') | ch.equals('?') | ch.equals(':') | ch.equals(';') |
                        ch.equals(',') | ch.equals('-') | ch.equals('(') | ch.equals(')'))
                    punctuationCount += strStats.get(ch);
            }
            return punctuationCount;
        }

        @Override
        public String toString() {
            return "ParseString{" + '\n' +
                    "strStats=" + strStats.toString() + '\n' +
                    "Total count of letters: " + letterCount() + '\n' +
                    "Total count of digits: "+ countDigits() + '\n' +
                    "Total count of punctuation symbols: " + countPunctuation() + '\n' +
                    "Total count of whitespaces: " + whitespaceCount() + '\n' +
                    '}';
        }

        public HashMap<Character, Integer> getStats() {
            return strStats;
        }
}
