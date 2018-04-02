import java.io.*;
import java.util.*;

public class Base {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\Mike\\Desktop\\1.txt";
        Scanner scanner = new Scanner(new File(fileName));

        List<String> words = new ArrayList<String>();

        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            words.add(word);
        }

        System.out.println("Слова содержащиеся в файле\n" + words + "\n");

        Collections.sort(words);

        Map<String, Integer> statistics = new HashMap<>();

        for (String word: words)  {
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }

        int maxReapet = 0;

        Object keyWord = new Object();

        for (Map.Entry entry : statistics.entrySet()) {
            if (maxReapet < (int) entry.getValue()){
                maxReapet = (int) entry.getValue();
                keyWord = entry.getKey();
            }
        }

        System.out.println("Слова содержащиеся в файле после сортировки\n" + words + "\n");
        System.out.println("Количество повторений слов\n" + statistics + "\n");
        System.out.println("Самое часто встречающееся слова: " + keyWord + "\nОно встречается " + statistics.get(keyWord) + " раз");
    }
}
