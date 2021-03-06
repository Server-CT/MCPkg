package cc.sfclub.packy.api.exception;

import cc.sfclub.packy.api.EnvironmentRequirement;
import cc.sfclub.packy.api.pkg.IPackageVersion;

import java.util.List;

public class PackageMissing extends PackageConflictException{

    public PackageMissing(List<EnvironmentRequirement> conflicts) {
        super(conflicts);
    }
}
