class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> grades;
    //TODO constructor

	public Student(String index, String firstName, String lastName) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = new ArrayList<>();
	}

	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAverage() {
		//TODO
		return this.grades.stream()
				.mapToDouble(i -> i.doubleValue())
				.average()
				.orElse(0);
    }

    public int ECTSCredits() {
        //TODO
		return 6*this.grades.stream()
				.filter(i->i>=6)
				.count();
    }
}
