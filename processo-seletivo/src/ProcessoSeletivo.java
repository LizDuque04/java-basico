
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"José", "Ana Clara", "Phelipe", "Raphaela"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!!");
        } while (continuaTentando && tentativasRealizadas < 3);
        if(atendeu)
            System.out.println("Conseguimos contato com "+ candidato + " na " + tentativasRealizadas + "Tentariva");
        else
            System.out.println("Não conseguimos contato com " + candidato + " Numero maximo de tentativas " + tentativasRealizadas + " realizadas");
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"José", "Ana Clara", "Phelipe", "Raphaela"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");
        for(int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O candidato de Nº " + (indice + 1) + " é " + candidatos[indice]);
        }

    }


    static void selecaoCandidator(){
    String [] candidatos = {"José", "Ana Clara", "Felipe", "Fabio", "Marcia", "Phelipe", "Raphaela"};
    int candidatoSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while(candidatoSelecionados < 5 && candidatoAtual < candidatos.length){
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + ", solicitou este valor de salário: " + salarioPretendido);
        if(salarioBase >= salarioPretendido){
            System.out.println("O candidato " + candidato + " foi selevionado para a vaga");
            candidatoSelecionados++;
        }
        candidatoAtual++;
    }
}
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato.");
        }else if(salarioBase == salarioPretendido)
            System.out.println("Ligar para os candidato com contra proposta.");
        else{
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}
