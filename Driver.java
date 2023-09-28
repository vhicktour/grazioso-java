import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();

	// had one for dog needed one for monkey
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

	public static void main(String[] args) {

		initializeDogList();
		initializeMonkeyList();

		Scanner scanner = new Scanner(System.in);

		String choice;

		// starting the loop to display menu and get input from user
		do {
			displayMenu();
			choice = scanner.nextLine();

			// code will execute per user choice.
			switch (choice) {

			case "1":
				intakeNewDog(scanner);
				break;

			case "2":
				intakeNewMonkey(scanner);
				break;

			case "3":
				reserveAnimal(scanner);
				break;

			case "4":
				printAnimals("Dog");
				break;

			case "5": // finish to print list of monkeys
				printAnimals("Monkey");
				break;

			case "6": // need to implement and finish to print all
				printAnimals("Available");
				break;

			case "q":
				System.out.println("Thank you, good bye!");
				choice = "q";
				break;

			default:
				System.out.println("Invalid choice.");
				break;

			}
			// continue expression
		} while (!choice.equals("q"));

	}

	// This method prints the menu options
	public static void displayMenu() {
		System.out.println("\n\n");
		System.out.println("\t\t\t\tRescue Animal System Menu");
		System.out.println("[1] Intake a new dog");
		System.out.println("[2] Intake a new monkey");
		System.out.println("[3] Reserve an animal");
		System.out.println("[4] Print a list of all dogs");
		System.out.println("[5] Print a list of all monkeys");
		System.out.println("[6] Print a list of all animals that are not reserved");
		System.out.println("[q] Quit application");
		System.out.println();
		System.out.println("Enter a menu selection");
	}

	// Adds dogs to a list for testing
	public static void initializeDogList() {
		Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
				false, "United States");
		Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
				"United States");
		Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
				"Canada");

		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
	}

	// Adds monkeys to a list for testing
	// Optional for testing
	public static void initializeMonkeyList() {

	}

	// Complete the intakeNewDog method
	// The input validation to check that the dog is not already in the list
	// is done for you
	public static void intakeNewDog(Scanner scanner) {
		System.out.println("What is the dog's name?");
		String name = scanner.nextLine();
		for (Dog dog : dogList) {
			if (dog.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis dog is already in our system\n\n");
				return; // returns to menu
			}
		}

		// Add the code to instantiate a new dog and add it to the appropriate list

		// will getall attributes for dog then add everything from user input

		System.out.println("Dog's breed: ");
		String breed = scanner.nextLine();
		System.out.println("Dog's gender: ");
		String gender = scanner.nextLine();
		System.out.println("Dog's age: ");
		String age = scanner.nextLine();
		System.out.println("Dog's weight: ");
		String weight = scanner.nextLine();
		System.out.println("Acquisition date: ");
		String acquisitionDate = scanner.nextLine();
		System.out.println("Acquisition Country: ");
		String acquisitionCountry = scanner.nextLine();
		System.out.println("Training status: ");
		String trainingStatus = scanner.nextLine();
		System.out.println("Is dog reserved? ");
		boolean reserved = scanner.nextBoolean();
		scanner.nextLine();
		System.out.println("Dog's in-service country? ");
		String inServiceCountry = scanner.nextLine();

		// new instance of Dog
		Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
				reserved, inServiceCountry);

		// setting type
		// add info to dog list
		dogList.add(dog);

	}

	// Complete intakeNewMonkey
	// Instantiate and add the new monkey to the appropriate list
	// For the project submission you must also validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
	public static void intakeNewMonkey(Scanner scanner) {
		System.out.println("Monkey's Name: ");

		String name = scanner.nextLine();

		for (Monkey monkey : monkeyList) {
			if (monkey.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis Monkey is already in our system\n\n");
				return;
			}
		}

		// getting species
		System.out.println("Monkey's species: ");
		String species = scanner.nextLine();
		// now confirming species is allowed & prints error if not //added Squirrel
		// monkey
		if (!species.equalsIgnoreCase("Capuchin") && !species.equalsIgnoreCase("Guenon")
				&& !species.equalsIgnoreCase("Macaque") && !species.equalsIgnoreCase("Marmoset")
				&& !species.equalsIgnoreCase("Tarmarin") && !species.equalsIgnoreCase("Squirrel Monkey")) {
			System.out.println("This is not an allowed species, sorry");
			return;
		}

		// get info on new Monkey

		System.out.println("Monkey's gender: ");
		String gender = scanner.nextLine();
		System.out.println("Monkey's age: ");
		String age = scanner.nextLine();
		System.out.println("Monkey's weight: ");
		String weight = scanner.nextLine();
		System.out.println("Acquisition date: ");
		String acquisitionDate = scanner.nextLine();
		System.out.println("Acquisition Country: ");
		String acquisitionCountry = scanner.nextLine();
		System.out.println("Tail length: ");
		String tailLength = scanner.nextLine();
		System.out.println("Body length: ");
		String bodyLength = scanner.nextLine();
		System.out.println("Height: ");
		String height = scanner.nextLine();
		System.out.println("Training status: ");
		String trainingStatus = scanner.nextLine();
		System.out.println("Is dog reserved? ");
		boolean reserved = scanner.nextBoolean();
		scanner.nextLine();
		System.out.println("Dog's in-service country? ");
		String inServiceCountry = scanner.nextLine();

		// new monkey
		Monkey monkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry, reserved,
				bodyLength, height, trainingStatus, tailLength, inServiceCountry);
		monkeyList.add(monkey);

	}

	// Complete reserveAnimal
	// You will need to find the animal by animal type and in service country
	public static void reserveAnimal(Scanner scanner) {
		// getting input and finding if there are dogs in that location or monkey
		// and saying yes or no
		System.out.println("What is the animal type? ");
		String animalType = scanner.nextLine();
		System.out.println("What is the country they are in service? ");
		String inServiceCountry = scanner.nextLine();

		boolean reserved = false;
		if (animalType.equalsIgnoreCase("Monkey")) {

			for (Monkey monkey : monkeyList) {

				// Check if an available monkey at location which is unreserved then reserve it.
				if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry)
						&& monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {

					monkey.setReserved(true);
					System.out.println("Reserved:" + monkey.toString());
					reserved = true;
					break;

				}
			}
		}

		else {
			for (Dog dog : dogList) {

				// Check if an available dog at location which is unreserved then reserve it.
				if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry)
						&& dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {

					dog.setReserved(true);
					System.out.println("Reserved:" + dog.toString());
					reserved = true;
					break;
				}
			}
		}

		if (!reserved) {
			System.out.println("There are none Available.");
		}

	}

	// Complete printAnimals
	// Include the animal name, status, acquisition country and if the animal is
	// reserved.
	// Remember that this method connects to three different menu items.
	// The printAnimals() method has three different outputs
	// based on the listType parameter
	// dog - prints the list of dogs
	// monkey - prints the list of monkeys
	// available - prints a combined list of all animals that are
	// fully trained ("in service") but not reserved
	// Remember that you only have to fully implement ONE of these lists.
	// The other lists can have a print statement saying "This option needs to be
	// implemented".
	// To score "exemplary" you must correctly implement the "available" list.
	public static void printAnimals(String Type) {

		// printing the list base on the type t
		if (Type.equals("Monkey")) {
			System.out.println("Monkey List");
			for (Monkey monkey : monkeyList) {
				System.out.println(monkey.toString());
			}
		}
		if (Type.equals("Dog")) {
			System.out.println("Dog List");
			for (Dog dog : dogList) {
				System.out.println(dog.toString());
			}
		}
		if (Type.equals("Available")) {
			System.out.println("All in service and available animals");
			for (Monkey monkey : monkeyList) {
				if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
					System.out.println(monkey.toString());
				}
			}
			for (Dog dog : dogList) {
				if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
					System.out.println(dog.toString());
				}
			}
		}

	}
}