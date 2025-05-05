
public class Monkey extends RescueAnimal {
	/* Monkey-specific attributes */
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    /* Constructors */
    public Monkey() {
        /* Default constructor */
    }

    public Monkey(String name, String gender, String age, String weight, String acquisitionDate,
                  String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
                  String species, String tailLength, String height, String bodyLength) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionCountry(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }

    /* Accessor and mutator methods for monkey-specific attributes */
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    
    public String getBodyLength() {
        return bodyLength;
    }
    
    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }
}
