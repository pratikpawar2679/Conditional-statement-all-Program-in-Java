// import javax.sql.rowset.spi.SyncResolver;

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Please enter your age=");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         if (a >= 18) {
//             System.out.println("you are apply for vote ");
//         } else {
//             System.out.println("not");
//         }
//     }
// }

//Print the largest number in given 
//a=1    b=5;

/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {

//         int a = 1, b = 5;
//         if (a >= b) {
//             System.out.println("A  is greater ");
//         } else {
//             System.out.println("B is greater");
//         }
//     }
//}

//Print the even or odd number 
/**
 * Main
 */
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         System.out.print("Please enter the number=");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         if (num % 2 == 0) {

//             System.out.println("Even number");
//         } else {
//             System.out.println("Odd number ");
//         }
//     }
// }

//Else if condition 
// import java.util.*;

// /**
//  * Main
//  */
// public class Main {

//     public static void main(String[] args) {
//         System.out.print(" Enter the value of a=");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = 5;
//         if (a > b) {
//             System.out.println("a is greater b");
//         } else if (a < b) {
//             System.out.println("a ia less b ");
//         } else {
//             System.out.println(" a is equal to b");
//         }

//     }

// }

// income tax calculator 
import java.util.*;

/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.print("Enter the  amount=");
//         Scanner sc = new Scanner(System.in);
//         int am = sc.nextInt();
//         int tax;
//         if (am < 500000) {

//             tax = 0;

//         }

//         else if (am >= 500000 && am < 100000) {
//             tax = (int) (am * 0.2);

//         }

//         else {
//             tax = (int) (am * 0.3);

//         }
//         System.out.println("Your Tax is:" + tax);

//     }
// }

//Print the largest number in given
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int a = 10, b = 3, c = 6;
//         if (a >= b) {
//             System.out.println("Largest Value is a");
//         } else if (b >= c) {
//             System.out.println("Largest value is b");
//         } else {
//             System.out.println("Largest value is c");
//         }
//     }
// }

// Ternary Operator 
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int large = (5 > 3) ? 5 : 3;
//         System.out.println(large);

//     }
// }

/**
 * Main
 */
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         // System.out.print("Enter the number=");
//         // Scanner sc = new Scanner(System.in);
//         // int type = sc.nextInt();
//         // type = (type % 2 == 0) ? 1 : 0;
//         // System.out.println(type);

//         int num = 4;

//         String type = (num % 2 == 0) ? "Even" : "Odd";
//         System.out.println(type);
//     }
// }

// Check student will pass or fail;

// import java.util.*;

// /**
//  * Main
//  */
// public class Main {

//     public static void main(String[] args) {

//         System.out.print("Enter your Marks=");
//         Scanner sc = new Scanner(System.in);
//         int mark = sc.nextInt();
//         String result = (mark >= 35) ? "pass" : "Fail";
//         System.out.println(result);
//     }
// }

/**
 * Main
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(" enter the value a =");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(" enter the value b =");
        int b = sc.nextInt();
        System.out.println("enter the operator :");

        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("the value is note match");
                break;
        }
    }

}