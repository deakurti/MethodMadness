public class DKurtiLib {

    public static boolean isPalindrome(String str) {

        int first = 0;
        int last = str.length()-1;
        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;

    }
    public static boolean dateStr (String str1) {

        str dd = str1.substring (int 3 , int 5);
        str mm = str1.substring (int 0 , int 2);
        str yyyy = str1.substring (int 6 , int 10);
        return ("mm" - "dd" - "yyyy")

    }

}