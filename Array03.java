
public class Array03 {
    public static void main(String[] args) {

        int[] numeros = {17,13,18,25,39,17};

        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println();

        //Array vai referenciar outro objeto
        numeros = new int[] {2, 5, 7, 1, 0};
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
