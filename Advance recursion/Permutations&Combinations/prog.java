import java.util.ArrayList;

class prog {
  public static int arrangeBalls(int green, int red, int yellow, ArrayList<Character> arrangements, int size, int count){
    if (size==0) {
      return 0;
    }
      if (green!=0 && arrangements.get(arrangements.size()-1)!='G') {
        arrangements.add('G');
        green--;
        count = arrangeBalls(green, red, yellow, arrangements, size, count);
        green++;
        arrangements.removeLast();
      }
      if (red!=0 && arrangements.get(arrangements.size()-1)!='R') {
        arrangements.add('R');
        red--;
        count = arrangeBalls(green, red, yellow, arrangements, size, count);
        red++;
        arrangements.removeLast();
      }
      if (yellow!=0 && arrangements.get(arrangements.size()-1)!='Y') {
        arrangements.add('Y');
        yellow--;
        count = arrangeBalls(green, red, yellow, arrangements, size, count);
        yellow++;
        arrangements.removeLast();
      }
    if (arrangements.size()==size+1) {
      System.out.println(arrangements);
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int green = 3;
    int red = 1;
    int yellow = 1;
    // HashMap<Character, Integer> hm = new HashMap<>();
    // hm.put('G', green);
    // hm.put('R', red);
    // hm.put('Y', yellow);
    int size = green+red+yellow;
    ArrayList<Character> arrangements = new ArrayList<>();
    arrangements.add('1');
    System.out.println(arrangeBalls(green, red, yellow, arrangements,size,0));
  }
}