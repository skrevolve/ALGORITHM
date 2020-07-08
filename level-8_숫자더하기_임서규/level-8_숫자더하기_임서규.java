public static int input(int n) {
	int sum = 0;
	if(n>=1) {
		for(int i=0; i<=n; i++) {
			sum += i;
		}	
	}else if(n<1) {
		//error
	}
	return sum;
}
