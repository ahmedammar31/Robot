package com.EXO_TP;

/**
 * Created by AHMED on 22/11/2016.
 */
public class ROBOT {


        private String NOM ;
        private int x;
        private int y;
        private String Dirc;
        public ROBOT(){
        }

        public ROBOT(String NOM,int x,int y,String Dirc){
            this.NOM = NOM;
            this.x=x;
            this.y=y;
            this.Dirc=Dirc;
        }

        public ROBOT(String NOM){
            this.NOM = NOM;
            this.x=0;
            this.y=0;
            this.Dirc="Est";
        }

        public String getDirc(){
            return this.Dirc;
        }

        public void setDirc(String D){
            this.Dirc=D;
        }

        public int getx(){
            return this.x;
        }

        public void setx(int x){
            this.x=x;
        }

        public int gety(){
            return this.y;
        }

        public void sety(int y){
            this.y=y;
        }

        public void avance(){
            switch(Dirc){
                case "Est" :
                    x++;
                    break;
                case "Ouest" :
                    x--;
                    break;
                case "Nord" :
                    y++;
                    break;
                case "Sud" :
                    y--;
                    break;
            }
        }

        public void droite() {
            switch(Dirc){
                case "Est" :
                    Dirc="Sud";
                    break;
                case "Ouest" :
                    Dirc="Nord";
                    break;
                case "Nord" :
                    Dirc="Est";
                    break;
                case "Sud" :
                    Dirc="Ouest";
                    break;
            }
        }

        public void afficher() {
            System.out.println("Name : "+this.NOM+" "
                    + "Position : ("+this.x+","+this.y+")"
                    + "direction : "+this.Dirc);
        }


    }

