package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Jumbo Burger: 4 tomato slices and 1 cheese slice.
Small Burger: 2 Tomato slices and 1 cheese slice.
*
* */

public class NumOfSmallAndBigBurger {
/*
4x + 2y = tomato
x + y = cheese
=>
4x +2(cheese -x) = tommato
4x-2x = tomato - 2 * cheese

=>
2x = tomato - 2 * cheese

x = (tomato - 2 * cheese) / 2
y = cheese - x
*/


    public static void main(String[] args) {

        findtheNumberOftotalSmallAndBigBurger(10,4) ;
        findtheTotal(7,8);
    }

    private static List findtheTotal(int tomatoSlices, int cheeseSlices) {
        int x = (tomatoSlices - 2 * cheeseSlices) / 2;
        int y = cheeseSlices - x;
        System.out.println(x+","+y);
        if (x >= 0 && x % 2 == 0 && y >= 0) {
            return Arrays.asList(x, y);
        } else {
            return new ArrayList();
        }
    }



    private static List findtheNumberOftotalSmallAndBigBurger(int tomatoSlices, int cheeseSlices) {
        int twoX = tomatoSlices - 2 * cheeseSlices;
        int x = twoX / 2;
        int y = cheeseSlices - x;
        System.out.println(x+","+y);
        if(twoX>=0 && twoX % 2 == 0 && y >= 0){
            return Arrays.asList(x, y);
        }else{
            return new ArrayList();
        }

    }

}




/*
Given two integers tomatoSlices and cheeseSlices. The ingredients of different burgers are as follows:

Jumbo Burger: 4 tomato slices and 1 cheese slice.
Small Burger: 2 Tomato slices and 1 cheese slice.
Return [total_jumbo, total_small]
so that the number of remaining tomatoSlices equal to 0
and the number of remaining cheeseSlices equal to 0.
If it is not possible to make the return [].

* */