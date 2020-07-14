public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("ex) 3:1,2:2,1:4 ...\n");
 
        String[] input = br.readLine().split(",");
        sum(input);
}
		
public static int sum(String[] input) {	
	
	int total = 0;
	
       for(int i=0; i<input.length; i++) {
	int index = input[i].indexOf(":");
	int a = Integer.parseInt(input[i].substring(0,index));
	int b = Integer.parseInt(input[i].substring(index+1));

	if(a>4 && b>4) {
		System.out.print("0~4점만 입력가능합니다\n");
		break;
	}

	if(a==b) {
		total += 1;
	}
	else if(a>b) {
		total += 3;
	}
	else if(a<b) {
		total += 0;
		}				
       }
	
	System.out.print(total);
	return total;
}
