//package org.example.user;
//
//import org.example.client.CAClient;
//import org.example.config.Config;
//import org.example.util.Util;
//
//public class RegisterEnrollUser {
//    public static void main(String[] args) {
//        try {
//            Util.cleanUp();
//            String caUrl = Config.CA_ORG1_URL;
//            CAClient caClient = new CAClient(caUrl, null);
//            // Enroll Admin to Org1MSP
//            UserContext adminUserContext = new UserContext();
//            adminUserContext.setName(Config.ADMIN);
//            adminUserContext.setAffiliation(Config.ORG1);
//            adminUserContext.setMspId(Config.ORG1_MSP);
//            caClient.setAdminUserContext(adminUserContext);
//            adminUserContext = caClient.enrollAdminUser(Config.ADMIN, Config.ADMIN_PASSWORD);
//
//            // Register and Enroll user to Org1MSP
//            UserContext userContext = new UserContext();
//            String name = "user" + System.currentTimeMillis();
//            userContext.setName(name);
//            userContext.setAffiliation(Config.ORG1);
//            userContext.setMspId(Config.ORG1_MSP);
//
//            String eSecret = caClient.registerUser(name, Config.ORG1);
//
//            userContext = caClient.enrollUser(userContext, eSecret);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}

/*
注册用户所使用配置信息：
组织1的URL地址:      Config.CA_ORG1_URL = "http://localhost:7054"
组织管理员名称:      Config.ADMIN = "admin"
组织名称:           Config.ORG1 = "org1"
组织1的MSP:         Config.ORG1_MSP = "Org1MSP"
组织管理员的密码:    Config.ADMIN_PASSWORD = "adminpw"
 */
