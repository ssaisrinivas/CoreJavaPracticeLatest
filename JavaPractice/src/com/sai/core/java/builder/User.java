package com.sai.core.java.builder;

public final class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    // The User constructor is private, so it can only be called from inside the class.
    // It takes the Builder object as an argument.
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    // Static factory method to get a new Builder instance.
    public static Builder builder() {
        return new Builder();
    }

    // The static nested Builder class
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        // Methods for setting optional parameters, each returning `this`.
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // The final method that creates the immutable User object.
        public User build() {
            // Optional: validation can happen here.
            if (firstName == null || lastName == null) {
                throw new IllegalStateException("First and last name are required.");
            }
            return new User(this);
        }
    }
}
