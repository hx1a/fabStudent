package org.example.config;

/*
 * peer & orderer's configuration
 * for example:
 * PEER_0 = "peer0.org1.example.com"
 * PEER_0_URL = "grpc://localhost:7051"
 * */
public class PeerConfig {
    protected String Name;
    protected String URL;

    public PeerConfig(String name, String url) {
        this.Name = name;
        this.URL = url;
    }

}
