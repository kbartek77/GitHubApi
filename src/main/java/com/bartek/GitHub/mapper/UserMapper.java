package com.bartek.GitHub.mapper;

import com.bartek.GitHub.model.AppDtos.RepoApp;
import com.bartek.GitHub.model.AppDtos.UserApp;
import com.bartek.GitHub.model.GitHubDtos.Repo;
import com.bartek.GitHub.model.GitHubDtos.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toGithubDto (UserApp userApp);
    UserApp toAppDto(User user);
}
