public class UpperCaseEachWord {
    public static String convertToUpperCase(String str) {
        StringBuilder scBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || (str.charAt(i - 1) == ' ' && i < str.length() - 1)) {
                scBuilder.append(Character.toUpperCase(str.charAt(i)));
            } else {
                scBuilder.append(str.charAt(i)); // Append the character as is
            }
        }

        return scBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "hi , i am naran khadka";
        System.out.println(convertToUpperCase(str));
    }
}
