package org.matrix.Lesson_23;

public class Customer {
    private String name;
    private String surname;
    private String email;
    private int finCode;
    private int cardNumber;
    private int phoneNumber;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String surname, String email, int finCode, int cardNumber, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.finCode = finCode;
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFinCode() {
        return finCode;
    }

    public void setFinCode(int finCode) {
        this.finCode = finCode;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Salam, Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", finCode=" + finCode +
                ", cardNumber=" + cardNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
