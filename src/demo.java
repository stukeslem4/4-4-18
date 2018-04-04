
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[]numbers={7,29,18,72,20,12};

int smallest=numbers[0];

int secsmallest=numbers[1];
		
for(int i=0;i<numbers.length;i++){
	
if(numbers[i]<smallest)	{
	
	smallest=numbers[i];
}
}	
	System.out.println(smallest);	
		
		
for (int i=0;i<numbers.length;i++){
	
if(smallest<numbers[i] && numbers[i]<secsmallest){
	
	secsmallest=numbers[i];
}
	
}
	System.out.println(secsmallest);
	}

}
