import java.util.*;

class Smallest
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String st = sc.nextLine();
        System.out.printf("Smallest ASCII-value is: '%c'", st.chars().min().getAsInt());
    }
}