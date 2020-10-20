import java.util.Scanner;

class DiceRoller {
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int n = 0; //Number of dice
        int s = 0; //sides of each dice
        int r = 0; //each dice roll
        int t = 0; //total of all dice rolls
        String a = "y"; //start Again
        
        //get user input
        while (a.equals ("y")){
            System.out.print("How many Dice do you want to roll?");
            n = sc.nextInt();
            System.out.print("How many sides do the dice have?");
            s = sc.nextInt();
            System.out.print("Your rolled: ");
            
            for (int i = 0; i < n; i++){
                r = rollDie(s);
                t = t + r;
                System.out.print(r + " ");
            }
            
            System.out.println("");
            System.out.println("Total: " + t);
            System.out.println("");
            t = 0;
            
            System.out.print("Again? [y,n] ");
            a = sc.next();
            System.out.println("");
        }
    }
    public static int rollDie(int s){
        return (int) (Math.random() * s) +1;
    }
}