package org.matrix.Lesson_22;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Validation {
    int min() default 0;

    int max() default Integer.MAX_VALUE;

    boolean required() default false;
}

public class Person {
    @Validation(min = 3, max = 50, required = true)
    private String name;

    @Validation(min = 18, max = 120, required = true)
    private int age;

    @Validation(max = 100, required = false)
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 25, "john.doe@example.com");
        person.validate();
    }

    public void validate() {
        for (Field field : this.getClass().getDeclaredFields()) {
            Validation validation = field.getAnnotation(Validation.class);
            if (validation != null) {
                try {
                    field.setAccessible(true);
                    Object value = field.get(this);
                    Object o = new Object();
                    if (validation.required() && value == null) {
                        System.out.println("Error: " + field.getName() + " is required but was null.");
                        continue;
                    }
                    if (value instanceof String) {
                        String stringValue = (String) value;
                        if (stringValue.length() < validation.min() || stringValue.length() > validation.max()) {
                            System.out.println("Error: " + field.getName() + " must have length between " + validation.min() + " and " + validation.max() + ".");
                        }
                    } else if (value instanceof Integer) {
                        int intValue = (Integer) value;
                        if (intValue < validation.min() || intValue > validation.max()) {
                            System.out.println("Error: " + field.getName() + " must be between " + validation.min() + " and " + validation.max() + ".");
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
