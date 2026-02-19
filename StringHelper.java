public class StringHelper {
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public String truncate(String input, int maxSize) {
        if (input == null || input.length() <= maxSize) return input;
        return input.substring(0, maxSize);
    }
}
