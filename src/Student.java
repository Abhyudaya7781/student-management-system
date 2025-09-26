public class Student {
    private int id;
    private String name;
    private String course;
    private double gpa;

    public Student(int id, String name, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + course + " | " + gpa;
    }
}
