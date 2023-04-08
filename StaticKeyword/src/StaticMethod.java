
/*
 * static methods can only be called using class names
 * you cannot use non-static variables inside static method bcoz non static variables are instance variables,
 * for objects and when we call static method that method is not called using any object so static method gets,
 * confused that what values to print for non static variables.
 * 
 */
class JobPosting {
    private String title;
    private String skill;
    private int salary;
    private static String organization;

    static {
        organization = "Globallogic";
    }

    public JobPosting(String title, String skill, int salary) {
        this.title = title;
        this.skill = skill;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println(JobPosting.organization + " -> " + title + " -> " + skill + " -> " + salary);
    }

    /*
     * static method which can be only called using Classname and cannot access or use non-static variables
     */
    public static void showDetailsFromStatic() {
        System.out.println(organization + " -> " + "title" + " -> " + "skill" + " -> " + "salary");
    }
    
    /*
     * static method with class object as argument which can be only called using Classname and can access or use non-static variables
     */
    public static void showDetailsFromStatic(JobPosting jobPosting) {
        System.out.println(organization + " -> " + jobPosting.title + " -> " + jobPosting.skill + " -> " + jobPosting.salary);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        JobPosting jobPosting = new JobPosting("Developer", "Java", 60000);
        jobPosting.showDetails();

        JobPosting.showDetailsFromStatic();
        JobPosting.showDetailsFromStatic(jobPosting);
    }
}
