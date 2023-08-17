package com.bartek.GitHub.model.Entity;

import com.bartek.GitHub.model.AppDtos.BranchApp;
import com.bartek.GitHub.model.AppDtos.RepoApp;
import com.bartek.GitHub.model.AppDtos.SubsApp;
import com.bartek.GitHub.model.GitHubDtos.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GitHubRepo {
    private RepoApp details;
    private List<BranchApp> branches;
    private List<SubsApp> subscribers;
}
