package com.bartek.GitHub.model.GitHubDtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Subs {
    private final boolean subscribed;
    @JsonCreator
    public Subs(@JsonProperty("subscribed") boolean subscribed) {
        this.subscribed = subscribed;
    }
}
