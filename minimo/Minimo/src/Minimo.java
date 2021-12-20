
class  Minimo{

    
    public static int minimoRecursivo(int A[], int n)
    {
        if(n == 1)
            return A[0];

        return Math.min(A[n-1], minimoRecursivo(A, n-1));
    }
    
    
    public static void main(String args[])
    {
       int A[] = {1, 4, 45, 6, -50, 10, 2};
       int n = A.length;
    
       System.out.println(minimoRecursivo(A, n));
    }
}