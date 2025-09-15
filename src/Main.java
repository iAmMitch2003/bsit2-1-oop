public class PetClinicSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("=============================");

        Pet buddy = new TrainableDog("Buddy", 3);
        Pet whiskers = new Cat("Whiskers", 2);
        Pet tweety = new TrainableBird("Tweety", 1);

        buddy.displayInfo();
        buddy.makeSound();

        whiskers.displayInfo();
        whiskers.makeSound();

        tweety.displayInfo();
        tweety.makeSound();

        System.out.println("\nTraining Session Started!");
        System.out.println("=============================");

        Trainer trainer = new Trainer();
        trainer.train((Trainable) buddy);
        trainer.train((Trainable) tweety);

        System.out.println("\nService Charges:");
        System.out.println("=============================");
        PetService.main(null);
}