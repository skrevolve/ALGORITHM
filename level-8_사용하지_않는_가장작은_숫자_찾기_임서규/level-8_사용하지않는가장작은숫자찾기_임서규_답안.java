package algorhithm;
import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");

		int max = 0;

		for(int i=0; i<input.length; i++) {
			Arrays.sort(input);
			System.out.print(input[i]);
			if(max <= Integer.parseInt(input[i])) {
				max = Integer.parseInt(input[i]);   		
			}else if(max >= Integer.parseInt(input[i])) {
				max = Integer.parseInt(input[i]);
		    }
		}
		System.out.print("=> "+(max-1)+"\n");
		System.out.print("=> "+(max+1)+"\n");
		sc.close();
	}		
}

//출력시..
//4,2,1,0
//0124=> 3
//=> 5
