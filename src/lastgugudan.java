import java.util.Scanner;

public class lastgugudan {
public static void main(String[]args){
System.out.println("출력할 구구단 단은? ; ");
	//8,9
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt(); 
	System.out.println("사용자가 입력한 값은 : "  +number);
	
			if (number<2) { 
			System.out.println("2이상 9이하의 숫자를 입력하시오"); 
			} else if (number>9) { 
			System.out.println("2이상 9이하의 숫자를 입력하시오"); 
			} else {
				for (int i = 1 ; i < 10 ; i++) {
					System.out.println(number*i); 
				} 
				}
			}
	}
 
	
	
     

