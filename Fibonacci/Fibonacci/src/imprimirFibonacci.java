public class imprimirFibonacci {
    int sequencia(int x){
        return(x<2?x:sequencia(x-1)+sequencia(x-2));
        //e a mesma coisa que:
        // if(x == 0 || x == 1){
        //     return x;
        // }
        // return sequencia(x-1)+sequencia(x-2);
    }
}