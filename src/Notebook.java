import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    private ArrayList<String> book;
    private String[] actionNotebook;

    public Notebook() {
        book = new ArrayList<>();
        actionNotebook = new String[]{"Добавить задачу",
                "Вывести список задач",
                "Удалить задачу",
                "Выход"};
    }

    public void printActionNotebook() {
        System.out.println("Выберите действие:");
        for (int i = 0; i < (actionNotebook.length - 1); i++) {
            System.out.println((i + 1) + ". " + actionNotebook[i]);
            if ("Выход".equals(actionNotebook[i + 1])) {
                System.out.println("0. Выход");
            }
        }
    }

    public int getSlotActionNotebook() {
        return actionNotebook.length;
    }

    public void writerBook(int slot) {
        if ((slot > (getSlotActionNotebook() - 1) || slot < (getSlotActionNotebook() - getSlotActionNotebook()))){
            System.out.println("Введите число от 0 до " + (getSlotActionNotebook() - 1));
        }else {
            switch (slot) {
                case (1) -> {
                    System.out.println("Введите задачу для планирования:");
                    Scanner inputPlan = new Scanner(System.in);
                    String input = inputPlan.nextLine();
                    book.add(input);
                }
                case (2) -> {
                    System.out.println("Список задач:");
                    for (int i = 0; i < book.size(); i++) {
                        System.out.println((i + 1) + ". " + book.get(i));
                    }
                    System.out.println("\n");
                }
                case (3) -> {
                    System.out.println("Введите номер задания которое хотите удалить:");
                    Scanner inputRemove = new Scanner(System.in);
                    int remove = inputRemove.nextInt();
                    if (remove < book.size() || remove > 0) {
                        book.remove(remove - 1);
                        System.out.println("Задание удалено" + "\n");
                    }
                }
            }
        }
    }
}