import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];

        String answer = "";
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            str[i] = sc.nextLine();
            if (str[i].length() > maxLength) maxLength = str[i].length();
        }
        
        for (int i = 0; i < 5; i++) {
            str[i] += " ".repeat(maxLength-str[i].length());
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (str[j].charAt(i)!=' ') answer += str[j].charAt(i);
            }
        }

        System.out.println(answer);
    }
}
