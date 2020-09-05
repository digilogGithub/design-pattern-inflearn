package flyweight.case1.step1;

public class Client {
    public static void main(String[] args) {
//        use new -> create new object
        String str1 = new String("홍길동");
        String str2 = new String("홍길동");
        String str3 = "홍길동";
        String str4 = "전우치";
        String str5 = "홍길동";

//        insight debug
        System.out.println("Flyweight Pattern");
    }
}
