public class Main {
  //Создайте класс Book (книга), в конструктор которого передавайте
  // автора и название книги.
  //
  //Переопределите сравнение книг: книги должны считаться одинаковыми,
  // если совпадают и название, и автор.

  public static void main(String[] args) {

    Book karenina=new Book("L.Tolstoi","Anna Karenina");
    Book voinaImir=new Book("L.Tolstoi","Krieg und Frieden");
    Book skaski= new Book("H.C.Andersen", "Märchen");
    Book karenina2=new Book("L.Tolstoi","Anna Karenina");

    System.out.println(voinaImir.equals(karenina));
    System.out.println(karenina2.equals(karenina));
    System.out.println(skaski.equals(karenina));

    System.out.println(voinaImir.hashCode());

    //false
    //true
    //false
    //305369995

  }
}