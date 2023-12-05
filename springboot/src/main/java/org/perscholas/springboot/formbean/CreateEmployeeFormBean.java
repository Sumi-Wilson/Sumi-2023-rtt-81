package org.perscholas.springboot.formbean;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class CreateEmployeeFormBean {
    private Integer id;

    @NotEmpty(message = "First Name is required.")
    @Pattern(regexp = "[a-zA-Z]+" , message = "First Name must contain only letters")
    @Length(max = 45 , message = "First name must be less than 45 characters.")
    private String firstName;

    @NotEmpty(message = "Last Name is required.")
    @Pattern(regexp = "[a-zA-Z]+" , message = "Last Name must contain only letters")
    @Length(max = 45 , message = "Last name must be less than 45 characters.")
    private String lastName;

    @NotEmpty(message = "Department Name required")
    private String departmentName;

}
