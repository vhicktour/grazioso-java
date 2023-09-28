public class Monkey extends RescueAnimal {

	// Instance
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;

	// constructor
	public Monkey(String name, String gender, String age, String weight, String acquisitionDate,
			String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
			String tailLength, String height, String bodyLength, String species) {
		setName(name);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
	}

	// Assessor
	public String getSpecies() {
		return species;
	}

	// Mutator
	public void setSpecies(String species) {
		this.species = species;
	}

	// Accessor
	public String getTailLength() {
		return tailLength;
	}

	// mutator
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	// acc
	public String getHeight() {
		return height;
	}

	// mut
	public void setHeight(String height) {
		this.height = height;
	}

	// acc
	public String getBodyLength() {
		return bodyLength;
	}

	// mut
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}

}