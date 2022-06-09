import java.util.Scanner;
public class Matrix_P1 {
    Scanner sc=new Scanner(System.in);
    int M[][];
    int m;//rows
    int n;//columns
    Matrix_P1()
    {
        m=0;
        n=0;//constuctor
        M=new int[m][n];
    }
    Matrix_P1(int r, int c)
    {
        int m=r;
        int n=c;
        M=new int[m][n];
    }
    void accept()
    {
        System.out.println("rows");
        m=sc.nextInt();//making the constructor
        System.out.println("columns");
        n=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int k=sc.nextInt();
                M[i][j]=k;
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {//displaying initial constructor
            for(int j=0;j<n;j++)
            {
                System.out.println(M[i][j]);
            }
        }
    }
    int maxnum()
    {
        int c=0;//finding the maximum in the constructor
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(M[i][j]>c)
                    c=M[i][j];
            }
        }
        return c;
    }
    int minnum()
    {
        int c=M[0][0];//finding the minimum in the constructor
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(M[i][j]<c)
                    c=M[i][j];
            }
        }
        return c;
    }
    void search(int x)
    {
        boolean g=false;
        for(int i=0;i<m;i++)//searching for a given x
        {
            for(int j=0;j<n;j++)
            {
                if(M[i][j]==x)
                {
                    g=true;
                    System.out.println("row: "+i);
                    System.out.println("column: "+j);
                }
            }
        }
        if(g==false)
            System.out.println("not there");
    }
    int leftdiag()
    {int sum=0;//finding the sum of elements in the left diagonal
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    sum=sum+M[i][j];
            }
        }
        return sum;
    }
    int rightdiag()
    {//finding the sum in the right diagonal
        int sum=0;
        for(int i=m;i>0;i--)
        {
            for(int j=1;j<m;j++)
            {
                sum=sum+M[i][j];
            }
        }
        return sum;
    }
    void trans(Matrix_P1 N2)
    {//finding the transverse of the array object and the refrencing it to the actual array
        int y[][]=new int[n][m];
        y=N2.M;
        int x[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                x[i][j]=y[j][i];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
    void add(Matrix_P1 N1, Matrix_P1 N2)
    {//adding 2 arrays, with the corresponding elements
        int y[][]=new int[m][n];
        y=N1.M;
        int x[][]=new int[m][n];
        x=N2.M;
        int k[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                k[i][j]=y[i][j]+x[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(k[i][j]);
            }
        }
    }
    Matrix_P1 multiply(Matrix_P1 N2)
    {//mulitplying assuming the basic condition is satisfied
        int firstarray[][]=new int[m][n];
        firstarray=N2.M;

        /* Create another 2d array to store the result using the original arrays' lengths on row and column respectively. */
        int [][] result = new int[firstarray.length][M[0].length];

        /* Loop through each and get product, then sum up and store the value */
        for (int i = 0; i < firstarray.length; i++) { 
            for (int j = 0; j < M[0].length; j++) { 
                for (int k = 0; k < firstarray[0].length; k++) { 
                    result[i][j] += firstarray[i][k] *M[k][j];
                }
            }
        }
        Matrix_P1 c=new Matrix_P1();
        c.M=result;
        return c;
    }
}