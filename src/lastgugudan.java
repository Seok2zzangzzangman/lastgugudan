
public class lastgugudan {
public static int[] abc(int times) {
	int [] result = new int[9];
	for(int i=0; i<result.length; i++) {
		result[i]=times*(i+1);
	}
		return result;
	}
	public static void print(int[]result) {
		for(int i=0; i<result.length ;i++){
		System.out.println(result[i]);
		}
	}
	public static void main(String[]args) {
	for(int i=2;i<10;i++) {
		int[] result=abc(i);
	print (result);		
		
	}
	}
}
	
	
	
	
	
	
	

	//ㅋㅋㅎㅎ
//	int[] result = new int [10];
//	for( int i=2 ; i < result.length ; i ++) 
//	for( int a=1 ; a<10 ; a++)  
//	System.out.println(a*i);	
//	
// 2단부터 9단 간소화시킴for문으로 	
//	for( int d = 2 ; d < 10 ;d++)
//	for( int a = 1 ; a < 10 ;a++)
//	System.out.println(a*d);	
//	
//	}
//}

//연습


//		int[] result =new int[9];
//		for( int i=0 ; i < result.length ; i++) {
//		result[i] = 2*(i+1); 
//			}
//		for( int i = 0 ; i < result.length ; i++)
//		for( int a = 1 ; a < 10 ; a++ )
//		{
//			System.out.println(result[i]);
//		}
//		//3
//			result =new int[9];
//			for( int i=0 ; i < result.length ; i++) {
//				result[i] = 3*(i+1); 
//			}
//			for( int i = 0 ; i < result.length ; i++) {
//				System.out.println(result[i]);
//		}
//			//4단
//			result =new int[9];
//			for( int i=0 ; i < result.length ; i++) {
//				result[i] = 4*(i+1); 
//			}
//			for( int i = 0 ; i < result.length ; i++) {
//				System.out.println(result[i]);
//			}
//
//			}
//	}
// 
	
	
     

