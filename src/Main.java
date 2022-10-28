public class Main {

    public static void main(String[] args) {
        Book book = new Book("Морфий", "Михаил Булгаков", 1926);


        System.out.println(book.getTitle());


        System.out.println(book.getPublicationYear());


        Book secondBook = new Book("Вий", "Николай Гоголь", 1835);
        Author secondAuthor = new Author("Николай", "Гоголь");
        System.out.println(book.getTitle());
        System.out.println("book.equals(book) = " + book.equals(book));


    }
}
