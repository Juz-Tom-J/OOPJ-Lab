import java.util.Scanner;

class Area{
void calcArea(float b,float h)
{double area = 0.5*b*h;
System.out.println("The area of triangle is: "+area+"m^2\n");
}

void calcArea(int l,int w)
{int area = l*w;
System.out.println("The area of rectangle is: "+area+"m^2\n");
}

void calcArea(float r)
{double area = 3.14*r*r;
System.out.println("The area of circle is: "+area+"m^2\n");
}

}
public class prog_pack_1_method_overloading {

public static void main(String[] args) {

int rlen,rwid;
float tbase,tht,crad;

Area a = new Area();
Scanner sc = new Scanner(System.in);

System.out.println("Enter the base of triangle: ");
tbase = sc.nextFloat();
System.out.println("Enter the height of triangle: ");
tht = sc.nextFloat();
System.out.println("Enter the length of rectagle: ");
rlen = sc.nextInt();
System.out.println("Enter the width of rectangle: ");
rwid = sc.nextInt();
System.out.println("Enter the radius of circle: ");
crad = sc.nextFloat();

a.calcArea(tbase,tht);
a.calcArea(rlen,rwid);
a.calcArea(crad);


}

}

