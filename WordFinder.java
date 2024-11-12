import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFinder {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            String symbol = s.nextLine();
            String text = "Hufjfesijfie  jijjisjef jilosslef lllf s nfnesfjnfeknsenf";
            String reg = "\\b" + symbol + "\\w*\\b";
            Matcher matcher = Pattern.compile(reg, Pattern.CASE_INSENSITIVE).matcher(text);
            boolean find = false;
            while (matcher.find()) {
                System.out.println(matcher.group());
                find = true;
            }
            if (!find){
                System.out.println("Нет слов");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}