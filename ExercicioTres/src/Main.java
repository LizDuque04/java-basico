import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static MaquinaBanho maquinaBanho = new MaquinaBanho();
    public static void main(String[] args) {
        var option = -1;

        do {
            System.err.println("Escolha uma das opções");
            System.err.println("1 - Dar Banho no Pet");
            System.err.println("2 - Abastecer a máquina com água.");
            System.err.println("3 - Abastecer a máquina com shampoo.");
            System.err.println("4 - Verificar água da máquina. ");
            System.err.println("5 - Verificar o Shampoo da máquina.");
            System.err.println("6 - Verificar se tem Pet no banho.");
            System.err.println("7 - Colocar pet na máquina.");
            System.err.println("8 - Retirar pet da máquina.");
            System.err.println("9 - Limpar a Máquina.");
            System.err.println("0 - Sair.");

            option = scanner.nextInt();

            switch (option){
                case 1 -> maquinaBanho.darBanho();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> colocarPetNaMaquina();
                case 8 -> maquinaBanho.retirarPet();
                case 9 -> maquinaBanho.limpar();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);
    }

    private static void setWater(){
        System.out.println("Testando colocar água na máquina");
        maquinaBanho.usarWater();
    }

    private static void setShampoo(){
        System.out.println("Testando colocar Shampoo na máquina");
        maquinaBanho.adicionarShampoo();
    }

    private static void verifyWater(){
        var amount = maquinaBanho.getWater();
        System.out.println("A máquina está no momento com " + amount + "litros de água.");
    }

    private static void verifyShampoo(){
        var amount = maquinaBanho.getShampoo();
        System.out.println("A máquina está no momento com " + amount + "litros de shampoo.");
    }

    private static void checkIfHasPetInMachine(){
        var temPet = maquinaBanho.temPet();
        System.out.println(temPet ? "Tem pet na máquina" : "Não tem pet na máquina." );
    }

    public static void colocarPetNaMaquina(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Informe o nome do Pet: ");
            name = scanner.next();
        }
        System.err.println("Informa o nome do pet: ");
        var pet =  new Pet(name);
        maquinaBanho.colocarPet(pet);
        System.out.println("O pet " + pet.getName()+ " foi colocado na máquina.");
    }

}
