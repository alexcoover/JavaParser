public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser("src/main/java/Palindrome.java");
        System.out.println("Reserved Words:");
        parser.reservedTree.iterativePreorderTraverse();
        System.out.println("\nUser Identifiers:");
        parser.userTree.iterativePreorderTraverse();
    }
}
