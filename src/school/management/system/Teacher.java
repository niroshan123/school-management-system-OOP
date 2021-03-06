package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned=0;

    public Teacher(int id, String name,int salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getId(){
        return this.id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public  void  recieveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
}
