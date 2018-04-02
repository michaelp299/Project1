import java.util.Scanner;

public class Words {
    public String word [];
    private int count;

    public Words(String[] word, int count) {
        this.word = word;
        this.count = count;
    }

    public Words(int count) {
        this.count = count;
        this.word = new String[count];
    }

    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int searchLongWord(){
        int len = 0;
        int number = 0;

        for (int i = 0; i < word.length; i++) {
            if(word[i].length()>len){
                len = word[i].length();
                number = i;
            }
        }
        return number;
    }

    public void inputWords(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < word.length; i++) {
            word[i] = scanner.next();
        }
        scanner.close();
    }
    public void output(int number){
        System.out.printf("Самое длинное слово: %s\n", word[number]);
        System.out.printf("Его номер: %d", number + 1);
    }

}
