package fibonacciEmVetor;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciEmVetor {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int[] N = new int[T];
        for ( int i = 0; i < T ; i++) {
            N[i] = leitor.nextInt();
        }
        for(int j = 0; j< T; j++){
            if(N[j] == 0){ System.out.println("Fib(0) = 0" );
            }else if(N[j] == 0){ System.out.println("Fib(1) = 1" );
                   }
                  else {long anterior = 0, atual = 1, proximo;
                        for (int i = 1; i<= N[j]; i++) {
                        proximo = anterior + atual;
                        anterior = atual;
                        atual = proximo;
                       }
                       System.out.println("Fib("+ N[j] +") = " + anterior);
                  }

        }
    }

}

