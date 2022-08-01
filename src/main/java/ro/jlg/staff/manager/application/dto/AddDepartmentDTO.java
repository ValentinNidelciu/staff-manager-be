package ro.jlg.staff.manager.application.dto;

public class AddDepartmentDTO {
    private String name;
    private String description;
    private int maxEmployees;

    // constructor
    public AddDepartmentDTO(final String name, final String description,
                            final int maxEmployees){
        this.name = name;
        this.description = description;
        this.maxEmployees = maxEmployees;
    }

    // getters / setters
    public String getName() { return name; }
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
