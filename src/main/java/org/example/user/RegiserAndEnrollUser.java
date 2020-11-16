package org.example.user;

import org.example.client.CAClient;

public class RegiserAndEnrollUser {
    /**
     * Enroll admin user to OrgMSP
     * @param CA_URL: http://localhost:7054
     * @param UserName: user name
     * @param Org：org name
     * @param Msp: org MSP
     */
    public static UserContext registerAndEnrollUser(String CA_URL, String UserName, String Org, String Msp) {
        try {
            CAClient caClient = new CAClient(CA_URL, null);
            UserContext userContext = new UserContext();
            userContext.setName(UserName);
            userContext.setAffiliation(Org);
            userContext.setMspId(Msp);
            // register
            String eSecret = caClient.registerUser(UserName, Org);
            // enroll
            userContext = caClient.enrollUser(userContext, eSecret);
            return userContext;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
