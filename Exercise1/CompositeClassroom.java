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

interface ClassroomComponent {
    void showDetails();
}

class CompositeClassroom implements ClassroomComponent {
    private final String name;
    private final List<ClassroomComponent> components = new ArrayList<>();

    public CompositeClassroom(String name) {
        this.name = name;
    }

    public void add(ClassroomComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Composite Classroom: " + name);
        for (ClassroomComponent component : components) {
            component.showDetails();
        }
    }
}

class SimpleClassroom implements ClassroomComponent {
    private final String name;

    public SimpleClassroom(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Simple Classroom: " + name);
    }
}

