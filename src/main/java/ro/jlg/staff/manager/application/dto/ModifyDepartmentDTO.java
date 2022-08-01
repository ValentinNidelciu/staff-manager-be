package ro.jlg.staff.manager.application.dto;

public class ModifyDepartmentDTO {
    private String id;
    private String name;
    private String description;
    private int maxEmployees;

    // constructor
    public ModifyDepartmentDTO(String id, String name,
                               String description, int maxEmployees) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.maxEmployees = maxEmployees;
    }

    // getters / setters
    public String getId() { return id; }
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