public class HelloNums {
   public static void drawTriangle(int N) {
      for(int i=0;i<N;i++)
      {
         for(int j=N;j>0;j--)
         {
            System.out.print(" ");
         }
         for(int k=-1;k<N;k++)
         {
            System.out.print("*");
         }
         System.out.println();
       
         
      }
   }
   
   public static void main(String[] args) {
      drawTriangle(10);
      
   }
}