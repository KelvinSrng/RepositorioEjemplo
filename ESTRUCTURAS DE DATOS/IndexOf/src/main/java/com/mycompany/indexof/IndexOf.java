package com.mycompany.indexof;

import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mss = "La universidad #Universidad Tecnica particular de Loja# tiene dos modalidades de estudios";
        
        System.out.println(mss.substring(mss.indexOf("#")+1,mss.lastIndexOf("#")));
    }
}