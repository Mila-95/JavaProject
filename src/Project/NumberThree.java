package Project;

public class NumberThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array or integer type where you will    //Task3
		//store odd and even numbers.
		//Develop a program which will identify/print the
		//even numbers only.
		
		   
			int [][] num= {{1,5,8,3,2},
					      {12,3,7,5,13},
					      {15,18}
					      };
			
			for(int i=0;i<num.length;i++) {
				for(int j=0;j<num[i].length;j++) {
					if(num[i][j]%2==0) {
					System.out.println(num[i][j]);
				}
				
				}
			}
		}
	}

