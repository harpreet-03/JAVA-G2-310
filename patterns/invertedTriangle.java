public class invertedTriangle {
    public static void main(String[] args) {
        int n = 5;
        // for(int i = n; i>=0; i--){
        //     for(int j = i; j>0; j--){
        //          System.out.print("* ");
        //     }
        // System.out.println();
        // }

        //2nd
            //another method : 
        for(int i = 1; i<=n; i++) {
            for(int j = 0; j<n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
 
    }
}