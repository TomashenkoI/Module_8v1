package ua.goit.java;

import java.util.Comparator;

/**
 * Created by 7 on 20.03.2016.
 */
public class File {

    private String name;
    private String type;
    private double size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public File(String name, String type, double size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String toString() {
        return "| " + name + "\t"+"| " + type + " | " + size + " mb\t |";
    }
}
