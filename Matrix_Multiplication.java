import java.util.Scanner;

public class prog_pack_1_matrix_multiplication {

public static void main(String[] args) {

int r1,r2,c1,c2,i,j,k;
int A[][] = new int [5][5];
int B[][] = new int [5][5];
int C[][] = new int [5][5];
Scanner sc = new Scanner(System.in);

System.out.println("Enter the value of row 1: ");
r1=sc.nextInt();
System.out.println("Enter the value of column 1: ");
c1=sc.nextInt();
System.out.println("Enter the value of row 2: ");
r2=sc.nextInt();
System.out.println("Enter the value of column 2: ");
c2=sc.nextInt();

System.out.println("Enter the elements of first matrix: ");
for(i=0;i<r1;i++)
{for(j=0;j<c1;j++)
{A[i][j]=sc.nextInt();
   }
}

System.out.println("Enter the elements of second matrix: ");
for(i=0;i<r2;i++)
{for(j=0;j<c2;j++)
{B[i][j]=sc.nextInt();
   }
}

System.out.println("The matrix multiplication is:  ");
for(i=0;i<r1;i++)
{for(j=0;j<c2;j++)
    {for(k=0;k<r2;k++)
    {C[i][j]+=A[i][k]*B[k][j];
       }
}

System.out.println("The new matrix is: ");
for(i=0;i<r1;i++)
   {for(j=0;j<c2;j++)
          {System.out.print(C[i][j]+"  ");}
             System.out.print("\n");
             
         
   }
}  

}
}

