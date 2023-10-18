package org.example;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("John");
        names.add("Robert");
        names.add(null);

        //出力
        for(int i = 0;i < names.size();i++){
            System.out.println(names.get(i));
            System.out.println(names.get(i).length());
        }
    }
}