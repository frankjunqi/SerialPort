package com.zillion.evm.jssc.config;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kjh08490 on 2016/10/28.
 */

public class Constant {
    public static final String APP_NAME = "Vending";
    public static final String BODY_KEY_APP = "app";
    public static final String BODY_KEY_METHOD = "wsid";
    public static final String BODY_KEY_PWD = "pwd";
    public static final String BODY_KEY_UDID = "deviceid";
    public static final String BODY_KEY_USER = "user";
    public static final String BODY_PARAM_KEY_DATA = "data";
    public static final String BODY_VALUE_APP = "evmandroid";
    public static final String BODY_VALUE_METHOD = "";
    public static String BODY_VALUE_PWD = "T6R4BL8D";
    public static String BODY_VALUE_UDID = "ddddddd";
    public static final String BODY_VALUE_USER = "";
    public static final String BODY_XML_INPUT = "data";
    public static final int DAY = 2;
    public static final String DES_VI = "ZKH12345";
    public static final String DOWNLOAD_URL = "/mnt/sdcard/Download/";
    public static final String HEADER_KEY_CLIENTVER = "client_version";
    public static final String HEADER_KEY_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_VALUE_CLIENTVER = "2.4.6";
    public static final String HEADER_VALUE_CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final int HOUR = 3;
    public static final String HTTP_OPERATE_TYPE_CHECK = "CheckRestStatus";
    public static final String HTTP_OPERATE_TYPE_DESGET = "DESGet";
    public static final String HTTP_OPERATE_TYPE_GETDATA = "GetData";
    public static final String HTTP_OPERATE_TYPE_INSERT = "Insert";
    public static final String HTTP_OPERATE_TYPE_UPDATEDETAILDIFFERENTIAQTY = "UpdateDetailDifferentiaQty";
    public static final String HTTP_OPERATE_TYPE_UPDATESTATUS = "UpdateStatus";
    public static final String METHOD_WSID_AUTHER = "d5dd9d99-5fd3-4973-a4ad-ee6d516ca537";
    public static final String METHOD_WSID_CARD = "4f4e0f23-9b81-4b82-885d-6b9e07ebec18";
    public static final String METHOD_WSID_CHECK_INIT = "71526d0a-7a6e-434d-b226-0a04feffe4ec";
    public static final String METHOD_WSID_CONFIG = "5da83d05-e941-4059-ad49-85ebf2d32de3";
    public static final String METHOD_WSID_CONVERSION = "B090547D-CF3A-4F71-8121-1E22C8B7D093";
    public static final String METHOD_WSID_CUSEMPCARDPOWER = "be98e646-5160-49ac-a986-05cd073393f7";
    public static final String METHOD_WSID_CUSTOMER = "5090a50f-fa68-4691-a0bb-af1b38676500";
    public static final String METHOD_WSID_CUSTOMEREMPLINK = "f42b379f-b3c9-4b09-96e1-4bd21c05ae7f";
    public static final String METHOD_WSID_INVENTORY = "7774bf40-e172-4daf-88cb-e7cecfdc86bd";
    public static final String METHOD_WSID_PASSWORD = "2f744c20-e5d9-4392-9ac2-1f4a6c7bdd00";
    public static final String METHOD_WSID_PRODUCT = "c81e6175-a15c-47b8-a3e2-a6c2fbf9d98b";
    public static final String METHOD_WSID_PRODUCTCARDPOWER = "610cc826-5da6-4d94-83e2-2b839f5a0299";
    public static final String METHOD_WSID_PRODUCTGROUP = "de22c9b4-1be2-4301-a3cc-36c66a7aa9da";
    public static final String METHOD_WSID_PRODUCTGROUPPOWER = "e8030392-15d7-467f-97ef-897a59dc039a";
    public static final String METHOD_WSID_PRODUCTMATERIAKPOWER = "f821ae2c-1f02-4e6c-a7c4-e11661b4da60";
    public static final String METHOD_WSID_PRODUCTPICTURE = "0cec0063-a032-4a37-aa45-889d554023d8";
    public static final String METHOD_WSID_REPLENISHMENT = "7f342da0-05be-4f3a-96c3-28072ec31e7a";
    public static final String METHOD_WSID_REPLENISHMENT_DIFF = "7f342da0-05be-4f3a-96c3-28072ec31e7a";
    public static final String METHOD_WSID_REPLENISHMENT_STATUS = "7f342da0-05be-4f3a-96c3-28072ec31e7a";
    public static final String METHOD_WSID_RETURNS_FORWARD = "ae0ffec0-8af0-468f-9e11-2ec7bd95cc3c";
    public static final String METHOD_WSID_STATION = "72be83fe-24ca-4bf5-9851-248c3391d67a";
    public static final String METHOD_WSID_STOCKTRANSACTION = "f5051735-42a1-4003-afbf-b18b3d87c8f0";
    public static final String METHOD_WSID_SUPPLIER = "66b91d60-808b-4109-9dc2-2b9f08349bee";
    public static final String METHOD_WSID_SYNDATA = "6e2164cc-45a9-46a4-85a4-b6e3377ebc33";
    public static final String METHOD_WSID_SYN_LOGVERSION = "c7aff256-e10b-4ee1-bd2e-f3670208aed1";
    public static final String METHOD_WSID_SYN_STOCK = "b7e4d092-5c3c-4f73-b793-caf197826340";
    public static final String METHOD_WSID_USEDRECORD = "c3d76872-6905-4231-821f-67f575cf0e07";
    public static final String METHOD_WSID_VENDING = "0f1e740c-c41a-484f-afe3-8e7f2eff99ee";
    public static final String METHOD_WSID_VENDINGCARDPOWER = "c2da7bde-f824-4066-bf93-fcdf94690ac0";
    public static final String METHOD_WSID_VENDINGCHN = "7698adeb-d59b-4eb5-ba20-d635f988fa7c";
    public static final String METHOD_WSID_VENDINGPICTURE = "c6c1dc3d-95f4-4e2f-80e8-6e3505d03895";
    public static final String METHOD_WSID_VENDINGPROLINK = "7395899e-a13b-4de9-8d6b-d48d09a39915";
    public static final String METHOD_WSID_VENDINGRUNERROR = "564000F1-D704-476B-8E1B-D0218668B712";
    public static final String METHOD_WSID_VENDING_STSATUS = "badc8989-320d-4122-8b40-1e5b4ec2541c";
    public static final String METHOD_WSID_VERSION = "e0a9f1eb-180b-4d3a-956b-e6df0b394a0f";
    public static final int MONTH = 1;
    public static final int REQUEST_TIMEOUT = 30000;
    public static final String RETURNCODE_SUCCESS = "0";
    public static String SERVER_URL = "";
    public static final String SERVICE_TEL = "4006809696";
    public static final String SHARED_CONFIG = "config";
    public static final String SHARED_CONFIG_DB_URL = "config_db";
    public static final String SHARED_CONFIG_URL = "config_url";
    public static final String SHARED_PWD = "pwd";
    public static final String SHARED_PWD_KEY = "pwd_key";
    public static final String SHARED_VEND_CODE = "vend_code";
    public static final String SHARED_VEND_CODE_KEY = "vend_code_key";
    public static final String SHARED_VEND_DEBUG_STATUS = "vend_debug_status";
    public static final int SO_TIMEOUT = 30000;
    public static final String[] SerialToolsPortName = new String[]{"/dev/ttyO2", "/dev/ttyO6", "/dev/ttyO7", "/dev/ttyO3"};
    public static final int TIME = 4;
    public static final long TIME_INTERNAL = 7000;
    public static final int VERSION_STOCK_SYNC = 250;
    public static final Map<String, String> WSIDNAMEMAP = new HashMap<String, String>() {
        private static final long serialVersionUID = 1;

        {
            put(Constant.METHOD_WSID_PASSWORD, "超级密码接口");
            put(Constant.METHOD_WSID_CHECK_INIT, "检查是否可以初始化");
            put(Constant.METHOD_WSID_SYNDATA, "数据同步时请求接口");
            put(Constant.METHOD_WSID_VERSION, "3.4版本信息接口");
            put(Constant.METHOD_WSID_AUTHER, "3.4认证准入接口");
            put(Constant.METHOD_WSID_CONFIG, "3.5接口配置接口");
            put(Constant.METHOD_WSID_VENDING, "3.6售货机接口");
            put(Constant.METHOD_WSID_VENDINGPICTURE, "3.7待机界面图片接口");
            put(Constant.METHOD_WSID_VENDINGCHN, "3.8售货机货道接口");
            put(Constant.METHOD_WSID_VENDINGPROLINK, "3.9售货机产品接口");
            put(Constant.METHOD_WSID_PRODUCT, "3.10产品接口");
            put(Constant.METHOD_WSID_PRODUCTPICTURE, "3.11产品图片接口");
            put(Constant.METHOD_WSID_SUPPLIER, "3.12货主接口");
            put(Constant.METHOD_WSID_STATION, "3.13站点接口");
            put(Constant.METHOD_WSID_VENDINGCARDPOWER, "3.14售货机卡/密码权限");
            put(Constant.METHOD_WSID_PRODUCTMATERIAKPOWER, "3.15产品领料权限接口");
            put(Constant.METHOD_WSID_CARD, "3.16卡/密码接口");
            put(Constant.METHOD_WSID_CUSEMPCARDPOWER, "3.17客户员工卡/密码权限接口");
            put(Constant.METHOD_WSID_CUSTOMEREMPLINK, "3.18客户员工接口");
            put(Constant.METHOD_WSID_CUSTOMER, "3.19客户接口");
            put(Constant.METHOD_WSID_PRODUCTGROUP, "3.20产品组合接口");
            put(Constant.METHOD_WSID_PRODUCTGROUPPOWER, "3.21产品组合权限接口");
            put("7f342da0-05be-4f3a-96c3-28072ec31e7a", "3.22补货单接口");
            put(Constant.METHOD_WSID_VENDING_STSATUS, "3.23售货机在线状态更新接口");
            put("7f342da0-05be-4f3a-96c3-28072ec31e7a", "3.24补货单状态更新接口");
            put("7f342da0-05be-4f3a-96c3-28072ec31e7a", "3.25补货单接口");
            put(Constant.METHOD_WSID_INVENTORY, "3.26盘点记录接口");
            put(Constant.METHOD_WSID_STOCKTRANSACTION, "3.27库存交易记录");
            put(Constant.METHOD_WSID_SYN_STOCK, "3.38同步库存");
            put(Constant.METHOD_WSID_SYN_LOGVERSION, "3.39APP接口调用返回");
            put(Constant.METHOD_WSID_RETURNS_FORWARD, "3.40退货单接口");
            put(Constant.METHOD_WSID_USEDRECORD, "卡产品领用接口");
            put(Constant.METHOD_WSID_PRODUCTCARDPOWER, "卡产品权限接口");
        }
    };
    public static final int YEAR = 0;

}
