package com.bartek.GitHub.model.GitHubDtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {
    private final String username;

    @JsonCreator
    public static User create(@JsonProperty("username") String username) {
        return new User(username);
    }
}
