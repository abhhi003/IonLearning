import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static List<Document> docsWithOddPages(Document[] d)
    {
        List<Document> ans = new ArrayList<Document>();
        for(int i=0;i<d.length;i++)
        {
            if(d[i].pages%2!=0)
            {
                ans.add(d[i]);
            }
        }
        Collections.sort(ans ,new idSorter());
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int id=0;
        String title="";
        String folderName="";
        int pages=0;
        Document[] d = new Document[4];
        for(int i=0;i<4;i++)
        {
            id = sc.nextInt();
            title = sc.next();
            folderName = sc.next();
            pages = sc.nextInt();
            d[i] = new Document(id, title, folderName, pages);
        }
        List<Document> res = new ArrayList<Document>();
        res = docsWithOddPages(d);
        for(Document d1 : res)
        {
            System.out.println(d1.id+" "+d1.title+" "+d1.folderName+" "+d1.pages);
        }
    }
}
class Document
{
    int id;
    String title;
    String folderName;
    int pages;
    Document(int id, String title,String folderName, int pages)
    {
        this.id=id;
        this.title=title;
        this.folderName=folderName;
        this.pages=pages;
    }
}
class idSorter implements Comparator<Document> {
    @Override
    public int compare(Document d1, Document d2) {
        return d1.id - d2.id;
    }
}