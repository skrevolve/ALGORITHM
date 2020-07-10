public static int smallestInt(int[] A) {
    HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    int max = 0;
    int isFalse = -1;

    for(int a : A) {
        if(a >= 0 ) { //여기서 조건을 실수해서 hashmap에서 index갯수가 하나모잘랏음 (
            map.put(a,true);
            if(max < a) {
                max = a;
            }
        }else if(a < 0) {
            return isFalse; //음수로 입력받을경우 -1 반환
        }
    }

    for(int i=1; i <= max; i++) {
        if(max == i && map.containsKey(i)) {
            return max+1;
        }
        if(!map.containsKey(0)) { //0이 없으면 0반환
            return 0;
        }
        if(!map.containsKey(i)){ //없는값 반환
            return i;
        }
    }

    return max;
}
