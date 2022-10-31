import java.util.Objects;

public class Book {
    private String title;
    public Author author;
    private int publicationYear;

    public  Book (String title, Author author, int publicationYear ){

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getTitle() {
        return this.title;

    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }



    public String toString() {
       return "Название книги " + this.title + " Год публикации " + this.publicationYear + " Автор " + this.author;
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
