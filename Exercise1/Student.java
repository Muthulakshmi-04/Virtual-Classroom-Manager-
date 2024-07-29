/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ei_project.Exercise1;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Student implements Observer {
    private final String id;

    public Student(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + id + " received: " + message);
    }
}

class Classroom {
    private final String name;
    private final List<Student> students = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
        addObserver(student);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void scheduleAssignment(Assignment assignment) {
        // Add assignment logic
        notifyObservers("New assignment: " + assignment.getDetails());
    }
}

