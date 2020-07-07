package algorhithm;

import java.util.HashMap;
import java.util.Map;

public class MissingInteger {
	static public void main(String[] args) {
		//smallestInt(new int[]{0,1,2,3,4,5,6}); // = 7
		//smallestInt(new int[]{0,1,2,4}); // = 3
		System.out.print(smallestInt(new int[]{1,0,2,4,3,5,6}));
	}

	static public int smallestInt(int[] A) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int max = 0;

		for (int a : A) { //입력된 A배열 순회
			if (a > 0) {
				map.put(a,true); // A[idx] 값을 map에 담는다
				if (max < a) {
					max = a; //그중 제일 큰값을 max값으로 담는다
				}
			}
		}

		for (int i=1; i <= max; i++) { //두번째로  max사이즈만큼 순회한다
			if (max == i && map.containsKey(i)) { //순회의 idx값이 max와 같다면 +1하여 값을 반환한다
				return i+1;
			}
			if (!map.containsKey(i)){ //순회중에 빠진 숫자가 나온다면 해당 숫자를 리턴
				return i;
			}
		}
		return 1;
	}
}
