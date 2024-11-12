import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capital {
    public static void main(String[] args) {
        String text = "Ggfdgf gGgfg gggGGGg";
        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher(text);
        String res = matcher.replaceAll("!$0!");
        System.out.println(res);
    }
}