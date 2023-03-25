

public class exe2A{
    public static void main(String[] args){


        int i,soma=0;
        for (i=2;i<=100;i++){
            if(i%2==0) {
                soma += i;
            }
        }
        System.out.print("A soma dos termos pares entre 2-100 = "+soma);
    }
}
