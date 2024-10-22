package Assignments.Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CheckInteger {

    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();


        for(int n = 1; n < 10; n++){
            numbers.add(n);
        }

        numbers.add(rand.nextInt(9)+1);
        int[] count = new int[numbers.size()];

        for(int num : numbers){
            count[num]++;
            if(count[num]>1){
                System.out.println(num + " is the repeated number.");
            }
        }
    }
}
