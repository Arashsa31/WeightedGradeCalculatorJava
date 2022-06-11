/**
 * @author Arash
 *
 */
public class WeightedGradeCalculatorDemo {

	public static void main(String[] args) {
		WeightedGradeCalculator student1 = new WeightedGradeCalculator(); 
		WeightedGradeCalculator student2 = new WeightedGradeCalculator(0, 0, 0, 0);
		WeightedGradeCalculator student3 = new WeightedGradeCalculator(10, 10, 100, 100); 
		
		System.out.println(student1.toString());
		System.out.println();
		
		student1.input();
		System.out.println(student1.toString());
		System.out.println();
		
		System.out.println("\"If a student received a grade of 0 for all exam and quiz:\"");
		System.out.println(student2.toString());
		System.out.println();
		
		System.out.println("\"If a student received a grade of 10 for both quiz and 100 for both exam:\"");
		System.out.println(student3.toString());
		System.out.println();		
	}

}
