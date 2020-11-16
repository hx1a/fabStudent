package org.example.config;

// chaincode's configuration
public class ChainCodeConfig {
    protected String RootDir;
    protected String Name;
    protected String Path;
    protected String Version;

    public ChainCodeConfig(String rootDir, String name, String path, String version) {
        this.RootDir = rootDir;
        this.Name = name;
        this.Path = path;
        this.Version = version;
    }

    public String getRootDir() {
        return this.RootDir;
    }

    public String getName() {
        return this.Name;
    }

    public String getPath() {
        return this.Path;
    }

    public String getVersion() {
        return this.Version;
    }

}
