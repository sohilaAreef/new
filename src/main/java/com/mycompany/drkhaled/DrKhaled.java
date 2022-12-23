/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.drkhaled;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class DrKhaled {

    public static void main(String[] args) {
        int[] arr= new int[10];
        int maxx=0, minn=1000000;
        Scanner s=new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
            maxx=Math.max(maxx, arr[i]);
            minn=Math.min(minn, arr[i]);
        }
           for(int i=0;i<10;i++){
            if (arr[i]!=minn||arr[i]!=maxx)
                System.out.println(arr[i]+" ");
        }
    }
}
