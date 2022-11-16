package org.blackdread.sqltojava.test.db.mssql;

import org.blackdread.sqltojava.shared.tests.SqlToJdlTransactionPerTestTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.utility.DockerImageName;

@Disabled("Implementation incomplete")
class MssqlSql2019Test extends SqlToJdlTransactionPerTestTest {

    @Container
    private static final MSSQLServerContainer MSSQL_CONTAINER = new MSSQLServerContainer(
        DockerImageName.parse("mcr.microsoft.com/mssql/server").withTag("2019-latest")
    )
        .acceptLicense();

    @BeforeAll
    public static void setup() {
        System.setProperty("expected.profile", "sqlserver");
        setupContainer(MSSQL_CONTAINER);
    }
}