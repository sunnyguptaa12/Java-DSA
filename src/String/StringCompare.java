package String;

public class StringCompare {
    public static void main(String[] args) {

        String str = "aaabbccczz";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for(int i = 0; i < str.length(); i++){
            if(i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)){       //check if the next character is the same
                count++;
            } else {

                compressed.append(str.charAt(i));                                 //append character and its final count
                compressed.append(count);
                count = 1;                                                        //reset count for next character group

            }
        }

        System.out.println("Compressed string: " + compressed);
    }
}
