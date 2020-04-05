class Faculty{
    String facultyName;
    List<Student> studentList;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.studentList = new ArrayList<>();
    }

    public addStudent(Student student){
        this.studentList.add(student);
    }

    public double avgECTS(){
        return studentList.stream()
                .mapToDouble(s -> s.ECTSCredits())
                .average()
                .orElse(0);
    }

    public double avgGrades(){
        return studentList.stream()
                .mapToDouble(s -> s.getAverageGrade())
                .average()
                .orElse(0);
    }
}