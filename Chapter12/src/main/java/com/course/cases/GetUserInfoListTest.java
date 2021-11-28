package com.course.cases;

import com.course.config.TestConfig;
import com.course.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoListTest {

    @Test(dependsOnGroups = "loginTrue",description = "获取性别为男的用户信息")
    public void getUserInfoList() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        GetUserInfoListTest getUserInfoListCase = session.selectOne("getUserInfoListcCase",1);
        System.out.println(getUserInfoListCase.toString());
        System.out.println(TestConfig.getUserListUrl);

    }
}
