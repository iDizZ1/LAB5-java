import java.util.regex.*;
public class NumberFinder {
    public static void main(String[] args) {
        try {
            String text = "The price of the product is $19.99";
            Pattern pattern = Pattern.compile("\\d+\\.\\d+");
            Matcher matcher = pattern.matcher(text);
            boolean find = false;
            while (matcher.find()) {
                System.out.println(matcher.group());
                find = true;
            }
            if (!find) {
                System.out.println("Числа не найдены");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}