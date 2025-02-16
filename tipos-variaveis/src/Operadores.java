public class Operadores {
    public static void main(String[] args) {
        //concatenação
        String nome_Completo = "Elizabete " + "Duque";
        System.out.println(nome_Completo);
//-----------------------------------------------------
        //Tornar um número positivo ou negativo

        int numero = 5;
        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);
//----------------------------------------------------
        double soma = 10.5 + 15.17;
        int subtracao = 113 - 25;
        int multiplicacao = 4 * 84;
        int divisao = 15 / 3;
        //modulo resto da divisão
        int modulo = 18 % 3;
        //ordem de precedencia
        double resultado = (10 * 7) + (20 / 4);

        System.out.println (soma);
        System.out.println (subtracao);
        System.out.println (multiplicacao);
        System.out.println (divisao);
        System.out.println (modulo);
        System.out.println (resultado);
    }
}
