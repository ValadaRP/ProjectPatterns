package cwiczenia.kompozyt.kolokwium;

import cwiczenia.kompozyt.kolokwium.Project;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Project {
    private String name;
    private List<Project> projects = new ArrayList<Project>();

    public Manager(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    @Override
    public void add(Project project) {
        projects.add(project);
    }

    @Override
    public void remove(Project project) {
        projects.remove(project);
    }

    @Override
    public void print() {
        System.out.println("Manager: " + name);
        for (Project project : projects) {
            project.print();
        }
    }
}
