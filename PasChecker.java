import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasChecker {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            String password = s.nextLine(); //Hello123 hello2134
            Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,16}$");
            Matcher matcher = pattern.matcher(password);
            System.out.println(matcher.matches() ? "корректный пароль" : "некоректный пароль");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}