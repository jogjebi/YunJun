import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class User2 {
    private String username;
    private String email;

    public User2(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Email: " + email;
    }
}

public class UserManagementSystem {
    private static ArrayList<User2> userList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. 사용자 등록");
            System.out.println("2. 사용자 조회");
            System.out.println("3. 사용자 수정");
            System.out.println("4. 사용자 삭제");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    displayUsers();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("올바르지 않은 선택입니다. 다시 시도하세요.");
            }
        }
    }

    private static void registerUser() {
        System.out.print("사용자 이름을 입력하세요: ");
        String username = scanner.nextLine();
        System.out.print("이메일을 입력하세요: ");
        String email = scanner.nextLine();

        User2 newUser = new User2(username, email);
        userList.add(newUser);

        System.out.println("사용자가 등록되었습니다.");
    }

    private static void displayUsers() {
        if (userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
        } else {
            System.out.println("등록된 사용자 목록:");
            for (User2 user : userList) {
                System.out.println(user);
            }
        }
    }

    private static void updateUser() {
        System.out.print("수정할 사용자 이름을 입력하세요: ");
        String username = scanner.nextLine();

        Iterator<User2> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User2 user = iterator.next();
            if (user.getUsername().equals(username)) {
                System.out.print("새로운 이메일을 입력하세요: ");
                String newEmail = scanner.nextLine();
                user.setEmail(newEmail);
                System.out.println("사용자 정보가 수정되었습니다.");
                return;
            }
        }

        System.out.println("입력한 이름의 사용자를 찾을 수 없습니다.");
    }

    private static void deleteUser() {
        System.out.print("삭제할 사용자 이름을 입력하세요: ");
        String username = scanner.nextLine();

        Iterator<User2> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User2 user = iterator.next();
            if (user.getUsername().equals(username)) {
                iterator.remove();
                System.out.println("사용자가 삭제되었습니다.");
                return;
            }
        }

        System.out.println("입력한 이름의 사용자를 찾을 수 없습니다.");
    }
}
