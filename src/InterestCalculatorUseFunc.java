import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class InterestCalculatorUseFunc {
        public static void main(String[] args){
        //1.input
        /*
        월급을 입력하세요 : 3000000
        기간을 입력하세요 : 48
        이율을 입력하세요 : 35.5%
         */

    Scanner in = new Scanner(System.in);
        System.out.print("월급을 입력하세요 : ");
    int salary = in.nextInt();
        System.out.print("기간을 입력하세요 : ");
    int term = in.nextInt();
        System.out.print("이율을 입력하세요 : ");
    double interestRate = in.nextFloat();

    //2.processing
        /*
        이자계산공식 : 이자 = 원금 * 이율(연이율) * (월/12)
        기간이 36개월 이상이면 이율이 30% 감면
         */

        double interest = calcInterest(salary, term, interestRate);
        double total = interest + salary;

    //3.output
        /*
        48개월 후 당신은 *****원을 받을 수 있습니다.
         */

        //System.out.println(term + "개월 후 당신은 " + result + "원을 받을 수 있습니다.");
        System.out.printf("%d개월 후 당신은 %.1f원을 받을 수 있습니다.",term,total);
    }
    public static double calcInterest(
            int principal, int month, double rate) {
        double interest = principal * (rate / 100) * (month / 12);

        return interest;
    }
}