import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 11
String value = Integer.toBinaryString(N);

int counter =0;

List<Integer> counters = new ArrayList<>();

for(int i =0; i<value.length();i++){
    char current = value.charAt(i);
    if(current == '0'){
        counter++;
    }else{
        counters.add(counter);
        counter = 0;
    }



}
return Collections.max(counters);


    }
}
