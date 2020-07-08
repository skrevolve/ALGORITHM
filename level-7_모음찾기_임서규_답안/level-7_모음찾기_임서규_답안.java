public static int main(String input) {
  int total = 0;
    for(int i=0; i<input.length(); i++) { 
        switch(input.charAt(i)) {
            case 'a': total++;
              break;
            case 'e': total++;
              break;
            case 'i': total++;
              break;
            case 'o': total++;
              break;
            case 'u': total++;
              break;
        }
    }
    return total;
}
