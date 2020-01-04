package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class PrintAster {
    private int n;
    char asterisk='*';
    public PrintAster() {


    }
    public void aPart() {
        n = 8;
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
        }
    }


    public void bPart(){
        System.out.println();
        n=8;
        for(int i=0; i< n; i++){

            for(int j=n-1; j>i; j--) {

                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public void fPart() {
        n = 8;
        for (int i = 0; i < 8; i++) {
            System.out.println();


            for (int k = i; k < 7; k++) {
                System.out.print(" ");

            }
            for (int j = i; j > 0; j--) {

                System.out.print("*");
            }
        }
    }

    public void dPart(){
        n=8;
        for(int i=0; i<n; i++){
            System.out.println();
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
        }
    }

    public void cPart() {
        n = 8;
        for (int i = 8; i > 0; i--) {
            System.out.println();


            for (int k = i; k < 8; k++) {
                System.out.print(" ");

            }
            for (int j = i; j > 0; j--) {

                System.out.print("*");
            }
        }
    }
    public void ePart(){
        n=8;
        for(int i=n; i>0; i--){
            System.out.println();
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int k=i; k>0; k--){
                System.out.print("*");
                System.out.print("*");


            }
        }
    }



    public void aPartEmpty() {
        int n = 8;
        for (int i = 0; i < n; i++) {


            System.out.println();

            if (i==0){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }

            }

            if (i != 0) {
                for (int j = 1; j <= n - i; j++) {

                    if (j == 1) {
                        System.out.print("*");
                    } else if (j == n - i) {
                        System.out.print("*");
                    } else if (j > 1 && j < n - i) {
                        System.out.print(" ");
                    }

                }

            }
        }

        System.out.println();
        }






    public void bPartEmpty(){
        int n = 8;
        int m=16;
        for (int i = 0; i < n; i++) {
            System.out.println();
            if(i==n-1){
                for (int j = 0; j < m; j++) {
                    System.out.print("*");

                }
            }
            if(i!= n-1) {
                for (int j = 1; j <= m; j++) {
                    if (j == (m / 2) - i || j == (m / 2) + 1 + i) {
                        System.out.print("*");
                    }

                    if (j != (m / 2) - i & j != (m / 2) + 1 + i) {
                        System.out.print(" ");

                    }

                }
            }


        }








    }


    public void cPartEmpty(){
        int n=8;
        for (int i = 0; i < n; i++) {
            System.out.println();
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");

                }


            }
            if (i != 0) {
                for (int j = 0; j < n; j++) {
                    if (j == n - 1 || j == i) {

                        System.out.print("*");
                    }

                    if (j != n - 1 && j!= i) {
                        System.out.print(" ");

                    }

                }

            }
        }





    }
    public void dPartEmpty(){

        int n=8;

        for (int i=1; i<=n; i++){
            System.out.println();
            for (int j = 1; j < i; j++) {
                if(j==i-1 || j==1) {
                    System.out.print("*");
                }
                if(j<i-1 && j>1) {
                    System.out.print(" ");
                }

            }
            if(i==n){
                System.out.println();
                for (int j = 0; j < n; j++) {
                    System.out.print("*");

                }
            }

        }

    }

    public void ePartEmpty(){
        int n=8;
        int m=16;
        for (int i = 0; i < n; i++) {
            System.out.println();
            if(i==0){
                for (int j = 0; j < m; j++) {
                    System.out.print("*");
                }
            }
            if(i!=0){
            for (int j = 0; j < m; j++) {
                if (j == i || j == m - 1 - i) {
                    System.out.print("*");
                }

                if (j != i & j != m - i) {
                    System.out.print(" ");

                }


            }

            }
        }

    }

    public void fPartEmpty(){
        int n=8;
        for (int i = 0; i < n; i++) {

            System.out.println();
            if(i==n-1){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            if(i!=n-1) {
                for (int j = 1; j <= n; j++) {
                    if (j == n - i || j == n) {

                        System.out.print("*");
                    }
                    if (j != n - i && j != n) {
                        System.out.print(" ");
                    }


                }
            }
        }




    }

}

