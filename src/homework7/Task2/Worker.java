package homework7.Task2;

public class Worker implements Comparable<Worker> {
    private final String surname;
    private final String nameWork;
    private final long year;

    public Worker(String surname, String nameWork, long year) {
        this.surname = surname;
        this.nameWork = nameWork;
        this.year = year;
    }


    @Override
    public int compareTo(Worker worker) {
        return this.surname.compareTo(worker.surname);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "surname='" + surname + '\'' +
                ", nameWork='" + nameWork + '\'' +
                ", year=" + year +
                '}';
    }
}
