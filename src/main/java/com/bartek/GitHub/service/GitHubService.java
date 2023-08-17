package com.bartek.GitHub.service;

import com.bartek.GitHub.client.GitHubClient;
import com.bartek.GitHub.mapper.BranchMapper;
import com.bartek.GitHub.mapper.RepoMapper;
import com.bartek.GitHub.mapper.SubsMapper;
import com.bartek.GitHub.mapper.UserMapper;
import com.bartek.GitHub.model.AppDtos.BranchApp;
import com.bartek.GitHub.model.AppDtos.RepoApp;
import com.bartek.GitHub.model.AppDtos.SubsApp;
import com.bartek.GitHub.model.AppDtos.UserApp;
import com.bartek.GitHub.model.GitHubDtos.*;

import com.bartek.GitHub.model.Entity.GitHubRepo;
import com.bartek.GitHub.model.Entity.GitHubUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GitHubService {
    private final GitHubClient gitHubClient;
    private final BranchMapper branchMapper;
    private final UserMapper userMapper;
    private final SubsMapper subsMapper;
    private final RepoMapper repoMapper;

    public GitHubUser showUserRepos(String user) {
        User userDetails = gitHubClient.showUserDetails(user);
        List<Repo> userRepos = gitHubClient.showUserRepos(user);
        UserApp mappedUser = userMapper.toAppDto(userDetails);
        List<RepoApp> mappedRepos = repoMapper.toAppList(userRepos);
        GitHubUser gitHubUser = GitHubUser.builder()
                .details(mappedUser)
                .repos(mappedRepos)
                .build();
        return gitHubUser;
    }

    public GitHubRepo showReposDetails(String owner, String repo) {
        Repo oneRepo = gitHubClient.showUserOneRepo(owner, repo);
        List<Branch> branches = gitHubClient.showAllBranches(owner, repo);
        List<Subs> subscribers = gitHubClient.showAllSubscribers(owner, repo);
        RepoApp mappedRepo = repoMapper.toAppDto(oneRepo);
        List<BranchApp> mappedBranch = branchMapper.toAppList(branches);
        List<SubsApp> mappedSubs = subsMapper.toAppList(subscribers);
        GitHubRepo gitHubRepo = GitHubRepo.builder()
                .details(mappedRepo)
                .branches(mappedBranch)
                .subscribers(mappedSubs)
                .build();
        return gitHubRepo;
    }
}

