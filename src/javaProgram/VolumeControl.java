package javaProgram;

import java.util.Scanner;

public class VolumeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        int res =Math.abs(x-y);
        System.out.println(res);
    }

}
