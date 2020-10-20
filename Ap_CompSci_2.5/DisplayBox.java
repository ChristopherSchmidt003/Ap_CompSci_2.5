import java.util.Scanner;

class DisplayBox {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = 0, h = 0;
        System.out.print("Enter width: ");
        w = sc.nextInt();
        System.out.print("Enter height");
        h = sc.nextInt();
        displayBox(w, h);
    }
    
    public static void displayBox (int width, int height) {
        String c = "$";
        
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
              System.out.print(c);  
            }
            System.out.println("");
        }
    } 
}