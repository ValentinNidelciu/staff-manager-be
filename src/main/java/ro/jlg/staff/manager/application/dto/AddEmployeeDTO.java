package ro.jlg.staff.manager.application.dto;

public class AddEmployeeDTO {
    private String name;
    private String email;
    private String dateOfBirth;

    public AddEmployeeDTO(final String name,final String email,final String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
}
