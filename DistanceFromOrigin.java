import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        double x4=0,y4=0;
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4,y4);
        p4 = pointWithHighestDistance(p1, p2, p3);
        System.out.println(p4.x);
        System.out.println(p4.y);
    }
    public static Point pointWithHighestDistance(Point p1,Point p2,Point p3)
    {
        double d1 = Math.sqrt(Math.pow((p1.x),2)+Math.pow((p1.y),2));
        double d2 = Math.sqrt(Math.pow((p2.x),2)+Math.pow((p2.y),2));
        double d3 = Math.sqrt(Math.pow((p3.x),2)+Math.pow((p3.y),2));
        if(d1>d2 && d1>d3)
        {
            return p1;
        }
        else if(d2>d1 && d2>d3)
        {
            return p2;
        }
        else
        {
            return p3;
        }
    }
}

class Point
{
    Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    double x,y;
}