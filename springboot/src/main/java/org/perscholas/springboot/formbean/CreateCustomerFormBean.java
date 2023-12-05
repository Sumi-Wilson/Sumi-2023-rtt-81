package org.perscholas.springboot.formbean;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class CreateCustomerFormBean {
    private Integer id;

    @NotEmpty(message = "First Name is required.")
    @Length(max = 45,message =  "First name must be less than 45 characters.")
    @Pattern(regexp = "[a-zA-Z]+" , message = "First Name must contain only letters")
    private String firstName;

    @NotEmpty(message = "Last name is required.")
    @Length(max = 45,message =  "Last name must be less than 45 characters.")
    @Pattern(regexp = "[a-zA-Z]+" , message = "First Name must contain only letters")
    private String lastName;

    @Length(max = 45,message =  "Phone must be less than 45 characters.")
    private String phone;

    @NotEmpty(message = "city is required.")
    private String city;

    //@Email(message = "email is not valid email")
   // @Pattern(regexp = "^[A-Za-z0-9+_.- ]+@(.+)$",message = "Email is not valid email.")
    //privare String Email;


}
