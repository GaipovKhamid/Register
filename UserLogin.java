import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserLogin {
    public void start() {
        boolean b = true;
        while (b) {
            System.out.println(" 1. Sign in");
            System.out.println(" 2. Sign up");

            Scanner scanner1 = new Scanner(System.in);
            int chooseNumMenu = scanner1.nextInt();

            switch (chooseNumMenu) {
                case 1:
                    User user = loginUser();
                    addToMap(user);
                    break;
                case 2:
                    signUser();
                    break;
            }
        }
    }

    public User loginUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email:  ");
        String email = scanner.next();

        System.out.print("Enter your password:  ");
        String password = scanner.next();

        User user = new User();
        user.email = email;
        user.password = password;

        return user;
    }

    public void addToMap(User user) {
        List userList = new ArrayList();

        userList.add(user.email);
        userList.add(user.password);
    }

    public void signUser() {
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter your email:  ");
        String email1 = scanner2.nextLine();

        System.out.print("Enter your password:  ");
        String password1 = scanner2.nextLine();

        if (loginUser().getEmail().equals(email1) && loginUser().getPassword().equals(password1)) {
            System.out.println("You are signing in your account");
        } else {
            System.out.println("Your account is wrong!");
        }
    }
}