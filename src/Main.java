import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В. В.", 12345, "Экономический факультет", "10.08.1988", "965-455-67-00");
        readers[1] = new Reader("Иванов А. А.", 54321, "Медицинский факультет", "14.02.2005", "965-611-41-72");
        readers[2] = new Reader("Кузнецов А. С.", 67890, "Юридичекий факультет", "05.10.1998", "954-850-44-20");
        readers[3] = new Reader("Руфов К. Д.", 13579, "Физический факультет", "55.04.1995", "963-857-99-33");
        readers[4] = new Reader("Ульянов С. М.", 24680, "Исторический факультет", "01.04.1993", "988-419-33-69");

        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");

        readers[2].returnBook("Книга по бизнесу", "Роман", "Детектив");
        readers[3].returnBook(2);
    }

}

class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String date;
    private String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, String date, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int num) {
        System.out.println(fullName + " взял " + num + " книги");
    }

    public void takeBook(String... bookName) {
        System.out.print(fullName + " взял книги: ");
        for (String book : bookName) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(int num) {
        System.out.println(fullName + " вернул " + num + " книги");
    }

    public void returnBook(String... bookName) {
        System.out.print(fullName + " вернул книги: ");
        for (String book : bookName) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

}
