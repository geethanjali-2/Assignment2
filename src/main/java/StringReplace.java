public class StringReplace
{

    public static void main(String[] args)
    {
        String str = "I am always ready to learn although I do not always like being taught.";

        // Replace all the 'a' characters with '$' characters.
        String new_str = str.replace('a', '$');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}