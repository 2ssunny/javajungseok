package Chapter_3;

public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); //앞에 abc는 문장, 뒤에 abc는 ==을 통해 trus or false값 출력
        System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
        
    }
}
