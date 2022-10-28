import java.util.Objects;

public class Book {
    private String title;
    public Author author;
    private int publicationYear;

    public  Book (String title, String author, int publicationYear ){

        this.title = title;

        this.publicationYear = publicationYear;

    }

    public String getTitle() {
        return this.title;

    }



    public String toString() {
       return "Название книги " + this.title + " Год публикации " + this.publicationYear + " Автор " + author;
    }


    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setTitle(int publicationYear) {
        this.publicationYear = publicationYear;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
