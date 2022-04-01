
public class gugudan {
public static int[] calculate (int times){          //  calculate times	라는 변수를 가진 정수함수 선
	int[] result = new int[9] ; // 해당함수는 9개의 배열을 가지고 있다선언 
	for(int i = 0 ; i < result.length ; i++ )  // i= 0,1,2,3,4,5,6,7,8 
	result[i] =times *(i+1);	// 한 데이터의 9개 정보를 가지고 있음 x * (0+1) ~ 8까지 반복 
	
return result;

	
}

public static void print(int[]result) {
	for( int i = 0 ; i < result.length ; i++) {
		System.out.println(result[i]);
	}	
}
	
}