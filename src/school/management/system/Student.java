package school.management.system;



//this class is reposible to keep the track of students' fees, name fees paid

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public void updateFeesPaid(int fees){

        feesPaid+=fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }
    public int getFeesTotal() {
        return feesTotal;
    }
}
