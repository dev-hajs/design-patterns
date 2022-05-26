package com.study.designpatterns._03_behavioral_patterns._20_state._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student studentHa = new Student("ha");
        Student studentJisoo = new Student("jisoo");
        studentJisoo.addPrivate(onlineCourse);

        onlineCourse.addStudent(studentHa);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello review", studentHa);

        onlineCourse.addStudent(studentJisoo);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
