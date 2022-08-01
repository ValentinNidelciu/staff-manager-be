package ro.jlg.staff.manager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@AllArgsConstructor
@Getter
public class Employee {
    @Id
    private String id;
    private String name;
    private String email;
    private LocalDateTime dateOfBirth;

    public void modify(final String email, final String dateOfBirth){
        this.email = email;
        this.dateOfBirth = LocalDateTime.parse(dateOfBirth);
    }



}
