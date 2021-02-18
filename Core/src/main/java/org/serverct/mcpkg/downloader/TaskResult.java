package org.serverct.mcpkg.downloader;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.ApiStatus;
import org.serverct.mcpkg.MCPkg;
import org.serverct.mcpkg.util.StringConsts;

import java.io.File;

@ApiStatus.AvailableSince("0.1.0")
@Getter
@AllArgsConstructor
public final class TaskResult {
    private String repo;
    private String packageName;
    private String version;
    @Setter
    private Result result;

    public File getFileLocation() {
        return new File(StringConsts.CACHE_LOCATION_FOTMAT.replaceAll("%cache_dir", MCPkg.getImpl().getCacheDir())
                .replaceAll("%repo", repo)
                .replaceAll("%package", packageName)
                .replaceAll("%version", version));
    }

    public boolean isSucceed() {
        return result == Result.DOWNLOADED;
    }

    public enum Result {
        DOWNLOADED, NOT_FOUND, NOT_COMPATIBILITY, IOEXCEPTION, FAILED_TO_VERIFY_SIGN;
    }
}
