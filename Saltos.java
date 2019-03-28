//https://www.aceptaelreto.com/problem/statement.php?id=158&cat=5

import java.util.Scanner;

public class Saltos {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int subir = 0;
        int bajar = 0;
        int posAnterior;

        int tests = dato.nextInt();
        for(int i = 0; i < tests; i++){
            subir = 0;
            bajar = 0;
            int pos = 0;
            int saltos = dato.nextInt();
            for (int j = 0; j < saltos; j++){

                if(j == 0){
                    pos = dato.nextInt();
                }

                else{
                    posAnterior = pos;
                    pos = dato.nextInt();
                    if (posAnterior > pos){
                        bajar++;
                    }
                    if (posAnterior < pos){
                        subir++;
                    }
                }
            }
            System.out.println(subir + " " + bajar);
        }
    }
}
