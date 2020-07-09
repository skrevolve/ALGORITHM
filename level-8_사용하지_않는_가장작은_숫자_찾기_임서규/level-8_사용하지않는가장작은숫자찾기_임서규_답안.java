static public int smallestInt(int[] A) {
    Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    int max = 0;
    int isFalse = -1; // 음수가 입력될경우 -1을 반환
    
    for(int a : A) {
        if(a > 0) {
            map.put(a,true);
            if(max < a) {
                max = a;
            }
        }else if(a < 0){
            return isFalse;
        }
    }

    for(int i=1; i <= max; i++) {
        if(max == i && map.containsKey(i)) {
            return max+1;
        }
        if(!map.containsKey(i)){
            return i;
        }
    }
    return max;
}
