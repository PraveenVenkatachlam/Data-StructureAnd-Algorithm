//! 179. Largest Number
//?TC:O(N log N)
//?SC:O(N)

class Solution {
    public String largestNumber(int[] nums) {

        // 1. Convert int[] to String[]
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // 2. Custom sorting
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // 3. Handle case like [0, 0]
        if (arr[0].equals("0")) {
            return "0";
        }

        // 4. Build the answer
        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }
}

// class Solution {
//     public String largestNumber(int[] nums) {
//         String[] strName=new String[nums.length];
//         for(int i=0;i<nums.length;i++){
//             strName[i]=String.valueOf(nums[i]);
//         } 
//           Arrays.sort(strName, new Comparator<String>() {
//             public int compare(String a,String b){
//                 String order1=a+b;
//                 String order2=b+a;
//                 return order2.compareTo(order1);
//             }
//           });
//           if(strName[0].equals("0")) return "0";
//           StringBuilder sb=new StringBuilder();

//           for(String num:strName){
//             sb.append(num);
//           }
//           return sb.toString();
//     }
// }