import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class JavaCollection {
    public static void main(String args[]){
            Collection <Integer> nums = new ArrayList<Integer>();
            nums.add(6);
            nums.add(5);
            nums.add(7);
            nums.add(9);

            System.out.println(nums);

            //looping the elements with enhanced forloop without adding the type <Integer> to the collection 
            for(Object n : nums){
                int num = (Integer)n;
                 System.out.println(num*2);
            }

            //looping the elements with enhanced forloop adding the type <Integer> to the collection
            for(int i : nums)
            System.out.println(i);


            /*If you want to add elements/value and fetch elements collection make sense,
             but if you want to work with index value, List make sense. */
            List<Integer> nums1 = new ArrayList<Integer>();
            nums1.add(67);
            nums1.add(56);
            nums1.add(87);
            nums1.add(23);
        

            System.out.println(nums1.get(3));
            try {
                System.out.println(nums1.set(4, 40));
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }

            /*Set support unique value, we can not have a repeated value in set 
            and also Set does not follow a sequence, it als does ot support index value, let's check it out */
            Set<Integer>nums2 = new HashSet<Integer>();
            nums2.add(673);
            nums2.add(566);
            nums2.add(871);
            nums2.add(923);

            for (int j: nums2) {
                System.out.println(j);
            }
            
            //If you want to follow a sequence or a sorted value, use TreeSet instead of HashSet.
            Set<Integer>nums3 = new TreeSet<Integer>();
            nums3.add(6);
            nums3.add(7);
            nums3.add(8);
            nums3.add(3);

           
           
            /*If we want to print the values without loop we can use ilterable interface 
            which has iterator method */
            Iterator<Integer> values = nums3.iterator();

            while (values.hasNext()) {
            System.out.println(values.next());             
            }

            /*MAP*/

            /*Map is an interface but it neither implement nor extends collection interface but its part of collection API
             why do we need map?
             Map id a collection of key and a value pair. Instead of using index number for a valuelike 0,1,2,3 
             we give it a name, or anything else.
             *Keys cannot be repeated in Map but the value of a key an be changed.
            */
            Map<String, Integer> students = new HashMap<>();
            students.put("Samuel", 78);
            students.put("Bisola", 89);
            students.put("Motrunrayo", 91);
            students.put("Wale", 94);
            students.put("Wale", 98);

            System.out.println(students);
            System.out.println(students.get("Samuel"));

            /*To print all the keys and values, object.keySet will print all the keys */
            System.out.println(students.keySet());

            for(String key : students.keySet())
            System.out.println(key + " : " + students.get(key));

            /*To get a synchroized key and value pair, we use HashTable instead of HashMap
             let's check it out.
             */
            Map<String, Integer> students1 = new Hashtable<>();
            students1.put("Bidemi", 34);
            students1.put("Taye", 66);
            students1.put("Bode", 12);

            for(String key : students1.keySet())
            System.out.println(key + " : " + students1.get(key));      
            
            
            /*SORTING */
            List<Integer> number = new ArrayList<>();

            number.add(56);
            number.add(78);
            number.add(77);
            number.add(86);

             /*Incase you want to have your own logic for sorting other than the collection.sort
             * we can use Comparator interface and pass the object with the collection.sort method, let's check it out
             */
            Comparator<Integer> com = new Comparator<Integer>() {
                
                public int compare(Integer i, Integer j){
                    if (i%10 > j%10) 
                        return 1;
                    else
                    return -1;
                }
            };

            Collections.sort(number, com);
            System.out.println(number);

           
    }
}
