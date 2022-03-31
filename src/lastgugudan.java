//public class lastgugudan{
//	public static int[] calculate(int times) { //calculate 라는 times라는 상수를 가진 배열 선언
//		int[]result= new int[9]; // result 배열의 크기는 9 
//		for(int i = 0 ; i < result.length ; i++) { //계산 결과를 배열에 저장 
//			result[i] = times *(i+1); 
//			}
//		return result; // 반환 
//	}
//		
//	public static void print(int[]result) { 
//		for(int i = 0 ; i < result.length ; i++) { //계산 결과를 배열에 저장 
//			System.out.println(result[i]);
//			}	
//	}		
//	public static void main(String[]args) {
//		
//		for (int i = 1 ; i<10 ; i++) {
//		
//		int[]result= calculate(i);
//		print(result);
//		
//		
//	}
//}
//}
//public class lastgugudan{
//	public static int[] calculate(int times) {
//		int[]result = new int[9];
//		for(int i=0 ; i<result.length ; i++) {
//			result[i]=times*(1+i);
//		}
//		return result;
//	}
//
//public static void print(int[]result) {
//	for(int i = 0 ; i < result.length ; i++) {
//	System.out.println(result[i]);
//	}
//	}
//public static void main(String[]args) {
//	for ( int i = 1 ; i < 10 ; i++) {
//		int[]result = calculate(i);
//		print(result);
//				
//	
//}
//}
//}
public class lastgugudan{
public static int[]calculate(int times){
	int[]result=new int[9];
	for (int i = 0 ; i < result.length ; i++ )
		result[i]=times*(1+i);
		return result;
	
}

public static void print(int[]result) {
	for ( int i = 0 ; i < result.length ; i++) {
	System.out.println(result[i]);
		
	}
}

	public static void main(String[]args) {
		for ( int i = 1 ; i < 10 ; i ++) {
		int[] result = calculate(i);
		print(result);
	}
	}
	}
