public class exe2B {
    public static void main(String[] args){


        int i,soma=0;
        for (i=1;i<=100;i++){
            Math.pow(i,2);
            soma += i;
        }
        System.out.print("A soma dos quadrados entre 1-100 = "+soma);
    }
}
