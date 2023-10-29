import java.util.Scanner;
public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("수를 입력하시오");
	int number = scanner.nextInt();
	if(number%3 == 0)
		System.out.println("3의 배수입니다.");

	}

}
