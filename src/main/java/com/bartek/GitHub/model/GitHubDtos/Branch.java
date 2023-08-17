package com.bartek.GitHub.model.GitHubDtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Branch {
    private final String name;
    @JsonCreator
    public Branch(@JsonProperty("name") String name) {
        this.name = name;
    }
}
