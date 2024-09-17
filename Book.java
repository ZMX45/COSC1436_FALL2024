public class Book
{
    public String title;
    public double price;
    public Author author;

    public Book(String title, double price, Author author)
    {
        this.title = title;
        this.price = price;
        this.author = author;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public Author getAuthor()
    {
        return author;
    }
     public String toString()
     {
        return ("Title: " + title + " Price: " + price + "\n" + author);
     }
}