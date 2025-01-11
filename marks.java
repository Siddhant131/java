import java.util.Scanner;
class marks
{
    public static void main(String args[])
     {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks for English(out of 80)");
    double eng = sc.nextDouble();
    System.out.println("Enter marks for Maths(out of 80)");
    double math = sc.nextDouble();
    System.out.println("Enter marks for Computers(out of 80)");
    double com = sc.nextDouble();
    System.out.println("Enter marks for SST(out of 80)");
    double sst = sc.nextDouble();
    System.out.println("Enter marks for Science(out of 80)");
    double sci = sc.nextDouble();
    double sum = eng+math+sst+com+sci;
    double avg = sum/5;
    double per = (sum/480)*100;
    System.out.println("Total marks = " + sum);
    System.out.println("Average marks = " + avg);
    System.out.println("Percentage = " + per);
    sc.close();
}
}
    