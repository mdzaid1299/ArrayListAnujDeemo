import java.util.ArrayList;

class Emplo {
    public static void main(String[] args) {
        employee e1 = new employee(101, "Ayush", 56000, 65);
        employee e2 = new employee(101, "Monish vysa", 56000, 6);
        employee e3 = new employee(101, "abhi", 56000, 12);
        ArrayList<employee> List = new ArrayList<>();
        List.add(e1);
        List.add(e2);
        List.add(e3);
        List.stream().filter(date-> date.age>26).forEach(employee -> System.out.println(employee.age));
    }
}