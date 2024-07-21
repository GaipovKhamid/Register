import java.util.Scanner;

public class UserLogin {
    User[] userArr = new User[10];
    int userIndex = 0;

    public void start() {
        User user = loginUser();
        addToArray(user);
        signUp(user);
    }

    public void signUp(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email >>> ");
        String email1 = scanner.next();

        System.out.print("Enter your password >>> ");
        String password2 = scanner.next();

        if (email1.equals(user.email)) {
            if (password2.equals(user.password)) {
                System.out.println("Welcome to site");
            } else {
                System.out.println("Your password is wrong");
            }
        } else {
            System.out.println("Your email is wrong.");
        }
    }

    public User loginUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email >>>  ");
        String email = scanner.next();

        System.out.print("Enter your password >>>  ");
        String password = scanner.next();


        System.out.print("Enter your password again >>>  ");
        String password_again = scanner.next();

        if (password_again.equals(password)) {

        } else {
            System.out.println("Your second password is wrong.");
        }

        User user = new User();
        user.email = email;
        user.password = password;

        return user;
    }

    public void addToArray(User user) {
        if (!isValidEmail(user)) {
            return;
        }
        if (userIndex == userArr.length) {
            User[] newArr = new User[userArr.length * 2];

            for (int i = 0; i < userArr.length; i++) {
                newArr[i] = userArr[i];
            }
            userArr = newArr;
            System.out.println("Created new table");
        }
        userArr[userIndex] = user;
        userIndex++;
        System.out.println("User Added");
    }

    public boolean isValidEmail(User user) {
        if (user.email == null || !user.email.endsWith("@gmail.com")) {
            System.out.println("Your email is wrong");
            return false;
        }
        if (user.password == null || user.password.trim().length() < 8) {
            System.out.println("Password is wrong");
            return false;
        }
        return true;
    }

}