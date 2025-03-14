package org.nmh.tobyspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@HelloBootTest
public class DataSourceTest {
    @Autowired
    DataSource datasource;

    @Test
    void connect() throws SQLException {
        Connection connection = datasource.getConnection();
        connection.close();
    }
}
