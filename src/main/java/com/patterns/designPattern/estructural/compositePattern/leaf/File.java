package com.patterns.designPattern.estructural.compositePattern.leaf;

import com.patterns.designPattern.estructural.adapter.StripePayment;
import com.patterns.designPattern.estructural.compositePattern.component.FileSystemComponent;

public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File name: "+ name);
    }
}
