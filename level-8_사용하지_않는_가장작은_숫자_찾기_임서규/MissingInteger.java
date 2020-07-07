package algorhithm;

import java.util.HashMap;
import java.util.Map;

public class MissingInteger {
	static public void main(String[] args) {
		//solution(new int[]{0,1,2,3,4,5,6}); // = 7
		//solution(new int[]{0,1,2,4}); // = 3
		System.out.print(solution(new int[]{0,1,2,3,4,5,6}));
	}

	static public int solution(int[] A) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int max = 1;

		for (int a : A) {
			if (a > 0) {
				map.put(a,true);
				if (max < a) {
					max = a;
				}
			}
		}

		for (int i=1 ; i <= max ; i++) {
			if (max == i && map.containsKey(i)) {
				return i+1;
			}
			if (!map.containsKey(i)){
				return i;
			}
		}
		return 1;
	}
}
