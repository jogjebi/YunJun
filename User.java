import java.util.Scanner;
import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String classRoom;
    private int number;

    public void addUser() {  // 사용자 추가 클래스
        Scanner sc = new Scanner(System.in);
        
        System.out.println("이름");
        name = sc.next();

        System.out.println("학년");
        age = sc.nextInt();

        System.out.println("반");
        classRoom = sc.next();

        System.out.println("번호");
        number = sc.nextInt();

        System.out.println("이름은 "+name+"\n 학년은 "+age+"\n 반은 "+classRoom+"반\n 번호는 "+number+"번 입니다");

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
                    // 조회 메서드 호출  예시: ViewUser();
                    break;
                case 3:
                    // 수정 메서드 호출  
                    break;
                case 4:
                    // 삭제 메서드 호출
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
