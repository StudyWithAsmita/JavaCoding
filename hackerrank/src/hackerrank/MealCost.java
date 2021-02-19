package hackerrank;

public class MealCost {

	 // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

    	double tipTotal = (tip_percent * meal_cost)/100;
    	double taxTotal = (tax_percent * meal_cost)/100;
    	double sumMeal = meal_cost + tipTotal + taxTotal;
    	int mealSum = (int) Math.round(sumMeal);
    	
    	System.out.println(mealSum);
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // double meal_cost = scanner.nextDouble();
    	double meal_cost = 12.00;
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = 20;
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = 8;
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

       //scanner.close();
    }
	}


