package org.serverct.mcpkg.impl.repo;

import lombok.RequiredArgsConstructor;
import org.serverct.mcpkg.repo.IRepo;
import org.serverct.mcpkg.repo.data.local.PackageInfo;

import java.util.Set;

@RequiredArgsConstructor
public class DefaultRepoImpl implements IRepo {
    private final Set<String> urls;
    private final String repoName;

    //todo 完善，对接 DAL
    @Override
    public Set<PackageInfo> searchPackages(String keywords) {

        return null;
    }

    @Override
    public boolean refresh() {
        return false;
    }
}
