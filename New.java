
import java.util.*;

   public static float task2;
    public static float task3;
    public static float task4;
    public static float task5;
    public static float task6;
    public static float task7;
    public static float task_a;
    public static float task_b;
    public static float task_c;
    public static float task_d;
    public static float task_e;
    public static float task_f;
    public static float task_g;
    static float computerscore;
    static float YourScore;

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Random r = new Random();

            System.out.print(" Enter How much chanes : ");
            int J = sc.nextInt();

            // int task1;
            // int task2;
            // int task3;
            // int task4;
            // int task5;
            // int task6;
            // int task7;
            // int task_a;
            // int task_b;
            // int task_c;
            // int task_d;
            // int task_e;
            // int task_f;
            // int task_g;

            for (int i = 1; i <= J; i++) {

                System.out.println("[ Rules ] \n Press 1 --> stone \n Press 2 --> paper \n Press 3 --> scissor  ");

                int A = sc.nextInt();
                int B = 1 + r.nextInt(4 - 1);

                if (B == 1 && A <= 3) {
                    System.out.println("Computer chooses Stone");
                } else if (B == 2 && A <= 3) {
                    System.out.println("Computer chooses Paper");
                } else if (B == 3 && A <= 3) {
                    System.out.println("Computer chooses scissor");
                }

                if (A == B) {
                    System.out.println("Tie");
                    System.out.println("computerscore = 0 ");
                    System.out.println(" YourScore = 0 ");
                    task1 = 0;
                    task_a = 0;

                } else if (A == 1 && B == 2) {
                    System.out.println("Computer win ");
                    System.out.println("computerscore --:> 1");
                    System.out.println("YourScore --:> 0 ");
                    task2 = 1;
                    task_b = 0;

                } else if (A == 1 && B == 3) {
                    System.out.println("You win");
                    System.out.println("computerscore = 0");
                    System.out.println("YourScore = 1");
                    task3 = 0;
                    task_c = 1;

                } else if (A == 2 && B == 1) {
                    System.out.println("You win");
                    System.out.println("computerscore = 0 ");
                    System.out.println("YourScore = 1");
                    task4 = 0;
                    task_d = 1;

                } else if (A == 2 && B == 3) {
                    System.out.println("Computer win");
                    System.out.println("computerscore = 0");
                    System.out.println("YourScore = 1");
                    task5 = 0;
                    task_e = 1;

                } else if (A == 3 && B == 1) {
                    System.out.println("Computer win ");
                    System.out.println("computerscore = 1");
                    System.out.println("YourScore = 0");
                    task6 = 1;
                   task_f = 0;

                } else if (A == 3 && B == 2) {
                    System.out.println("You win ");
                    System.out.println("computerscore = 0");
                    System.out.println("YourScore = 1 ");
                    task7 = 0;
                    task_g = 1;
                } else if (A > 3) {
                    System.out.println("Game lost !!!! :--> Enter 1 or 2 0r 3 ");

                }
                computerscore = (task1) + (task3) + (task2) + (task4) + (task5) + (task6) + (task7);
                YourScore = (task_a) + (task_b) + (task_c) + (task_d) + (task_e) + (task_f) + (task_g);

                System.out.println(" \n ");

            }
            System.out.println("Total computer score :> " + computerscore);
            System.out.println("Total Score of you :> " + YourScore);

        }

    }
}
