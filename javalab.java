
package labadjavaprog5;

public class labadjavaprog5 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Character Extraction
        System.out.println("Character at index 4: " + str.charAt(4));
        
        char[] charArray = new char[5];
        str.getChars(0, 5, charArray, 0);
        System.out.println("Extracted characters: " + new String(charArray));
        
        // String Comparison
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("String comparison (case-sensitive): " + str1.equals(str2));
        System.out.println("String comparison (case-insensitive): " + str1.equalsIgnoreCase(str2));
        System.out.println("Lexicographic comparison: " + str1.compareTo(str2));
        
        // String Search
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        
        // String Modification
        String modifiedStr = str.replace("World", "Java");
        System.out.println("Modified String: " + modifiedStr);
        
        String trimmedStr = "  Java Programming  ".trim();
        System.out.println("Trimmed String: " + trimmedStr);
        
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseStr);
        
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseStr);
    }
}
