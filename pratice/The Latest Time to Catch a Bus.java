 class Solution {
public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        Set<Integer> set = new HashSet<>();
        int ans=0,j=0;
        for(int i=0;i<buses.length;i++){
            int c = 0;
            while(j<passengers.length && c<capacity && passengers[j]<=buses[i]){
                if(!set.contains(passengers[j]-1)){
                    ans=passengers[j]-1;
                }
                set.add(passengers[j]);
                j++; c++;
            }
            if(c<capacity && !set.contains(buses[i])){
                ans = buses[i];
            }
        }
        return ans;
    }
 }

// class Solution {
//     public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        
//         Arrays.sort(buses);
//         Arrays.sort(passengers);
        
//         Set<Integer> set = new HashSet<>();
//         for (int p : passengers) {
//             set.add(p);
//         }
        
//         int i = 0; // pointer for passengers
        
//         for (int bus : buses) {
//             int count = 0;
            
//             // fill current bus
//             while (i < passengers.length && passengers[i] <= bus && count < capacity) {
//                 i++;
//                 count++;
//             }
            
//             // if this is the LAST bus
//             if (bus == buses[buses.length - 1]) {
                
//                 int time;
                
//                 // Case 1: bus not full
//                 if (count < capacity) {
//                     time = bus;
//                 } 
//                 // Case 2: bus full
//                 else {
//                     time = passengers[i - 1] - 1;
//                 }
                
//                 // avoid collision with passengers
//                 while (set.contains(time)) {
//                     time--;
//                 }
                
//                 return time;
//             }
//         }
        
//         return -1; // should never reach here
//     }
// }

// class Solution {
//     public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        
//         Arrays.sort(buses);
//         Arrays.sort(passengers);

//     }
// }