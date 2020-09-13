package com.team2.questionme.dto;

import java.time.LocalDate;

public class QuestionDTO {

    private Long id;
    private String contents;
    private LocalDate localDate;
    private String category;
    private UserDTO asker;

    public QuestionDTO(Long id, String contents, LocalDate localDate, String category, Long askerId, String askerName) {
        this.id = id;
        this.contents = contents;
        this.localDate = localDate;
        this.category = category;
        this.asker = new UserDTO(askerId, askerName);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public UserDTO getAsker() {
        return asker;
    }

    public void setAsker(UserDTO asker) {
        this.asker = asker;
    }
}
