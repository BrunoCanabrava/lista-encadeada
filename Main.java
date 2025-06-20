public class Main {
    public static void main(String[] args) {
        UniBHList<Integer> myList = new UniBHList<>();

        // Testando inserções
        for (int i = 0; i < 5; i++) {
            myList.insertAtEnd(i + 1);
            System.out.println("Inserindo no final: " + myList);
        }
    }
}