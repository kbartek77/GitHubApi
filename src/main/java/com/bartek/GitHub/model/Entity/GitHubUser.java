package com.bartek.GitHub.model.Entity;

import com.bartek.GitHub.model.AppDtos.RepoApp;
import com.bartek.GitHub.model.AppDtos.UserApp;
import com.bartek.GitHub.model.GitHubDtos.Repo;
import com.bartek.GitHub.model.GitHubDtos.User;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GitHubUser {
    private UserApp details;
    private List<RepoApp> repos;
}
