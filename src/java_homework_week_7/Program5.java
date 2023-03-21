package java_homework_week_7;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

import java.util.Scanner;

public class Program5 {
    static int empID, basic;
    static String name;
    static float hra, ta, da, pf, gross;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Employee ID:");
        empID = scan.nextInt();
        System.out.println("Please enter Employee Name:");
        name = scan.next();
        System.out.println("Please enter Basic Salary:");
        basic = scan.nextInt();
        scan.close();
        calculation();
    }

    // Static method calculating different values
    public static void calculation() {
        hra = (basic * 10) / 100;
        da = (basic * 8) / 100;
        ta = (basic * 9) / 100;
        pf = (basic * 20) / 100;
        gross = ((basic + hra + ta + da) - pf);
        System.out.println("-----------------------------------------");
        System.out.println("|              SALARY SLIP               ");
        System.out.println("-----------------------------------------");
        System.out.println("| Employee ID     :" + empID);
        System.out.println("| Employee Name   :" + name);
        System.out.println("-----------------------------------------");
        System.out.println("| Basic Salary    :" + basic);
        System.out.println("| HRA 10%         :" + hra);
        System.out.println("| TA 8%           :" + ta);
        System.out.println("| DA 9%           :" + da);
        System.out.println("| PF -20&         :" + pf);
        System.out.println("-----------------------------------------");
        System.out.println("| Gross Salary    :" + gross);
        System.out.println("========================================");
    }
}
