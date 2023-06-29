package Queue;

// Using this class to understand PriorityQueue in more depth
public class StudentMarks {

    private int maths;
    private int physics;

    public StudentMarks(int maths, int physics) {
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
}
