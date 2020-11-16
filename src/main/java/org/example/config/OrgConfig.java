package org.example.config;

/*
 * organization's configuration
 * for example:
 *   ORG1 = "org1"
 *   ORG2_MSP = "Org2MSP"
 *   ADMIN = "admin";
 *   ADMIN_PASSWORD = "adminpw"
 *   BASE_PATH = "crypto-config" + File.separator + "peerOrganizations" + File.separator + "org1.example.com" + File.separator + "users" + File.separator + "Admin@org1.example.com"
 *   ADMIN_PK = ORG1_USR_BASE_PATH + File.separator + "keystore"
 *   ADMIN_CERT = ORG1_USR_BASE_PATH + File.separator + "admincerts"
 *  */
public class OrgConfig {
    public String OrgName;
    public String OrgMsp;
    //
    public String Admin;
    public String AdminPassWord;
    // key & cert store
    public String BasePath;
    public String AdminPK;
    public String AdminCert;

    public OrgConfig(String orgName, String orgMsp, String admin, String adminPassWord, String basePath, String adminPK, String adminCert) {
        this.Admin = admin;
        this.OrgMsp = orgMsp;
        this.OrgName = orgName;
        this.AdminPassWord = adminPassWord;
        this.BasePath = basePath;
        this.AdminPK = adminPK;
        this.AdminCert = adminCert;
    }

}
