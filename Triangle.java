import java.util.Scanner;
public class Triangle {

    
    public static void main(String[] args) {
        int x1,y1,x2,y2,x3,y3;
        double z,q,s;
        Scanner in=new Scanner(System.in);
        System.out.print("please enter p1 coordinates x1 then y1 :");
        x1=in.nextInt();
        y1=in.nextInt();
        System.out.print("please enter p2 coordinates x2 then y2 :");
        x2=in.nextInt();
        y2=in.nextInt();
        System.out.print("pleasw enter p3 coordinates x3 then y3 :");
        x3=in.nextInt();
        y3=in.nextInt();
        
        z= Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2),2));
        q=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2), 2));
        s=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3), 2));
        
        double a =Math.pow(z,2);
        double b =Math.pow(q,2);
        double c =Math.pow(s, 2);
        
        if((a>(b+c))||(b>(a+c))||(c>(a+b))){
            System.out.print("the triangle has an obtuse angle and two actuse angle");}
        else if ((a==(b+c))||(b==(a+c))||(c==(a+b))){
            System.out.print("the triangle has a right angle and two actuse angle");}
        else{System.out.print("the triangle has three actuse angle");}
        
        }
        
        
        
    }
    
}
