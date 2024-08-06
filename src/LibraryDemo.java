import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LibraryDemo {
    public static void main(String[] args) {

        Book book2 = new Book();
        book2.setAuthor("Marin Preda");
        book2.setISBN("1234567898765");
        book2.setTitle("Morometii");

        Book book1 = new Book();
        book1.setAuthor("Liviu Rebreanu");
        book1.setTitle("Ion");
        book1.setISBN("1234223232322");


        Magazine magazine1 = new Magazine();
        magazine1.setTitle("Bravo");
        magazine1.setAuthor("Ion Minoiu");
        magazine1.setIssueNumber(15);


        Magazine magazine2 = new Magazine();
        magazine2.setTitle("Lumea Stomatologica");
        magazine2.setAuthor("Dr Alex Duma");
        magazine2.setIssueNumber(22);

        List<LibraryItem> items = new ArrayList<>();
        items.add(book1);
        items.add(book2);
        items.add(magazine1);
        items.add(magazine2);


        for(LibraryItem item : items){
            System.out.println(item.getDescription());
        }

    }
}