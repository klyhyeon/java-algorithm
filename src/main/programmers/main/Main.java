package programmers.main;

import programmers.exhaustive_search.Exam;

public class Main {

    public static void main(String[] args) {
        Exam exam = new Exam();
        System.out.println(exam.solution(
                new int[]{1,3,2,4,2,3})
        );
    }
}
