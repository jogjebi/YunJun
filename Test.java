import java.util.Scanner;
import java.util.ArrayList;

public class Test {
    private String name;
    private int age;
    private String classRoom;
    private int number;

    private static ArrayList<Test> userList = new ArrayList<>();

    public void addUser(String name, int age, String classRoom, int number) {
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
        this.number = number;

        System.out.println("사용자 등록: " + name);
        System.out.println("이름은 " + name + "\n 학년은 " + age + "\n 반은 " + classRoom + "반\n 번호는 " + number + "번 입니다");

        Test newUser = new Test(name, age, classRoom, number);
        userList.add(newUser);
    }

    public void viewUser() {
        if (userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
        } else {
            System.out.println("등록된 사용자 목록:");
            for (Test user : userList) {
                System.out.println("이름: " + user.name + ", 학년: " + user.age + ", 반: " + user.classRoom + ", 번호: " + user.number);
            }
        }
    }

    public void updateUser(String oldName, String newName, int newAge, String newClassRoom) {
        for (Test user : userList) {
            if (user.name.equals(oldName)) {
                System.out.println("사용자 수정: " + oldName);
                System.out.println("현재 정보: 이름=" + user.name + ", 학년=" + user.age + ", 반=" + user.classRoom + ", 번호=" + user.number);

                System.out.println("새로운 정보를 입력하세요:");

                user.name = newName;
                user.age = newAge;
                user.classRoom = newClassRoom;

                System.out.println("사용자 정보가 수정되었습니다.");
                return;
            }
        }

        System.out.println("입력한 이름의 사용자를 찾을 수 없습니다.");
    }

    public void deleteUser(String name) {
        for (Test user : userList) {
            if (user.name.equals(name)) {
                System.out.println("사용자 삭제: " + name);
                userList.remove(user);
                System.out.println("사용자가 삭제되었습니다.");
                return;
            }
        }

        System.out.println("입력한 이름의 사용자를 찾을 수 없습니다.");
    }

    public Test() {
        // Default constructor
    }

    public Test(String name, int age, String classRoom, int number) {
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
        this.number = number;
    }

    public static void main(String[] args) {
        Test user = new Test();

        user.addUser("김민철", 1, "1반", 15);
        user.addUser("김은영", 3, "3반", 30);

        while (true) {
            System.out.println("1. 사용자 등록");
            System.out.println("2. 사용자 조회");
            System.out.println("3. 사용자 수정");
            System.out.println("4. 사용자 삭제");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    user.addUser("새로운사용자", 2, "2반", 20);
                    break;
                case 2:
                    user.viewUser();
                    break;
                case 3:
                    user.updateUser("김민철", "박민철", 2, "2반");
                    break;
                case 4:
                    user.deleteUser("김은영");
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
}
