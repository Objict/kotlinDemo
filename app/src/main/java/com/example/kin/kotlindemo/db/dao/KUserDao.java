package com.example.kin.kotlindemo.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.kin.kotlindemo.db.entity.KUser;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "KUSER".
*/
public class KUserDao extends AbstractDao<KUser, String> {

    public static final String TABLENAME = "KUSER";

    /**
     * Properties of entity KUser.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property Uname = new Property(1, String.class, "uname", false, "UNAME");
        public final static Property Uname_pinyin = new Property(2, String.class, "uname_pinyin", false, "UNAME_PINYIN");
        public final static Property Uaccount = new Property(3, String.class, "uaccount", false, "UACCOUNT");
        public final static Property Upwd = new Property(4, String.class, "upwd", false, "UPWD");
        public final static Property Role_id = new Property(5, String.class, "role_id", false, "ROLE_ID");
        public final static Property Tel = new Property(6, String.class, "tel", false, "TEL");
        public final static Property Audit_type = new Property(7, String.class, "audit_type", false, "AUDIT_TYPE");
        public final static Property Enabled = new Property(8, String.class, "enabled", false, "ENABLED");
        public final static Property Last_modify_time = new Property(9, String.class, "last_modify_time", false, "LAST_MODIFY_TIME");
        public final static Property Create_time = new Property(10, String.class, "create_time", false, "CREATE_TIME");
        public final static Property Remark = new Property(11, String.class, "remark", false, "REMARK");
        public final static Property Sign = new Property(12, String.class, "sign", false, "SIGN");
        public final static Property Headpic = new Property(13, String.class, "headpic", false, "HEADPIC");
        public final static Property Idcard = new Property(14, String.class, "idcard", false, "IDCARD");
        public final static Property U_character = new Property(15, String.class, "u_character", false, "U_CHARACTER");
        public final static Property Work_time = new Property(16, String.class, "work_time", false, "WORK_TIME");
        public final static Property Work_years = new Property(17, String.class, "work_years", false, "WORK_YEARS");
        public final static Property Sex = new Property(18, String.class, "sex", false, "SEX");
        public final static Property Company_id = new Property(19, String.class, "company_id", false, "COMPANY_ID");
        public final static Property Native_place = new Property(20, String.class, "native_place", false, "NATIVE_PLACE");
        public final static Property Graduate_school = new Property(21, String.class, "graduate_school", false, "GRADUATE_SCHOOL");
        public final static Property Education_level = new Property(22, String.class, "education_level", false, "EDUCATION_LEVEL");
    }


    public KUserDao(DaoConfig config) {
        super(config);
    }
    
    public KUserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"KUSER\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"UNAME\" TEXT," + // 1: uname
                "\"UNAME_PINYIN\" TEXT," + // 2: uname_pinyin
                "\"UACCOUNT\" TEXT," + // 3: uaccount
                "\"UPWD\" TEXT," + // 4: upwd
                "\"ROLE_ID\" TEXT," + // 5: role_id
                "\"TEL\" TEXT," + // 6: tel
                "\"AUDIT_TYPE\" TEXT," + // 7: audit_type
                "\"ENABLED\" TEXT," + // 8: enabled
                "\"LAST_MODIFY_TIME\" TEXT," + // 9: last_modify_time
                "\"CREATE_TIME\" TEXT," + // 10: create_time
                "\"REMARK\" TEXT," + // 11: remark
                "\"SIGN\" TEXT," + // 12: sign
                "\"HEADPIC\" TEXT," + // 13: headpic
                "\"IDCARD\" TEXT," + // 14: idcard
                "\"U_CHARACTER\" TEXT," + // 15: u_character
                "\"WORK_TIME\" TEXT," + // 16: work_time
                "\"WORK_YEARS\" TEXT," + // 17: work_years
                "\"SEX\" TEXT," + // 18: sex
                "\"COMPANY_ID\" TEXT," + // 19: company_id
                "\"NATIVE_PLACE\" TEXT," + // 20: native_place
                "\"GRADUATE_SCHOOL\" TEXT," + // 21: graduate_school
                "\"EDUCATION_LEVEL\" TEXT);"); // 22: education_level
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"KUSER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, KUser entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String uname = entity.getUname();
        if (uname != null) {
            stmt.bindString(2, uname);
        }
 
        String uname_pinyin = entity.getUname_pinyin();
        if (uname_pinyin != null) {
            stmt.bindString(3, uname_pinyin);
        }
 
        String uaccount = entity.getUaccount();
        if (uaccount != null) {
            stmt.bindString(4, uaccount);
        }
 
        String upwd = entity.getUpwd();
        if (upwd != null) {
            stmt.bindString(5, upwd);
        }
 
        String role_id = entity.getRole_id();
        if (role_id != null) {
            stmt.bindString(6, role_id);
        }
 
        String tel = entity.getTel();
        if (tel != null) {
            stmt.bindString(7, tel);
        }
 
        String audit_type = entity.getAudit_type();
        if (audit_type != null) {
            stmt.bindString(8, audit_type);
        }
 
        String enabled = entity.getEnabled();
        if (enabled != null) {
            stmt.bindString(9, enabled);
        }
 
        String last_modify_time = entity.getLast_modify_time();
        if (last_modify_time != null) {
            stmt.bindString(10, last_modify_time);
        }
 
        String create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindString(11, create_time);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(12, remark);
        }
 
        String sign = entity.getSign();
        if (sign != null) {
            stmt.bindString(13, sign);
        }
 
        String headpic = entity.getHeadpic();
        if (headpic != null) {
            stmt.bindString(14, headpic);
        }
 
        String idcard = entity.getIdcard();
        if (idcard != null) {
            stmt.bindString(15, idcard);
        }
 
        String u_character = entity.getU_character();
        if (u_character != null) {
            stmt.bindString(16, u_character);
        }
 
        String work_time = entity.getWork_time();
        if (work_time != null) {
            stmt.bindString(17, work_time);
        }
 
        String work_years = entity.getWork_years();
        if (work_years != null) {
            stmt.bindString(18, work_years);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(19, sex);
        }
 
        String company_id = entity.getCompany_id();
        if (company_id != null) {
            stmt.bindString(20, company_id);
        }
 
        String native_place = entity.getNative_place();
        if (native_place != null) {
            stmt.bindString(21, native_place);
        }
 
        String graduate_school = entity.getGraduate_school();
        if (graduate_school != null) {
            stmt.bindString(22, graduate_school);
        }
 
        String education_level = entity.getEducation_level();
        if (education_level != null) {
            stmt.bindString(23, education_level);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, KUser entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String uname = entity.getUname();
        if (uname != null) {
            stmt.bindString(2, uname);
        }
 
        String uname_pinyin = entity.getUname_pinyin();
        if (uname_pinyin != null) {
            stmt.bindString(3, uname_pinyin);
        }
 
        String uaccount = entity.getUaccount();
        if (uaccount != null) {
            stmt.bindString(4, uaccount);
        }
 
        String upwd = entity.getUpwd();
        if (upwd != null) {
            stmt.bindString(5, upwd);
        }
 
        String role_id = entity.getRole_id();
        if (role_id != null) {
            stmt.bindString(6, role_id);
        }
 
        String tel = entity.getTel();
        if (tel != null) {
            stmt.bindString(7, tel);
        }
 
        String audit_type = entity.getAudit_type();
        if (audit_type != null) {
            stmt.bindString(8, audit_type);
        }
 
        String enabled = entity.getEnabled();
        if (enabled != null) {
            stmt.bindString(9, enabled);
        }
 
        String last_modify_time = entity.getLast_modify_time();
        if (last_modify_time != null) {
            stmt.bindString(10, last_modify_time);
        }
 
        String create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindString(11, create_time);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(12, remark);
        }
 
        String sign = entity.getSign();
        if (sign != null) {
            stmt.bindString(13, sign);
        }
 
        String headpic = entity.getHeadpic();
        if (headpic != null) {
            stmt.bindString(14, headpic);
        }
 
        String idcard = entity.getIdcard();
        if (idcard != null) {
            stmt.bindString(15, idcard);
        }
 
        String u_character = entity.getU_character();
        if (u_character != null) {
            stmt.bindString(16, u_character);
        }
 
        String work_time = entity.getWork_time();
        if (work_time != null) {
            stmt.bindString(17, work_time);
        }
 
        String work_years = entity.getWork_years();
        if (work_years != null) {
            stmt.bindString(18, work_years);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(19, sex);
        }
 
        String company_id = entity.getCompany_id();
        if (company_id != null) {
            stmt.bindString(20, company_id);
        }
 
        String native_place = entity.getNative_place();
        if (native_place != null) {
            stmt.bindString(21, native_place);
        }
 
        String graduate_school = entity.getGraduate_school();
        if (graduate_school != null) {
            stmt.bindString(22, graduate_school);
        }
 
        String education_level = entity.getEducation_level();
        if (education_level != null) {
            stmt.bindString(23, education_level);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public KUser readEntity(Cursor cursor, int offset) {
        KUser entity = new KUser( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uname
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // uname_pinyin
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // uaccount
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // upwd
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // role_id
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // tel
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // audit_type
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // enabled
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // last_modify_time
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // create_time
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // remark
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // sign
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // headpic
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // idcard
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // u_character
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // work_time
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // work_years
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // sex
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // company_id
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // native_place
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // graduate_school
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22) // education_level
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, KUser entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setUname(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUname_pinyin(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUaccount(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUpwd(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRole_id(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTel(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAudit_type(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setEnabled(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setLast_modify_time(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setCreate_time(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setRemark(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setSign(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setHeadpic(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setIdcard(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setU_character(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setWork_time(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setWork_years(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setSex(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setCompany_id(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setNative_place(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setGraduate_school(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setEducation_level(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
     }
    
    @Override
    protected final String updateKeyAfterInsert(KUser entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(KUser entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(KUser entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
