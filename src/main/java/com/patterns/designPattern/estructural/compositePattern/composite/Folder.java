package com.patterns.designPattern.estructural.compositePattern.composite;

import com.patterns.designPattern.estructural.compositePattern.component.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }


    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder name" + name);

        for (FileSystemComponent fileSystemComponent: components){
            fileSystemComponent.showDetails();
        }
    }
}
