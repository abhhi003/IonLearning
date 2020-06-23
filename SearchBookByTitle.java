import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Book[] book = new Book[4];
        for(int i=0;i<4;i++)
        {
            int id=sc.nextInt();sc.nextLine();
            String title = sc.nextLine().toLowerCase();
            String author = sc.nextLine();
            String temp=sc.next();
            double price = Double.parseDouble(temp);
            book[i] = new Book(id,title,author,price);
        }
        String value = sc.next().toLowerCase();
        List<Book> res = new ArrayList<Book>();
        res = searchTitle(value, book);
        for(int i=0;i<res.size();i++)
        {
            System.out.println(res.get(i).id);
        }
    }

    public static List<Book> searchTitle(String value, Book[] book)
    {
        List<Book> al = new ArrayList<Book>();
        for(int i=0;i<book.length;i++)
        {
            if(book[i].title.contains(value))
            {
                al.add(book[i]);
            }
        }
        Collections.sort(al, new idSorter());
        return al;
    }

}

class idSorter implements Comparator<Book>
{
    public int compare(Book b1, Book b2)
    {
        return b1.id - b2.id;
    }
}

class Book
{
    int id;
    String title;
    String author;
    double price;

    Book(int id, String title, String author, double price)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
}
