public class MaquinaBanho {
    
    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;


    public void darBanho(){
        if (this.pet == null){
            System.out.println("Coleque o Pet na maquina para darmos o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void usarWater(){
        if (water == 30){
            System.err.println("A capacidade de água da maquina está no maximo");
            return;
        }

        water += 2;
    }

    public void adicionarShampoo(){
        if (shampoo == 10){
            System.out.println("Você chegou ao limite do Shampoo");
            return;
        }
        shampoo += 2;
    }

    public int getWater(){
        return water;
    }

    public int getShampoo(){
        return shampoo;
    }

    public boolean temPet(){
        return pet != null;
    }

    public void colocarPet(Pet pet){
        if (!this.clean){
            System.out.println("A maquina está suja, para colocar o Pet é necessario limpa-la");
            return;
        }
        if (temPet()){
            System.err.println("O pet " + this.pet.getName()+ " está na máquina nesse momento.");
            return;
        }

        this.pet = pet;
    }

    public void retirarPet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo!");
        this.pet = null;
    }
    
    public void limpar(){
        this.water -=10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está limpa!");
    }

}
