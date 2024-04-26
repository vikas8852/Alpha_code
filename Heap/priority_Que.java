package Heap;
import java.util.*;
public class priority_Que {
    static class Student implements Comparable<Student>{ //interface 'comparable'
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
       // PriorityQueue<Integer>pq=new PriorityQueue<>();//element pop in accending order by default
      //  PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder()); //In descending Order
       PriorityQueue<Student>pq=new PriorityQueue<>();
        // pq.add(3);
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);
        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek());
        //     pq.remove();
        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }


        }
    }
    

