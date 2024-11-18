import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasChecker {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            String password = s.nextLine();

            boolean lengthV = Pattern.compile("^.{8,16}$").matcher(password).find();
            boolean UpperCase = Pattern.compile("[A-Z]").matcher(password).find();
            boolean Digit = Pattern.compile("\\d").matcher(password).find();

            if (!lengthV) {
                System.out.println("Должно быть от 8 до 16 символов.");
            }
            if (!UpperCase) {
                System.out.println("Пароль должен содержать хотя бы одну заглавную букву.");
            }
            if (!Digit) {
                System.out.println("Пароль должен содержать хотя бы одну цифру.");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}