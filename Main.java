package com.EXO_TP;

public class Main {

    public static void main(String[] args) {


                ROBOT R[] = new ROBOT[4];
                R[0] = new ROBOT("ammar",0,2,"Est");
                R[1] = new ROBOT_NG("seraie",2,3,"Nord");
                R[2] = new ROBOT ("ahmed");
                R[3] = new ROBOT_NG("ahmed1",9,5,"Sud");
                for(int i=0;i<4;i++)
                    R[i].afficher();
            }

        }


