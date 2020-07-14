public static int input(int n) {
	int sum = 0;
	int isError = -1;
	
	if(n>=1) {
		for(int i=0; i<=n; i++) {
			sum += i;
		}	
	}else if(n<1) {
		return isError;
	}
	
	return sum;
}
