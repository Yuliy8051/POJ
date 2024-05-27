public class Student implements Comparable{
    private String name;
    private String surname;
    private String index;

    public Student(String name, String surname, String index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
    }

    @Override
    public int compareTo(Object o) {
        Student that = (Student)o;
        return this.index.compareTo(that.index);
    }

    @Override
    public String toString() {
        return  "name: " + name + '\n' +
                "surname: " + surname + '\n' +
                "index: " + index;
    }
}
