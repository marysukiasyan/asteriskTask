package academy.learnprogramming;

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

    public void aPartEmpty(){
        n = 8;
        for (int i = 0; i < n; i++) {
            System.out.println();

            for (int j = i; j < n; j++) {

                if (j == i || j == n-1) {
                    System.out.print("*");
                }
                System.out.print(" ");

            }

        }

    }
    public void bPartEmpty(){




    }
    public void cPartEmpty(){




    }
    public void dPartEmpty(){




    }

    public void ePartEmpty(){




    }
    public void fPartEmpty(){




    }

}
