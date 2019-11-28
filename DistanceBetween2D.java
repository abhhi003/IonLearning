import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        System.out.format("%.3f",findDistance(p1, p2));
    }
    
    public static double findDistance(Point p1, Point p2)
    {
        double a = Math.pow((p2.x-p1.x),2);
        double b = Math.pow((p2.y-p1.y),2);
        double distance = Math.sqrt(a+b);
        return distance;
    }
}

class Point
{
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    int x,y;
}