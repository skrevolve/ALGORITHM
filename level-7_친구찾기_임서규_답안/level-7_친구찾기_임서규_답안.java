public static ArrayList<String> getFriend(String[] input) {
    ArrayList<String> list = new ArrayList<String>();
    for(int i=0; i<input.length; i++) {
      if(input[i].length() == 4) {
        list.add(input[i]); //list에 새로 담아서 return
      }
    }
    return list;
}
