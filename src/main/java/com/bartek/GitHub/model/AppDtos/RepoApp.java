package com.bartek.GitHub.model.AppDtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepoApp {
    private String name;
    private String fullName;
    private String description;
}
