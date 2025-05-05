import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    public static void main(String[] args) {

        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

/* Menu Loop with user input validation*/ 
        
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            displayMenu();
            String input = scanner.nextLine();
            
            if(isValidChoice(input)) {
            	choice = input.charAt(0);
            	
                switch (choice) {
                case '1':
                    intakeNewDog(scanner);
                    break;
                case '2':
                    intakeNewMonkey(scanner);
                    break;
                case '3':
                    reserveAnimal(scanner);
                    break;
                case '4':
                	printAnimals("dog");
                	break;
                case '5':   
                	printAnimals("monkey");
                	break;
                case '6':
                    printAnimals("available");
                    break;
                case 'q':
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
                }
            } else {
            	System.out.println("Invalid choice! Please try again.");
            	choice = '\0';
            }
        } while (choice != 'q');

        scanner.close();
    }
    
    /* Method to validate user input */
    public static boolean isValidChoice(String choice) {
    	return choice.matches("[1-6q]");
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
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    
    /* Monkey Array list and test monkey objects */ 
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Adam", "male", "5", "20", "08-01-2021", "United States", "intake", false, "United States", "Squirrel monkey", "10", "2", "1");
        Monkey monkey2 = new Monkey("Lisa", "female", "2", "10", "06-11-2023", "Mexico", "Phase I", false, "Mexico", "Marmost", "5", "3", "7");
        Monkey monkey3 = new Monkey("Apples", "female", "1", "5", "12-01-2022", "France", "intake", true, "France", "Guenon", "3", "2", "4");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        
        /* New dog method */
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
 
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the dog reserved? (true/false)");
        boolean reserved = scanner.nextBoolean();

        System.out.println("What is the dog's in-service country?");
        String inServiceCountry = scanner.nextLine();
        
        /* create a new list */
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        /* Add new list to array */
        dogList.add(newDog);
    }

    
        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    
    /* New monkey in-take with input validation */
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }

            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();

            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();

            System.out.println("Does the monkey have a tail? (Yes/No)");
            String tailLength = scanner.nextLine();

            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();

            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();

            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();

            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("Is the monkey reserved? (true/false)");
            boolean reserved = scanner.nextBoolean();
            
            scanner.nextLine();

            System.out.println("What is the monkey's in-service country?");
            String inServiceCountry = scanner.nextLine();
            
            /* Create a new list */
            Monkey newMonkey = new Monkey(name, gender, age, weight, species, tailLength, height, reserved, acquisitionDate,
                acquisitionCountry, trainingStatus, bodyLength, inServiceCountry);

            /* Add new list to array */
            monkeyList.add(newMonkey);
        }   

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        
       /* Reserve animal method */ 
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Please enter the animal type (dog or monkey}:");
            String animalType = scanner.nextLine();
            
            System.out.println("Please enter the in-service country:");
            String inServiceCountry = scanner.nextLine();
            
            boolean animalReserved = false;
            
            if (animalType.equalsIgnoreCase("dog")) {
            	for (Dog dog : dogList) {
            		if (dog.getInServiceCountry().equalsIgnoreCase(inServiceCountry)) {
            			if (!dog.getReserved()) {
            				dog.setReserved(true);
            				animalReserved = true;
            				System.out.println("Dog has been successfully reserved!");
            			} else {
            				System.out.println("Sorry, this dog is already reserved");
            			}
            			break;
            		}
            	}
            } else if (animalType.equalsIgnoreCase("monkey")) {
            	for (Monkey monkey : monkeyList) {
            		if (monkey.getInServiceCountry().equalsIgnoreCase(inServiceCountry)) {
            			if (!monkey.getReserved()) {
            				monkey.setReserved(true);
            				animalReserved = true;
            				System.out.println("Monkey has been successfully reserved!");
            			} else {
            				System.out.println("Sorry, this monkey is already reserved");
            			}
            			break;
            		}
            	}
            } else {
            	System.out.println("Invalid animal type");
            }
            
            if (!animalReserved) {
            	System.out.println("There is no animal of the specified type and in-service country");
            }
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        
        /* PrintAnimals accessing both dog and monkey lists */
        public static void printAnimals(String listType) {
        	if (listType.equalsIgnoreCase("dog")) {
                System.out.println("List of Dogs:");
                for (Dog dog : dogList) {
                    System.out.println("Dog Name: " + dog.getName());
                    System.out.println("Status: " + dog.getTrainingStatus());
                    System.out.println("Acquisition Country: " + dog.getAcquisitionCountry());
                    System.out.println();
                }
            } else if (listType.equalsIgnoreCase("monkey")) {
                System.out.println("List of Monkeys:");
                for (Monkey monkey : monkeyList) {
                    System.out.println("Monkey Name: " + monkey.getName());
                    System.out.println("Status: " + monkey.getTrainingStatus());
                    System.out.println("Acquisition Country: " + monkey.getAcquisitionCountry());
                    System.out.println();
                }
            } else if (listType.equalsIgnoreCase("available")) {
                System.out.println("List of Animals Available for Reservation:");
                System.out.println("Dogs:");
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                        System.out.println("Dog Name: " + dog.getName());
                        System.out.println("Status: " + dog.getTrainingStatus());
                        System.out.println("Acquisition Country: " + dog.getAcquisitionCountry());
                        System.out.println();
                    }
                }
                System.out.println("Monkeys:");
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                        System.out.println("Monkey Name: " + monkey.getName());
                        System.out.println("Status: " + monkey.getTrainingStatus());
                        System.out.println("Acquisition Country: " + monkey.getAcquisitionCountry());
                        System.out.println();
                    }
                }
            } else {
                System.out.println("This option not available");
            }
        }
}
        	
        	
        	
        	
        	
        	
        	
        	
            
          
      


