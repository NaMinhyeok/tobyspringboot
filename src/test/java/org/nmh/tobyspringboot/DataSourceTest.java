package org.nmh.tobyspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@JdbcTest
public class DataSourceTest {
    @Autowired
    DataSource datasource;

    @Test
    void connect() throws SQLException {
        Connection connection = datasource.getConnection();
        connection.close();
    }
}
