package bot;

import java.util.Scanner;

public class SimpleBot {
    static Scanner scanner = new Scanner(System.in);
    static int max_year = 2021;
    static int min_year = 2000;
    public static String bot_name = "Bobert";
    public static int bot_age = (int) (Math.random()*(max_year-min_year)+min_year);
    public static String user_name;
    public static int remainder3;
    public static int remainder5;
    public static int remainder7;
    public static int user_age;
    public static int zero;
    public static int user_count_max;
    public static int user_test_answer;
    public static boolean test_correct;

    public static void main(String[] args) {
        System.out.println("Hello! My name is "+ bot_name + ".");
        System.out.println("I was created in "+ bot_age + ".");
        System.out.println("Please, remind me your name.");
        user_name = scanner.nextLine();
        System.out.println("What a great name you have, " + user_name + "!");
        System.out.println("Let me guess your age using math magic!");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        remainder3 = scanner.nextInt();
        remainder5 = scanner.nextInt();
        remainder7 = scanner.nextInt();
        user_age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + user_age + ". Haha did you like my math magic? Well lets get to coding!");
        System.out.println("Hey, I just learned how to count! Give me a number and I'll count up to it!");
        user_count_max = scanner.nextInt();
        for (; user_count_max >= zero; zero++){
            System.out.println(zero + "!");
        }
        test_correct = false;
        System.out.println("Did you like it? Well " + user_name + ", let's see how much you know about programming!");
        while (!test_correct) {
            System.out.println("What is the difference between a ints/longs and floats/doubles?");
            System.out.println("1. Floats are floating ints and doubles are twice as long as longs!");
            System.out.println("2. They are the same things but with different names!");
            System.out.println("3. Ints/longs are whole numbers while floats/doubles are numbers with decimals!");
            System.out.println("4. I don't know, do you?");
            user_test_answer = scanner.nextInt();
            if (user_test_answer == 3){
                System.out.println("Congratulations, have a nice day!");
                test_correct = true;
            } else {
                System.out.println("Oops! Wrong answer!");
            }
        }
    }
}
