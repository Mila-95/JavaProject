package Project;

public class NumberFour {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
int [][] numbers = {
				{1,2,3,4,5,6,7},
				{10,11,12,13,14},
				{14,15,16,17,18}
		};
		int sumodd=0;
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				if (numbers[i][j]%2!=0) {
					sumodd=sumodd+numbers[i][j];
			}
					
			}
		}
		System.out.println("the sum of Even Numbers are " + sumodd);
		
		
	}			
}

	
	
		
	


