package com.zwu.rest.service;

import com.atlassian.confluence.security.SpacePermissionManager;
import com.atlassian.confluence.spaces.Space;
import com.atlassian.confluence.spaces.SpaceManager;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.user.Group;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;
import java.util.List;

@Named("SpaceService")
public class SpaceServiceImpl implements SpaceService {

    @ComponentImport
    private final SpaceManager spaceManager;
    @ComponentImport
    private final SpacePermissionManager spacePermissionManager;

    @Inject
    public SpaceServiceImpl(SpaceManager spaceManager
                        , SpacePermissionManager spacePermissionManager) {
        this.spaceManager = spaceManager;
        this.spacePermissionManager = spacePermissionManager;
    }

    @Override
    public List<Space> getAllSpaces() {
        return spaceManager.getAllSpaces();
    }

    @Override
    public Collection<Group> getAllGroups(String spaceKey) {
        return spacePermissionManager.getGroupsWithPermissions(spaceManager.getSpace(spaceKey));
    }
}
