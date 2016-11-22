package com.EXO_TP;


/**
 * Created by AHMED on 22/11/2016.
 */
public class ROBOT_NG extends ROBOT {

        private boolean turbo=false;
        public ROBOT_NG(String NOM,int x,int y,String Dirc){
            super(NOM,x,y,Dirc);
        }

        /* public void avance(int p){
         for(int i=0;i<p;i++)
             super.avance();
         }
         public void gauche(){
         for(int i=0;i<3;i++)
             droite();
         }
         public void demiTour(){
         for(int i=0;i<2;i++)
             droite();
         }*/

        public void turboStatus(boolean t)
        {
            turbo=t;
        }

        public void avance(int p){
            if(turbo==true)
                p=p*3;
            switch(getDirc()){
                case "Est" :
                    setx(getx()+p);
                    break;
                case "Ouest" :
                    setx(getx()-p);
                    break;
                case "Nord" :
                    sety(gety()+p);
                    break;
                case "Sud" :
                    sety(gety()-p);
                    break;
            }
        }

        public void gauche(){
            switch(getDirc()){
                case "Est" :
                    setDirc("Nord");
                    break;
                case "Ouest" :
                    setDirc("Sud");;
                    break;
                case "Nord" :
                    setDirc("Ouest");
                    break;
                case "Sud" :
                    setDirc("Est");;
                    break;
            }

        }

        public void demiTour(){
            switch(getDirc()){
                case "Est" :
                    setDirc("Ouest");
                    break;
                case "Ouest" :
                    setDirc("Est");;
                    break;
                case "Nord" :
                    setDirc("Sud");
                    break;
                case "Sud" :
                    setDirc("Nord");;
                    break;
            }
        }

        @Override
        public void afficher(){
            super.afficher();
            if(turbo==true)
                System.out.println("turbo activer");
            else
                System.out.println("turbo disactiver");
        }



}
