//System.out.print(getNumber(new double[]{5,1,2}));
public static int getNumber(double[] input) {
    int max = 0;
    int min = 0;
    int middle = 0;
    int maxIndex = 0;
    int minIndex = 0;
    int middleIndex = 0;

	for(int i = 0; i<input.length; i++) {
		if(input[i] > max) {
			max = (int) input[i];
			maxIndex = i;
		}else if(input[i] < min) {
			min = (int) input[i];
			minIndex = i;
		}else if(input[i] > min && input[i] < max) {
			middle = (int) input[i];
			middleIndex = i;
		}
	}
	    return middleIndex;	
 }
