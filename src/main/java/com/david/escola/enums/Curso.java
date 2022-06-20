package com.david.escola.enums;

public enum Curso {
    
    JAVA("Java"),
    SPRING("Spring"),
    THYMELEAF("Thymeleaf"),
    BOOTSTRAP("Bootstrap");

    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }
}
