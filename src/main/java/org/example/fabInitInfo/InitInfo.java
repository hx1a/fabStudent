package org.example.fabInitInfo;

import org.example.config.PeerConfig;
import org.example.config.OrgConfig;
import org.example.config.ChannelConfig;
import org.example.config.ChainCodeConfig;

public class InitInfo {
    protected int PeerNum;
    protected int OrgNum;
    protected int ChannelNum;
    protected int ChaincodeNum;

    protected PeerConfig[] Peers;
    protected OrgConfig[] Orgs;
    protected ChannelConfig[] Channels;
    protected ChainCodeConfig[] Chaincodes;

    public void setNum(int peerNum, int orgNum, int channelNum, int chaincodeNum) {
        this.PeerNum = peerNum;
        this.OrgNum = orgNum;
        this.ChaincodeNum = chaincodeNum;
        this.ChannelNum = channelNum;
    }

}
