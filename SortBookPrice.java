import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static List<Book> sortBooksByPrice(Book[] b)
    {
        List<Book> ans = new ArrayList<Book>();
        for(int i=0;i<4;i++)
        {
            ans.add(b[i]);
        }
        Collections.sort(ans ,new priceSorter());
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int id=0;
        String title="";
        String author="";
        double price=0.0;
        Book[] b = new Book[4];
        for(int i=0;i<4;i++)
        {
            id = sc.nextInt();
            title = sc.next();
            author = sc.next();
            price = sc.nextDouble();
            b[i] = new Book(id, title, author, price);
        }
        List<Book> res = new ArrayList<Book>();
        res = sortBooksByPrice(b);
        for(Book b1 : res)
        {
            System.out.println(b1.id+" "+b1.title+" "+b1.author+" "+b1.price);
        }
    }
}
class Book
{
    int id;
    String title;
    String author;
    double price;
    Book(int id, String title,String author, double price)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
}
class priceSorter implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        double d = b1.price - b2.price;
        if (d>0) return 1;
        if (d<0) return -1;
        return 0;
    }
}
