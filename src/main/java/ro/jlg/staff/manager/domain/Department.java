package ro.jlg.staff.manager.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Department {

    @Id
    private String id;
    private String name;
    private String description;
    private int maxEmployees;

    // Constructor
    public Department(final String id, final String name,
                      final String description, final int maxEmployees) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.maxEmployees = maxEmployees;
    }
    public Department() {}

    // Methods
    public void modifyDepartment(final String name, final String description, final int maxEmployees) {
        this.name = name;
        this.description = description;
        this.maxEmployees = maxEmployees;
    }

    // Getters / Setters
    public String getId() {  return id; }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxEmployees() {
        return maxEmployees;
    }
    public void setMaxEmployees(int maxEmployees) {
        this.maxEmployees = maxEmployees;
    }
}
