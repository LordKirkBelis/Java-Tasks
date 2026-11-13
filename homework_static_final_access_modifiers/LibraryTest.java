package homework_static_final_access_modifiers;

public class LibraryTest {
    public static void main(String[] args) {
        Library library  = new Library();
        library.setBookTitle("Power");
        System.out.println(library.getBookTitle());
        library.setAuthor("Ivan");
        System.out.println(library.getAuthor());
        library.setYear(15);
        System.out.println(library.getYear());

    }
}
