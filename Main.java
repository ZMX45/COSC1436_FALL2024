public class Main
{
    public static void main(String [] args)
    {
     Author author1 = new Author("J.R.R. Tolkien", "jrrtolkien@example.com", "British");
     Book book1 = new Book("The Lord of the Rings", 19.99, author1);
     System.out.println(book1);
    }
}
