/**
 * @class: VirtualPet
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: April 24, 23
 * description: This program creates a virtual pet simulator game. It will constantly get closer to being sick or sad,
 * but by feeding it or playing with it you can stop that from happening. It asks the user for the name and age of the
 * virtual pet.
 */
package VirtualPet;
import java.util.Scanner;

public class VirtualPetSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pet Simulator!");
        System.out.print("Enter your pet's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your pet's age: ");
        int age = scanner.nextInt();

        VirtualPet pet = new VirtualPet(name,age);

        while (!pet.isSick() && !pet.isSad()) {
            pet.hunger();
            pet.sad();
            pet.thirst();
            pet.printStatus();
            System.out.println("Choose an action:");
            System.out.println("1. Feed");
            System.out.println("2. Drink");
            System.out.println("3. Play");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    pet.feed();
                    System.out.println(name + " ate some food.");
                    break;
                case 2:
                    pet.drink();
                    System.out.println(name + " drank some water.");
                    break;
                case 3:
                    pet.play();
                    System.out.println(name + " played with you.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (pet.isSick()) {
            System.out.println(name + " became sick and went to the vet.");
        } else {
            System.out.println(name + " became sad and needs some love.");
        }
    }
}
