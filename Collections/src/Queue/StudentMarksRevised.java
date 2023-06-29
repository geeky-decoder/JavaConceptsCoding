package Queue;

public class StudentMarksRevised implements Comparable<StudentMarksRevised> {

    private int maths;
    private int physics;

    public StudentMarksRevised(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return this.maths;
    }

    public int getPhysics() {
        return this.physics;
    }

    @Override
    public String toString() {
        return "{" +
                " maths='" + getMaths() + "'" +
                ", physics='" + getPhysics() + "'" +
                "}";
    }

    @Override
    public int compareTo(StudentMarksRevised o) {
        /*
         * current object < given object
         * return -ve number;
         */

        /*
         * current object > given object
         * return +ve number;
         */

        /*
         * current object == given object
         * return 0 number;
         */
        // return o.maths - this.maths;
        return (o.maths < this.maths) ? -1 : ((o.maths == this.maths) ? 0 : 1);
    }
}
