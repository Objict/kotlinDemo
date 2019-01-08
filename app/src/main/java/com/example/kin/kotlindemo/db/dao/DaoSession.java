package com.example.kin.kotlindemo.db.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.kin.kotlindemo.db.entity.KUser;

import com.example.kin.kotlindemo.db.dao.KUserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig kUserDaoConfig;

    private final KUserDao kUserDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        kUserDaoConfig = daoConfigMap.get(KUserDao.class).clone();
        kUserDaoConfig.initIdentityScope(type);

        kUserDao = new KUserDao(kUserDaoConfig, this);

        registerDao(KUser.class, kUserDao);
    }
    
    public void clear() {
        kUserDaoConfig.clearIdentityScope();
    }

    public KUserDao getKUserDao() {
        return kUserDao;
    }

}
