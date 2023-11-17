import java.util.*;
class dis
{
     public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the character for the followings:\n L= Laptop; \n D= Desktop;\n At last enter the purchasing amount");
            char ch= sc.next().charAt(0);
            double p= sc.nextDouble();
            switch (ch) {
                case 'L':
                    if (p<20000) {
                        System.out.println("No Discount Applicable:\n"+p);
                    }
                    else if (p>=20000&&p<=50000) {
                        p= p-(10.0/100.0*p);
                        System.out.println("Final Amount Applicable:\n"+p);
                    }
                    else{
                        p= p-(20.0/100.0*p);
                        System.out.println("Final Amount Applicable:\n"+p);
                    }
                    break;
                case 'D':
                    if (p<25000) {
                        p= p-(10.0/100.0*p);
                        System.out.println("Final AmountApplicable:\n"+p);
                    }
                    else if (p>=25000&&p<=50000) {
                        p= p-(20.0/100.0*p);
                        System.out.println("Final Amount Applicable:\n"+p);
                    }
                    else{
                        p= p-(25.0/100.0*p);
                        System.out.println("Final Amount Applicable:\n"+p);
                    }
                    break;
            
                default:
                    break;
            }
        }
        
    }
}