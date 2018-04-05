
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int one [] = {24, 56, 78, 25,63};

int counter = 0;

for (int i = 0; i < one.length; i++){

	if (one[i] % 2 == 1){
        counter = counter+1;
	}
	}
System.out.println("The total number of ODD numbers in this array is" + counter);
	
	int counter2 = 0;
	for(int i = 0; i < one.length; i ++){
	if (one[i] % 2 == 0){
		counter2 = counter2 + 1;
	
	}
	
}System.out.print("the total number of even number in the array is" + counter2);
	}
}
