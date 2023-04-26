package VirtualPet;

public class VirtualPet {
    private String name;
    private int age;
    private PetNeeds petNeeds; //need to create VirtualPet.PetNeeds class


    //constructor
    public VirtualPet(String name, int age) {
       this.name = name;
       this.age = age;
       this.petNeeds = new PetNeeds();

    }
    //generates random number within the min and max inclusively
    private int getRandomNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }
    // ********** REALLY LOOK AT THIS TO SEE HOW IT ALL CONNECTS ************
    public void feed(){
        int deceaseAmount = getRandomNumber(10,20);
        petNeeds.decreaseHunger(deceaseAmount);
    }
    public void drink(){
        int deceaseAmount = getRandomNumber(10,20);
        petNeeds.decreaseThirst(deceaseAmount);
    }
    public void play(){
        int increaseAmount = getRandomNumber(10,20);
        petNeeds.increaseHappiness(increaseAmount);
    }
    public void sad(){
        int increaseAmount = getRandomNumber(-5,-10);
        petNeeds.increaseHappiness(increaseAmount);
    }
    public void thirst() {
        int deceaseAmount = getRandomNumber(-5, -10);
        petNeeds.decreaseThirst(deceaseAmount);
    }
    public void hunger(){
        int deceaseAmount = getRandomNumber(-5,-10);
        petNeeds.decreaseHunger(deceaseAmount);
    }

    public boolean isSick(){
       return petNeeds.getHunger() >= 100 || petNeeds.getThirst() >= 100;
    }
    public boolean isSad(){
        return petNeeds.getHappiness() <= 0;
    }
    public void printStatus(){
        System.out.println(name + " - Age " + age);
        System.out.println("Hunger: " + petNeeds.getHunger() + "/100");
        System.out.println("Thirst: " + petNeeds.getThirst() + "/100");
        System.out.println("Happiness: " + petNeeds.getHappiness() + "/100");
        System.out.println();
    }




}
