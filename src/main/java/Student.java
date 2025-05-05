public class Student {

    /**
     * A class to describe a student with a name, age, and student number.
     */

    private String name, studentNumber;
    private int age;

    /**
     * A constructor to assign the student's name, age, and student number, given all three parameters.
     * 
     * @param name the student's name
     * @param age the student's age
     * @param studentNumber the student's student number
     */

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * A getter method to return the name of the student.
     * 
     * @return the name of the student
     */

    public String getName() {
        return this.name;
    }

    /**
     * A getter method to return the age of the student.
     * 
     * @return the age of the student
     */

    public int getAge() {
        return this.age;
    }

    /**
     * A getter method to return the student number of the student.
     * 
     * @return the student number of the student
     */

    public String getStudentNumber() {
        return this.studentNumber;
    }

    /**
     * A method to override the default toString() that returns the student's name, age, and student number in a specific format.
     * 
     * @return "name, age - studentNumber"
     */

    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    /**
     * A method to override the default equals() that returns true if both students have the same student number.
     * 
     * @param obj the second student to compare to the constructed one
     * @return true if the students have the same student number, false otherwise
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Student s = (Student) obj;
        if (s.studentNumber.equals(this.studentNumber)) return true;
        return false;
    }

}