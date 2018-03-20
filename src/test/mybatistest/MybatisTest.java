package mybatistest;

import com.dingbs.shiromybatis.entity.department.DepartmentEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2018\3\20 0020.
 */
public class MybatisTest {
    private static SqlSessionFactory sqlSessionFactory;
    @BeforeClass
    public static void init(){
        //加载mybatis的核心配置文件
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //解析mybatis.cfg.xml文档，并且初始化MyBatis（连接池、缓存）
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testGetDepartmentUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        DepartmentEntity departmentEntity = sqlSession.selectOne("com.dingbs.shiromybatis.entity.department.DepartmentMapper.selectById", 1);
        System.out.println(departmentEntity.getUserList());
    }

}
