public class Febonacci {
    public static void main(String[] args) {
        
        System.out.print("0"+" ");
        System.out.print("1"+" ");

        int current=1;
        int previous=0;
        int ne=0;
        

        while (ne<10000) {
         ne=current+previous;
         previous=current;
         current=ne;

         System.out.print(ne+" ");

        }
    
    }
}
