package com.bartek.GitHub.mapper;

import com.bartek.GitHub.model.AppDtos.RepoApp;
import com.bartek.GitHub.model.AppDtos.SubsApp;
import com.bartek.GitHub.model.GitHubDtos.Repo;
import com.bartek.GitHub.model.GitHubDtos.Subs;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubsMapper {
    SubsApp toAppDto(Subs subs);
    List<SubsApp> toAppList(List<Subs> subsList);
}
