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
        double resultado1 = (10 * 7) + (20 / 4);

        System.out.println (soma);
        System.out.println (subtracao);
        System.out.println (multiplicacao);
        System.out.println (divisao);
        System.out.println (modulo);
        System.out.println (resultado1);

//----------------------------------------------
        //Operador ternario 

        int a, b;
        a = 5;
        b = 7;

        String resultado = a==b ? "verdadeiro" : "false";

        System.out.println(resultado);
//------------------------------------------------- 
            //Operadores relacionais
        int c, d;
        a = 10;
        d = 89;

        String resultado2 = a > b ? "Sim" : "Não";
        System.out.println(resultado2);

        String nomeUm, nomeDois;
        nomeUm = "Eliza";
        nomeDois = new String ("Eliza");

        System.out.println(nomeUm.equals(nomeDois));
//-------------------------------------------------
    }
}
