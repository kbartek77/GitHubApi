package com.bartek.GitHub.mapper;

import com.bartek.GitHub.model.AppDtos.BranchApp;
import com.bartek.GitHub.model.AppDtos.RepoApp;
import com.bartek.GitHub.model.GitHubDtos.Branch;
import com.bartek.GitHub.model.GitHubDtos.Repo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BranchMapper {
    BranchApp toAppDto (Branch branch);
    List<BranchApp> toAppList(List<Branch> branches);

}
