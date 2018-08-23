package com.zwu.rest.service;

import com.atlassian.confluence.spaces.Space;
import com.atlassian.user.Group;

import java.util.Collection;
import java.util.List;

public interface SpaceService {

    List<Space> getAllSpaces();

    Collection<Group> getAllGroups(String spaceKey);
}
