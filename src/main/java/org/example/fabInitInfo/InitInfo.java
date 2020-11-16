package org.example.fabInitInfo;

import org.example.config.PeerConfig;
import org.example.config.OrgConfig;
import org.example.config.ChannelConfig;
import org.example.config.ChainCodeConfig;

import java.util.ArrayList;

public class InitInfo {
//    protected int PeerNum;
    protected int OrgNum;
    protected int ChannelNum;
    protected int ChaincodeNum;

    protected ArrayList Peers;
    protected OrgConfig[] Orgs;
    protected ChannelConfig[] Channels;
    protected ChainCodeConfig[] Chaincodes;

    public void setNum(int peerNum, int orgNum, int channelNum, int chaincodeNum) {
//        this.PeerNum = peerNum;
        this.OrgNum = orgNum;
        this.ChaincodeNum = chaincodeNum;
        this.ChannelNum = channelNum;
    }

    public void addPeers(String name, String url){
        Peers.add(new PeerConfig(name,url));
    }


}
