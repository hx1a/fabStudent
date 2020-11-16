package org.example.config;

/*
 * channel's base configuration
 * for example:
 *   Path = "config/channel.tx"
 *   Name = "mychannel"
 * */
public class ChannelConfig {
    protected String Path;
    protected String Name;

    public ChannelConfig(String path, String name) {
        this.Path = path;
        this.Name = name;
    }

}
