package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int kelipatan[] = {5, 4, 1, 15, 17, 9, 20, 21, 35, 37};
        int index = 0;
        for (int i = 0; i < kelipatan.length; i++){

            if (kelipatan[i] % 5 != 0){
                System.out.print(","+ kelipatan[i]);
            }
        }

    }
}
