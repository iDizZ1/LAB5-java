import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IpCheck {
    public static void main(String[] args) {
        try{
            String IP = "11.168.100.255";
            Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])){3}$");
            Matcher matcher = pattern.matcher(IP);
            System.out.println(matcher.matches() ? "корректный IP" : "некоректный IP");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}