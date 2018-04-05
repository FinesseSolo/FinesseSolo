import java.util.Scanner;
public class Ave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);

int[]a = new int[5];

System.out.println("please enter the array elements");

for(int i = 0; i <a.length; i++)
	
{	a[i] = scanner.nextInt();
}

System.out.println("Print the average of the array elements");

int sum = 0;

for (int j = 0; j< a.length; j++)
{
     	sum = (sum + a[j]);

}
	int average = (sum/(a.length));
	
	System.out.println("The average is" + average);

	}

}
