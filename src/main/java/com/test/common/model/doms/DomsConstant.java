package com.test.common.model.doms;


import java.time.LocalDate;

/**
 * The type Doms constant.
 */
public final class DomsConstant {

    /**
     * 날짜 format
     */
    public static final String DATE_FORMAT_1 = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    public static final String DATE_FORMAT_2 = "yyyyMM";
    public static final String DATE_FORMAT_3 = "yyyyMMdd";

    public static final LocalDate UNLIMITED_EXPIRY_DATE = LocalDate.of(2099, 12, 31);
    /**
     * 포탈 관련
     */
    public static final String PORTAL_URL = "https://portal.daou.co.kr";
    public static final String PORTAL_TEST_URL = "http://portal-test.terracetech.co.kr";

    /**
     * 견적서 웍스 등록 관련
     */
    public static final String ESTIMATE_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    public static final Integer WORKS_DAOUOFFICE_PRODUCT_ID = 47493;
    public static final Integer WORKS_DAOUOFFICE_CAMPAIGN_ID = 1436560;
    public static final String POSITIVE_RESPONSE = "0";
    public static final String NEGATIVE_RESPONSE = "1";
    public static final String WORKS_GROUPWARE_PRODUCT_VALUE_NONE = "3";
    public static final String WORKS_GROUPWARE_PRODUCT_VALUE_SAAS = "2";
    public static final String WORKS_GROUPWARE_PRODUCT_VALUE_VPC = "6";
    public static final String WORKS_GROUPWARE_PRODUCT_VALUE_ON_PREMISE = "5";
    public static final String WORKS_GROUPWARE_SASS = "공유형";
    public static final String WORKS_GROUPWARE_VPC = "단독형";
    public static final String WORKS_GROUPWARE_ON_PREMISE = "설치형";
    public static final String WORKS_TYPE = "자동";
    public static final String WORKS_DEL_TAG = "정상";
    public static final String WORKS_SALES_TYPE = "직판";
    public static final String WORKS_CHANNEL = "그룹웨어";
    public static final String WORKS_LEAD_STATE = "미진행";
    public static final String WORKS_SALES_STATE = "미진행";
    public static final String WORKS_AGREE = "동의함";
    public static final String WORKS_DIS_AGREE = "동의안함";
    public static final String WORKS_COMPAINID = "견적요청건";

    /**
     * 계정 권한 관련
     */
    public static final String DEFAULT_CODE = "defaultCode";

    /**
     * 결제 관련
     */
    public static final String ORDER_NO_PREFIX = "DAOU_SAAS_";
    public static final String PAYMENT_NO_PREFIX = "DAOU_SAAS_PAYMENT_";
    public static final String PAY_SUCCESS_CODE = "0000";

    /**
     * 기타
     */
    public static final String PREFIX_OF_DELETED_DOMAIN = "del.";
    public static final String VIRTUAL_DOMAIN_SPLIT_DELIMITER = ",";
    public static final String REMOVED_VIRTUAL_DOMAIN_REPLACE_STR = "제거된 가상도메인";

    public static final String ON = "ON";
    public static final String OFF = "OFF";

    public static final boolean TRUE = true;
    public static final boolean FALSE = false;

    public static final String HYPHEN = "-";
    public static final String UNDERSCORE = "_";

    public static final String SYSTEM = "시스템";

    public static final String LINK_PLUS_CODE = "LINK_PLUS";
    public static final String LINK_PLUS_NAME = "링크플러스";

    public static final String ESS_CODE = "ESS";
    public static final String ESS_NAME = "경영지원";

    public static final String STRING_DELIMITER = "::";

    /**
     * DO 연동
     */
    public static final String STR_ON = "on";
    public static final String STR_OFF = "off";

    public static final int NUMBER_OF_MAX_RESULT = 100;

    /**
     * 파트너사
     */
    public static final String DEFAULT_PARTNER_CODE = "daouoffice";
    public static final Long DEFAULT_PARTNER_ID = 1L;

    /**
     * secure
     * todo eon : key 확인 필요
     */
    public static final String AES = "AES";
    public static final String DEFAULT_AES_DECRYPTION_KEY = "terrace-maenoops";
    public static final int RANDOM_DOMAIN_MINIMUM_LENGTH = 10;
    public static final String TEMP_DOMAIN_PREFIX = "temp.";
    public static final String TMSE_RANDOM_DOMAIN_POSTFIX = ".co.co";

    public static final String SPECIAL_CHARS = "!@#$%^&*";
    public static final String ONE_TO_NINE = "123456789";

    /**
     * 통계
     */
    public static final String STAT_TOTAL_COUNT_KEY = "totalCount";
    public static final String STAT_AVG_COUNT_KEY = "avgCount";
    public static final String STAT_SUM_KEY = "statSum";
    public static final String STAT_USER_TYPE_KEY = "statUserType";
    public static final String STAT_YEAR_MONTH_KEY = "yearMonth";
    public static final String STAT_YEAR_MONTH_FORMAT = "%s%02d";

    public static final int RECENT_YEAR_5 = 5;
    public static final int RECENT_YEAR_10 = 10;

    public static final String QUARTER_1 = "Q1";    // 1분기
    public static final String QUARTER_2 = "Q2";    // 2분기
    public static final String QUARTER_3 = "Q3";    // 3분기
    public static final String QUARTER_4 = "Q4";    // 4분기

    public static final String HALF_1 = "H1";    // 상반기
    public static final String HALF_2 = "H2";    // 하반기
    public static final String TOTAL_YEAR = "TOTAL_YEAR";    // 연간

    /**
     * 견적서
     */
    public static final String MONTH = "개월";
    public static final String UNIT_OF_PEOPLE = "명";
    public static final String UNIT_OF_MONEY = "원";
    public static final String UNIT_OF_RATE = "%";
    public static final String UNIT_OF_COUNT = "개";
    public static final String BASE = "기본";
    public static final String ADD_ON = "부가";
    public static final String OPTION = "옵션";
    public static final String HIPPEN = "-";
    public static final String EMPTY = "";
    public static final String ONCE = "1회";
    public static final String SPACE = " ";
    public static final String MEMBERSHIP_FEE = "설치비";
    public static final String DEFAULT_FEE = "기본료";
    public static final String SERVICE = "서비스";
    public static final String ESTIMATE_PDF_FILE_NAME = "_견적서.pdf";
}
