package com.example.demo;

import com.example.demo.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName;

    @Max(value=10, message="must be less than or equal to 10")
    @Min(value=0, message="must be greater than or equal to zero")
    @NotNull(message = "is required")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    // We will use the default validation pattern and error message
    @CourseCode(value = "ZTM", message = "must start with ZTM")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

}
