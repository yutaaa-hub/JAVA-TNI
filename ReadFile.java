import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static String hide_password(String password) {
        String hidepassword = "";
        for (int i = 0 i < password.length(); i++) {
            if (i == 0)
                hidepassword += password.charAt(i);
            else if (i == password.length() - 1)
                hidepassword += password.charAt(i);
            else hidepassword += '*';

        }
    }

    public static void main(String[] args) throws IOException {

        File filename = new File("src/users (1).txt");
        Scanner scanner = new Scanner(filename);

        while(scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            //data[0] username
            //data[1] password
            //data[2] gender
            //data[3] birthyear
            String username = data[0];
            String password = data[1];
            String gender = data[2];
            int birthyear = Integer.parseInt(data[3]);

            System.out.println("Username = " + username);
            System.out.println("Password = " + password);
            System.out.println("Gender = " + gender);
            System.out.println("Borth year = " + birthyear);
        }
        scanner.close();
    }
}
