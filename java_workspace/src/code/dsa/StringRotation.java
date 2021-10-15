package code.dsa;

class StringRotation {
    static boolean areRotations(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";
        System.out.println(areRotations(str1, str2) + " ==== " + isRotation(str1, str2));
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String doubledString = s1 + s1;
        return doubledString.contains(s2);
    }
}

