import java.util.Scanner;

/**
 * @author Arash
 *
 *Write a grading program for an instructor whose course has the following policies:
 *
 *Two quizzes, each graded on the basis of 10 points, are given.
 *One midterm exam and 
 *one final exam, each graded on the basis of 100 points, are given.
 *
 *The final exam counts for 50 percent of the grade, 
 *the midterm counts for 25 percent, and
 *the two quizzes together count for a total of 25 percent. 
 *(Do not forget to normalize the quiz scores. 
 *They should be converted to percentages before they are averaged in.)
 *
 *Any grade of 90 percent or more is an A, any grade between 80 and 89 percent is a B, any
 *grade between 70 and 79 percent is a C, any grade between 60 and 69 percent is a D, and any
 *grade below 60 percent is an F.
 *
 *The program should read in the student’s scores and display the student’s record, which
 *consists of two quiz scores, two exam scores, the student’s total score for the 
 *entire course, and the final letter grade. The total score is a number in 
 *the range 0 to 100, which represents the
 *weighted average of the student’s work.
 *
 *Define and use a class for the student record. 
 *The class should have instance variables for the 
 *quizzes, midterm, final, total score for the course, and final letter grade. 
 *
 *The class should have input and output methods. 
 *The input method should not ask for the final numeric grade, nor should it ask for 
 *the final letter grade. The class should have methods to compute the overall 
 *numeric grade and the final letter grade. 
 *
 *These last two methods will be void methods that set 
 *the appropriate instance variables. 
 */

public class WeightedGradeCalculator 
{
	//instance variables
	private double quiz1, quiz2, midtermExam, finalExam;
	
	//default constructor
	public WeightedGradeCalculator() {
		quiz1 = 0;
		quiz2 = 0;
		midtermExam = 0;
		finalExam = 0;		
	}
	//overload constructor
	public WeightedGradeCalculator(double q1, double q2, double midterm, double finexam) {
		quiz1 = q1;
		quiz2 = q2;
		midtermExam = midterm;
		finalExam = finexam;
	}
	
	//request input
	public void input()	{	
		Scanner keyboard = new Scanner(System.in);
		//validate input for Quiz 1
		while (true)	{	
			System.out.print("Enter score for Quiz 1: ");
			quiz1 = keyboard.nextDouble();	
			if (quiz1 > 10 || quiz1 < 0) {
				System.out.println("The score you entered is Invalid. Please Enter a valid score. (0-10)");	
			} 
			else break;					
		}			
		//validate input for Quiz 2
		while (true)	{
			System.out.print("Enter score for Quiz 2: ");
			quiz2 = keyboard.nextDouble();			
			if (quiz2 > 10 || quiz2 < 0) {
				System.out.println("The score you entered is Invalid. Please Enter a valid score. (0-10)");
			} 
			else break;
		}		
		//validate input for Midterm Exam	
		while (true)	{
			System.out.print("Enter score for Midterm Exam: ");
			midtermExam = keyboard.nextDouble();
			if (midtermExam> 100 || midtermExam < 0) {
				System.out.println("The score you entered is Invalid. Please Enter a valid score. (0-100)");
			}		
			else break;
		}		
		//validate input for Final Exam
		while (true)	{
			System.out.print("Enter score for Final Exam:");
			finalExam = keyboard.nextDouble();
			if (finalExam> 100 || finalExam < 0) {
				System.out.println("The score you entered is Invalid. Please Enter a valid score. (0-100)");
			}	
			else break;
		}
		//close scanner object
		keyboard.close();
	} 
	
	//overrides toString
	public String toString()	{
		return "Your total weighted class score is " + getWeightedGrade() +
					".\nYour final letter grade is "  + grade(getWeightedGrade()) + ".";
	}
	
	/**
	 * calculates letter grade based on grade score
	 * @param score
	 * @return char
	 */
	public char grade(double score) {
		if (score >= 90)
			return 'A';
		else if (score >= 80)
			return 'B';
		else if (score >= 70)
			return 'C';
		else if (score >= 60)
			return 'D';
		else
			return 'F';	
	}
	/**
	 * @return calculates grade score
	 */
	public double getWeightedGrade() {
		return ((getQuiz1()+getQuiz2()) / 20 * 100 * 0.25 ) + (getMidtermExam() * 0.25) + (getFinalExam() * 0.50);
	}	
	/**
	 * @return quiz1
	 */
	public double getQuiz1() {
		return quiz1;
	}	
	/**
	 * @return quiz2
	 */
	public double getQuiz2() {
		return quiz2;
	}
	/**
	 * @return midtermExam
	 */
	public double getMidtermExam()	{
		return midtermExam;
	}
	/**
	 * @return finalExam
	 */
	public double getFinalExam()	{
		return finalExam;
	}
	/**
	 * 
	 * @param quiz1
	 */
	public void setQuiz1(double quiz1) {
		if(quiz1 >= 100 && quiz1 <= 0)
			this.quiz1 = quiz1;
	}
	/**
	 * 
	 * @param quiz2
	 */
	public void setQuiz2(double quiz2) {
		if(quiz2 >= 0 && quiz2 <= 100)
			this.quiz2 = quiz2;
	}
	/**
	 * 
	 * @param midTerm
	 */
	public void setMidterm(double midTerm) {
		if(midTerm >= 0 && midTerm <= 100)
		midtermExam = midTerm;
	}
	/**
	 * 
	 * @param finalExam
	 */
	public void setFinalExam(double finalExam) {
		if(finalExam >= 0 && finalExam <= 100)
			this.finalExam = finalExam;
	}
}
