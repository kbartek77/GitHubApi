package com.bartek.GitHub.mapper;

import com.bartek.GitHub.model.AppDtos.RepoApp;
import com.bartek.GitHub.model.GitHubDtos.Repo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RepoMapper {
    RepoApp toAppDto(Repo repo);
    List<RepoApp> toAppList(List<Repo> repos);
}
