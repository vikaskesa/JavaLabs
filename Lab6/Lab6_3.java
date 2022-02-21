public class Lab6_3 {
 
  public static HashMap getSquares(int[] array) {
    HashMap<Integer, Integer>   map   = new HashMap<Integer, Integer>();
 
    for (int n: array) {
      map.put( n, n*n);
    }
    return map;
  }
 
  public static void main(String[] args) {

    int array[] = new int[]{1,2,3,4,5,6,7,8,9};

    HashMap<Integer, Integer>   map   =getSquares(array);

    Set<Integer> set = map.keySet();
    Iterator<Integer> it = set.iterator();

    while(it.hasNext()){
    Integer key = it.next();
    System.out.println(key + " : " + map.get(key)); 
    }                                  //Values
  }