public class Main {

    public static void main(String[] args) {
        Book book = new Book("Морфий", "Михаил Булгаков", 1926);
        Author author = new Author("Михаил","Булгаков");

        System.out.println(book.getTitle());
        System.out.println(book.getNameAuthor());
        System.out.println("book.getTitle() = " + book.getTitle());
        System.out.println(book.getPublicationYear());
        System.out.println(author.getFirstName());
        System.out.println(author.getSecondName());

        Book secondBook = new Book("Вий", "Николай Гоголь", 1835);
        Author secondAuthor = new Author("Николай", "Гоголь");

    }
}
