import java.util.Scanner;

public class RepeatedSalaryCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		//System.out.println("enter salary : ");
		int noOfelements= scanner.nextInt();
	    int [] arr= new int [noOfelements];
	    
	    for (int i=0; i<=arr.length;i++);
	      {
	    	  for(int j=i+1;j<arr.length;j++);
	    	  { 
	    		  if (arr[i]==arr[j]&&(i!=j));
	    	  }
	      }
	
	}

}
