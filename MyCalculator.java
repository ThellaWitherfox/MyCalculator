import java.util.Scanner;
public class MyCalculator{
  public static void main(String []args){



        double num1, num2, num3;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scan.nextDouble();

        System.out.print("Enter third number or 0 to skip: ");
        num3 = scan.nextDouble();

        System.out.print("Choose between(+,-,*,/): ");
        char operator = scan.next().charAt(0);

        double output;


            if (num3 == 0) {
                switch(operator) {
                  case '+':
                  output = num1 + num2;
                  break;

                  case '-':
                  output = num1 - num2;
                  break;

                  case '*':
                  output = num1 * num2;
                  break;

                  case '/':
                  output = num1 / num2;
                  break;

                  default:
                    System.out.printf("You have entered the wrong operator");
                  return;
                  }
                System.out.println(num1+" "+operator+" "+num2+" = "+output);
              }
              else {
                  switch(operator) {
                    case '+':
                    output = num1 + num2 + num3;
                    break;

                    case '-':
                    output = num1 - num2 - num3;
                    break;

        .            case '*':
                    output = num1 * num2 * num3;
                    break;

                    case '/':
                    output = num1 / num2 / num3;
                    break;

                    default:
                      System.out.printf("You have entered the wrong operator");
                    return;
                    }
                  System.out.println(num1+" "+operator+" "+num2+" "+operator+" "+num3+" = "+output);
              }
  }
  double nr1, nr2, sum;{
	  Scanner sc = new Scanner(System.in);

  nr1 = (sc.nextDouble());
  System.out.println("Enter first number");



System.out.println("Enter second number");

nr2 = (sc.nextDouble());

sum = nr1+nr2;

System.out.println("Sum=" +sum);

}
double nr1, nr2, sum;{
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter first number");
  nr1 = (sc.nextDouble));

  System.out.println("Enter second number");
  nr2 = (sc.nextDouble));

  sum = nr1-nr2;

  System.out.println("sum="+sum);
}

double nr1, nr2, total;{

  System.out.println("Enter first number");

  Scanner sc = new Scanner(System.in);

  nr1 = (sc.nextDouble));

  System.out.println("Enter second number");

  nr2 = (sc.nextDouble));

  total = nr1*nr2;

  System.out.println("Total sum="+total);
}

}
}
}

}

}
