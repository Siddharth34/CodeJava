public class StringCompaior {
    public static void main(String[] args) {
        String a = "Sid";
        String b = "Sid";

        // System.out.println(a == b); // True
        // its point to the same objects

        String x = new String("Sid");
        String y = new String("Sid");

        System.out.println(x == y); // false
        // Create a new object

        String name1 = "Sid";
        String name2 = "Sid";

        // System.out.println(name1.equals(name2)); // True
        // it dose not care what is object pointed

    }
}
