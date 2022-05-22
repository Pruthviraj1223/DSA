package Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {


            // leetcode question


            // union is not tough // go to geeks for geeks if you want

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for(int i:nums1){

                set1.add(i);

            }



            for(int i:nums2){


                if(set1.contains(i)){
                    set2.add(i);
                }

            }


            int []nums3 = new int[set2.size()];

            int k=0;
            for(Integer i:set2){


                nums3[k++] = i;

            }

            return nums3;

        }
    }
}
