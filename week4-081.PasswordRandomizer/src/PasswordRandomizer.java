import java.util.Random;

public class PasswordRandomizer {
    int length;
    Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        StringBuilder password = new StringBuilder();
        for(int i = 0; i<length; i++) {
            int num = random.nextInt(26);
            char c = "abcdefghijklmnopqrstuvwxyz".charAt(num);
            password.append(c);
        }
        return password.toString();
    }
}
