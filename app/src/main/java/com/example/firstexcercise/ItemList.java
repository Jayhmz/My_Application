package com.example.firstexcercise;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    List<String> Categories (String singleSelection){

        List<String> options = new ArrayList<String>();

        if (singleSelection.equals("Beverage")){
            options.add("Milo");
            options.add("Bourvita");
            options.add("Biscuits");
        }
        else if (singleSelection.equals("Drinks")){
            options.add("Coke");
            options.add("Lacasera");
            options.add("Shapman");
        }
        else if (singleSelection.equals("Detergent")){
            options.add("Good Mama");
            options.add("Klin");
            options.add("Omo");
        }
        else if (singleSelection.equals("Fruit")){
            options.add("Cashew");
            options.add("Mango");
            options.add("Pawpaw");
        }
        else if (singleSelection.equals("Toiletory")){
            options.add("Tissue");
            options.add("Always");
            options.add("Sponge");
        }
        else if (singleSelection.equals("Accessory")){
            options.add("Cutlerries");
            options.add("Bulb");
            options.add("Scissors");
        }
        else if (singleSelection.equals("Stationary")){
            options.add("Biro");
            options.add("Pencil");
            options.add("Eraser");
        }
        return options;
    }

}
