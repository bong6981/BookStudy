package practice.Pr9;

public class Pr9_4 {
    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));

    }
    public static boolean contains(String src, String target){
        return src.contains(target);
    }
}
