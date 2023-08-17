package com.bartek.GitHub.model.GitHubDtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Repo {
    private final String name;
    @JsonProperty("full_name")
    private final String fullName;
    private final String description;
}
