
/*
 * static variables are shared by all the objects i.e. it is a class member
 * Should be used with the name of the class
 */
class Job {
    private String title;
    private String skill;
    private int salary;
    private static String organization = "Globallogic"; //static variable shared with all the objects


    public Job(String title, String skill, int salary) {
        this.title = title;
        this.skill = skill;
        this.salary = salary;
    }
    

    public void showJobDetails() {
        System.out.println(Job.organization + "->" + title + " -> " + skill + " -> " + salary);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Job job1 = new Job("Java Developer", "Java", 60000);
        Job job2 = new Job("Backend Developer", "SpringBoot", 50000);

        job1.showJobDetails();
        job2.showJobDetails();
    }
}
