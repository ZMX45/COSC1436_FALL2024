public class Author
{
    public String name;
    public String email;
    public String nationality;

    public Author(String name, String email, String nationality)
    {
        this.name = name;
        this.email = email;
        this.nationality = nationality;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getNationality()
    {
        return nationality;
    }
    public String toString()
     {
        return ("Author: " + name + " Email: " + email + " Nationality: " + nationality);
     }
}
