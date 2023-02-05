import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class main{

    public static List<String> getWords(String text) {
        List<String> words = new ArrayList<String>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
            }
        }

        return words;
    }
    public static void main(String[] args) {
        System.out.println(getWords(" Бааівівяяя яя A PT CR M0RT BOUSG SABN NTE TR/GB/(G) = RAND(MIN(XXX, YY + ABC))"));
    }

}
