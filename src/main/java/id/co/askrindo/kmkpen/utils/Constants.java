package id.co.askrindo.kmkpen.utils;

import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;

import java.math.BigDecimal;

public class Constants {
    private Constants(){}
    //~ Static fields/initializers =============================================
    /**
     * The name of the ResourceBundle used in this application
     */
    public static final String BUNDLE_KEY = "ApplicationResources";

    /**
     * File separator from System properties
     */
    public static final String FILE_SEP = System.getProperty("file.separator");

    /**
     * User home from System properties
     */
    public static final String USER_HOME = System.getProperty("user.home") + FILE_SEP;

    /**
     * Local Language
     */
    public static final String LANGUAGE = "in";

    /**
     * Local Country
     */
    public static final String COUNTRY = "ID";

    public static final String USER_DEFAULT = "X999";
    public static final String ID_AKTIFITAS_TGR = "21";

    static public class Parameters {
        final static public BigDecimal MAX_OMSET = new BigDecimal("50000000000");
        final static public BigDecimal MAX_MODAL_USAHA = new BigDecimal("10000000000");
        final static public BigDecimal LIMIT_CAC = new BigDecimal("1000000000");
        final static public BigDecimal MIN_PLAFON = new BigDecimal("100000");
        final static public BigDecimal MAX_PLAFON = new BigDecimal("10000000000");
        final static public BigDecimal COVERAGE = new BigDecimal("70");
        final static public String START_PEN_DATE = "20220401";
        final static public String END_PEN_DATE = "20221130";
        final static public Integer MAX_JK_WAKTU = 36;
        final static public Integer MIN_JK_WAKTU = 36;
        final static public String JNS_DEBITUR = "R";
        final static public Integer STATUS_NOTA_PENAWARAN = 6;
        final static public Integer STATUS_TERBIT = 3;
        final static public Integer STATUS_TEMPORARY = 11;
        final static public Integer STATUS_DRAFT = 6;
        final static public String CREATED_BY = "H2H API DIRECT NEW";
        final static public String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
        final static public String DATE_FORMAT_DD_MM_YYYY = "dd-MM-yyyy";
        final static public String CURRENCY = "IDR";

    }

    static public class ParameterKey {
        final static public String EJAMKU_API = "ejamku_api";
    }

    static public class StatusEjamku {
        final static public Integer DRAFT = 0;
        final static public Integer CALON = 1;
        final static public Integer AKAD = 2;
        final static public Integer TAGIHAN = 3;
    }

    static public class ParameterAPIEjamku {
        final static public String AKAD_POST = "akad_post";
        final static public String AKAD_PUT = "akad_put";
        final static public String AKAD_GET = "akad_get";
        final static public String CALON_POST = "calon_post";
        final static public String CALON_GET_NIK = "calon_get_nik";
        final static public String CALON_PUT = "calon_put";
        final static public String CALON_DELETE = "calon_delete";
        final static public String DEBITUR_GET = "debitur_get";
        final static public String AUTH = "auth";
        final static public String TAGIHAN_POST = "tagihan_post";
        final static public String TAGIHAN_GET = "tagihan_get";
    }

    public static TPenjaminan tPenjaminanCache;

    public static void settPenjaminanCache(TPenjaminan tPenjaminanCache) {
        Constants.tPenjaminanCache = tPenjaminanCache;
    }

    public static TPenjaminan gettPenjaminanCache() {
        return tPenjaminanCache;
    }
}
