package Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueueConcepts {
    public final void usePriorityQueueForIntegerClass(Queue<Integer> queue) {
        int index = 0;
        List<Integer> priorityList = new ArrayList<>();

        /*
         * !IMPORTANT
         * Do not use iterator to interate over PriorityQueue because it will not give
         * elements acc. to priority set
         * Instead use isEmpty() to perform the required task
         */
        while (!queue.isEmpty()) {
            if (index == 2)
                break;
            priorityList.add(queue.poll());
            index++;
        }

        System.out.println(priorityList);
        System.out.println(queue);
    }

    public void usePriorityQueueForStudentMarksClassWithNoComparable() {
        List<StudentMarks> lStudentMarks = new ArrayList<>();
        lStudentMarks.add(new StudentMarks(70, 80));
        lStudentMarks.add(new StudentMarks(60, 70));
        lStudentMarks.add(new StudentMarks(80, 60));
        lStudentMarks.add(new StudentMarks(50, 40));
        lStudentMarks.add(new StudentMarks(90, 50));

        PriorityQueue<StudentMarks> qStudentMarks = new PriorityQueue<>(lStudentMarks);
        int index = 0;
        List<StudentMarks> priorityList = new ArrayList<>();

        /*
         * !IMPORTANT
         * Do not use iterator to interate over PriorityQueue because it will not give
         * elements acc. to priority set
         * Instead use isEmpty() to perform the required task
         */
        while (!qStudentMarks.isEmpty()) {
            if (index == 3)
                break;
            priorityList.add(qStudentMarks.poll());
            index++;
        }
        /*
         * Exception in thread "main" java.lang.ClassCastException: class
         * Queue.StudentMarks cannot be cast to class java.lang.Comparable
         * (Queue.StudentMarks is in unnamed module of loader 'app';
         * java.lang.Comparable is in module java.base of loader 'bootstrap')
         */
        System.out.println(priorityList);

    }

    public void usePriorityQueueForStudentMarksRevisedClassWithComparable() {
        List<StudentMarksRevised> lStudentMarksRevised = new ArrayList<>();
        lStudentMarksRevised.add(new StudentMarksRevised(70, 80));
        lStudentMarksRevised.add(new StudentMarksRevised(60, 70));
        lStudentMarksRevised.add(new StudentMarksRevised(80, 60));
        lStudentMarksRevised.add(new StudentMarksRevised(50, 40));
        lStudentMarksRevised.add(new StudentMarksRevised(90, 50));

        PriorityQueue<StudentMarksRevised> qStudentMarksRevised = new PriorityQueue<>(lStudentMarksRevised);
        int index = 0;
        List<StudentMarksRevised> priorityListRevised = new ArrayList<>();

        /*
         * !IMPORTANT
         * Do not use iterator to interate over PriorityQueue because it will not give
         * elements acc. to priority set
         * Instead use isEmpty() to perform the required task
         */
        while (!qStudentMarksRevised.isEmpty()) {
            if (index == 3)
                break;
            priorityListRevised.add(qStudentMarksRevised.poll());
            index++;
        }

        System.out.println(priorityListRevised);

    }

    public void usePriorityQueueForIntegerClassWithComparator() {
        // declaring priorityQueue with using Comparator for internal working and
        // comparison i.e. now MyCustomComparator class ordering will be followed

        // This is old way of passing custom class comparator's
        Queue<Integer> priorityQueue = new PriorityQueue<>(new MyCustomComparator());
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(30);
        priorityQueue.offer(40);
        priorityQueue.offer(50);
        // Using Lambda expression to pass the comparator for comparison
        Queue<Integer> lambdaPriorityQueue = new PriorityQueue<>((obj1, obj2) -> {
            System.out.println("Lambda used comparator's compare() method is called");
            return obj1 < obj2 ? -1 : ((obj1 == obj2 ? 0 : 1));
        });
        lambdaPriorityQueue.offer(10);
        lambdaPriorityQueue.offer(20);
        lambdaPriorityQueue.offer(30);
        lambdaPriorityQueue.offer(40);
        lambdaPriorityQueue.offer(50);

        int index = 0;
        List<Integer> priorityListRevised = new ArrayList<>();

        /*
         * !IMPORTANT
         * Do not use iterator to interate over PriorityQueue because it will not give
         * elements acc. to priority set
         * Instead use isEmpty() to perform the required task
         */
        while (!lambdaPriorityQueue.isEmpty()) {
            if (index == 3)
                break;
            priorityListRevised.add(lambdaPriorityQueue.poll());
            index++;
        }

        System.out.println(priorityListRevised);
        System.out.println(lambdaPriorityQueue);
        ;
    }
}

public class PriorityQueueCon {
    public static void main(String[] args) {

        /*
         * Ordering coming from the classes itself is called as -> Natural Ordering
         * Ordering given from the Custom implementation is called as -> Total Ordering
         * Precedence ---->>> Total Ordering > Natural Ordering
         */
        PriorityQueueConcepts queueConcepts = new PriorityQueueConcepts();
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(30);
        priorityQueue.offer(40);
        priorityQueue.offer(50);

        // As Integer class be default implements COMPARABLE INTERFACE and has
        // compareTo() method already implemented therefore with any change it will work
        // and give the result needed.
        queueConcepts.usePriorityQueueForIntegerClass(priorityQueue);

        // get me top 3 students according to their maths marks
        // no comparison strategy is there for PriorityQueue to sort or get the highest
        // among each others
        // queueConcepts.usePriorityQueueForStudentMarksClassWithNoComparable();

        // get me top 3 students according to their maths marks
        // Comparison strategy provided to PriorityQueue so as to sort or get the
        // highest among each others using compareTo() method of COMPARABLE INTERFACE
        queueConcepts.usePriorityQueueForStudentMarksRevisedClassWithComparable();

        // get me bottom 3 integers according to their values
        // Comparison strategy provided to PriorityQueue so as to sort or get the
        // highest among each others using compare() method of COMPARATOR INTERFACE in
        // MyCustomComparator class
        queueConcepts.usePriorityQueueForIntegerClassWithComparator();
    }
}
