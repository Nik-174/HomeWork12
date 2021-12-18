import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Notebook notebook = new Notebook();
        int slot;
        while (true) {
            try {
                notebook.printActionNotebook();
                slot = Integer.parseInt(scanner.nextLine());
                if (slot == (0)) {
                    break;
                } else {
                    notebook.writerBook(slot);
                }
            } catch (RuntimeException e) {
                System.out.println("Вы ошиблись при вводе!");
            }
        }
        System.out.println("До свидания");
    }
}
