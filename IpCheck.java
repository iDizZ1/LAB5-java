import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IpCheck {
    public static void main(String[] args) {
        try{
            String IP = "191.168.1.255";
            Pattern pattern = Pattern.compile("((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])");
            Matcher matcher = pattern.matcher(IP);
            boolean find = false;
            while (matcher.find()) {
                System.out.println(matcher.group());
                find = true;
            }
            if (!find) {
                System.out.println("IP не найден");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}