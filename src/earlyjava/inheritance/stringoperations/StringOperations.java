package earlyjava.inheritance.stringoperations;

class StringOperations {
    public static int WordCount(String str) {
        int count = 0;
        String[] tokens = str.split(" ");
        for (String b : tokens) {
            count++;
        }
        return count;
    }

    public static String arrayToString(char[] array) {
        StringBuilder str = new StringBuilder();
        for (char c : array) {
            str.append(c);
        }
        return str.toString();
    }

    public static String replaceSubstring(String s1, String s2, String s3) {
        return s1.toLowerCase().replace(s2, s3);
    }
}
