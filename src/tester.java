import java.util.Scanner;


public class tester {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Calc testOne = new Calc();
        /*user input equation */
        Scanner input = new Scanner(System.in);
            /*user input equation */
            System.out.println("enter the equation (i.e. 25-10/2*1.5)  ");
            String eq = input.nextLine();
            
            /*removes spaces and splits before and after symbols */
            eq = eq.replaceAll(" ","");
            String[] tokens = eq.split("(?<=[+\\-*/])|(?=[+\\-*/])");
            
            testOne.evaluate(tokens);
            System.out.println("result: " + testOne.getResult());
            
        input.close();
    }
        


        
}

