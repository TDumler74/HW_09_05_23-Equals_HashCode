import java.util.Objects;

public class Book {

  private String author;
  private String title;

  public Book(String author, String title) {
    this.author = author;
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "author : " + author +", title : " + getTitle();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Book book)) {
      return false;
    }
    return Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(
        getTitle(), book.getTitle());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAuthor(), getTitle());
  }
}
