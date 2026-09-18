//! 380. Insert Delete GetRandom O(1)
class RandomizedSet {
   
    private HashMap<Integer,Integer> map;
    private ArrayList<Integer> arr;
    private Random random;

    public RandomizedSet() {
      
      map = new HashMap<>();
      arr = new ArrayList<>();
      random =new Random();
    }
    public boolean insert(int val) {
        boolean isExist = map.containsKey(val);
        if(!isExist){
            arr.add(val);
            // map(val,arr.size()-1);
            map.put(val, arr.size() - 1);
        }
        return !isExist;

    }
    public boolean remove(int val) {
        boolean isExist = map.containsKey(val);
          if(isExist){
            int index = map.get(val);
            int lastVal =arr.get(arr.size()-1);
            arr.set(index,lastVal);
            map.put(lastVal,index);

            arr.remove(arr.size()-1);
            map.remove(val);
          }
          return isExist;
    }
    public int getRandom() {
    int idx = random.nextInt(arr.size());
    return arr.get(idx);

    }
}

