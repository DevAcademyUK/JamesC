package animals;

import java.util.Scanner;


public class createAnimal {
    Scanner myScanner = new Scanner(System.in);


    public static void main (String[] args){

        createAnimal newAnimal= new createAnimal();
        newAnimal.getAnimalType();


    }

    private void getAnimalType() {
        System.out.println("What animal would you like tho create?");

        String animal = myScanner.nextLine();
        if (animal.equalsIgnoreCase("dog")) {
            createDog();
        } else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        } else
            System.out.println(animal + " is not an animal we can currently create, please try again");
    }

    private void createCat() {
        System.out.println("What is the cat's name?");
        String name = myScanner.nextLine();
        System.out.println("How agitated is your cat?");
        String attitude = myScanner.nextLine();
        System.out.println("How old is the cat?");
        String age = myScanner.nextLine();
        System.out.println("How happy is your cat?");
        String emotion = myScanner.nextLine();

//calling a constructor for cat object
        cat myCat = new cat(name, age, attitude, emotion);

        String meow = myCat.meow(attitude);
        String tail = myCat.tail(emotion);
        System.out.println(name+age+attitude+emotion);

        System.out.println(name+" is "+age+". "+ "It is a "+attitude+" and " + emotion+ "cat.");
        System.out.println();
        System.out.println("CAT CREATED SUCCESSFULLY");
        System.out.println("Hi human, my name is "+name+". "+meow+" "+tail);


    }

    private void createDog() {
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        String age = myScanner.nextLine();
        System.out.println("how heavy is the dog?");
        String weight = myScanner.nextLine();

        dog myDog = new dog(name, size, age, weight);

        String bark = myDog.bark(size);
        String wag = myDog.wag(size);
        String move = myDog.move(weight);

        System.out.println(name+" is "+age+". "+"It is a "+size+" and "+weight);
        System.out.println();
        System.out.println("DOG CREATED SUCCESSFULLY");
        System.out.println("Hi human, my name is "+name+". "+bark+" "+wag+" i am "+move);


    }



}
