import java.util.Scanner;
import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String classRoom;
    private int number;

    private static ArrayList<User> userList = new ArrayList<>();

    public void addUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름");
        name = sc.next();

        System.out.println("학년");
        age = sc.nextInt();

        System.out.println("반");
        classRoom = sc.next();

        System.out.println("번호");
        number = sc.nextInt();

        System.out.println("이름은 " + name + "\n 학년은 " + age + "\n 반은 " + classRoom + "반\n 번호는 " + number + "번 입니다");

        User newUser = new User(name, age, classRoom, number);
        userList.add(newUser);
    }

    public void viewUser() {
        if (userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
        } else {
            System.out.println("등록된 사용자 목록:");
            for (User user : userList) {
                System.out.println("이름: " + user.name + ", 학년: " + user.age + ", 반: " + user.classRoom + ", 번호: " + user.number);
            }
        }
    }

    public void updateUser() {
        Scanner sc = new Scanner(System.in);
    
        if (userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
            return;
        }
    
        System.out.print("수정할 사용자 이름을 입력하세요: ");
        String userName = sc.next();  // Use String instead of char for the username
    
        for (User user : userList) {
            if (user.name.equals(userName)) {
                System.out.println("현재 정보: 이름=" + user.name + ", 학년=" + user.age + ", 반=" + user.classRoom + ", 번호=" + user.number);
    
                System.out.println("새로운 정보를 입력하세요:");
    
                System.out.print("이름: ");
                user.name = sc.next();
    
                System.out.print("학년: ");
                user.age = sc.nextInt();
    
                System.out.print("반: ");
                user.classRoom = sc.next();
    
                System.out.println("사용자 정보가 수정되었습니다.");
                return;
            }
        }
    
        System.out.println("입력한 이름의 사용자를 찾을 수 없습니다.");
    }

    // Implement the deleteUser() method as needed for your use case
    public void deleteUser() {
        Scanner sc = new Scanner(System.in);

        if (userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
            return;
        }

        System.out.print("삭제할 사용자 번호를 입력하세요: ");
        int userNumber = sc.nextInt();

        for (User user : userList) {
            if (user.number == userNumber) {
                userList.remove(user);
                System.out.println("사용자가 삭제되었습니다.");
                return;
            }
        }

        System.out.println("입력한 번호의 사용자를 찾을 수 없습니다.");
    }

    public User() {
        // Default constructor
    }

    public User(String name, int age, String classRoom, int number) {
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
        this.number = number;
    }

    public static void main(String[] args) {
        User user = new User();

        while (true) {
            System.out.println("1. 사용자 등록");
            System.out.println("2. 사용자 조회");
            System.out.println("3. 사용자 수정");
            System.out.println("4. 사용자 삭제");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    user.addUser();
                    break;
                case 2:
                    user.viewUser();
                    break;
                case 3:
                    user.updateUser();
                    break;
                case 4:
                    user.deleteUser();
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("올바르지 않은 선택입니다. 다시 시도하세요.");
            }
        }
    }
}





// import java.util.Scanner;
// import java.util.ArrayList;

// public class User {
//     private String name;
//     private int age;
//     private String classRoom;
//     private int number;

//     public void addUser() {  // 사용자 추가 클래스
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("이름");
//         name = sc.next();

//         System.out.println("학년");
//         age = sc.nextInt();

//         System.out.println("반");
//         classRoom = sc.next();

//         System.out.println("번호");
//         number = sc.nextInt();

//         System.out.println("이름은 "+name+"\n 학년은 "+age+"\n 반은 "+classRoom+"반\n 번호는 "+number+"번 입니다");

//     }

//     public void viewUser(){
        
//     }

//     public void updateUser(){

//     }

//     public static void main(String[] args) {
//         User user = new User(); 
        
//         while (true) {
//             System.out.println("1. 사용자 등록");
//             System.out.println("2. 사용자 조회");
//             System.out.println("3. 사용자 수정");
//             System.out.println("4. 사용자 삭제");
//             System.out.println("5. 종료");
//             System.out.print("원하는 작업을 선택하세요: ");

//             Scanner scanner = new Scanner(System.in);  
//             int choice = scanner.nextInt();
//             scanner.nextLine();

//             switch (choice) {
//                 case 1:
//                     user.addUser();
//                     break;
//                 case 2:
//                     user.viewUser();
//                     break;
//                 case 3:
//                     user.updateUser(); 
//                     break;
//                 case 4:
//                     // 삭제 메서드 호출
//                     break;
//                 case 5:
//                     System.out.println("종료합니다.");
//                     System.exit(0);
//                     break;
//                 default:
//                     System.out.println("올바르지 않은 선택입니다. 다시 시도하세요.");
//             }
//         }
//     }
// }



