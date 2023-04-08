
/*
 * static blocks are used to initialize static variable
 * as static blocks belongs to class so they re first to get initialized and called when class loads
 * static block executed before the execution of static method
 * Static Block Executed before main
 */
class Job {
    private String title;
    private String skill;
    private int salary;
    private static String organization;

    public Job(String title, String skill, int salary) {
        this.title = title;
        this.skill = skill;
        this.salary = salary;
    }

    /*
     * static block
     */
    static {
        organization = "Globallogic";
    }

    public void showJobDetails() {
        System.out.println(Job.organization + "->" + title + " -> " + skill + " -> " + salary);
    }
}


public class StaticBlock {
    public static void main(String[] args) {
        Job job = new Job("Java Developer", "Java", 60000);
        job.showJobDetails();
    }
}
