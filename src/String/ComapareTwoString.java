package String;

public class ComapareTwoString {
    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "banana";

        int result = str1.compareTo(str2);

        if(result == 0){
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        }else {
            System.out.println(str1 + " comes after " + str2);
        }
    }
}
