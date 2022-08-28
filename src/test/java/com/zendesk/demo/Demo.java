package com.zendesk.demo;

import com.zendesk.maxwell.Maxwell;
import com.zendesk.maxwell.MaxwellConfig;

import java.net.URISyntaxException;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {

        try {
            MaxwellConfig maxwellConfig = new MaxwellConfig();
            maxwellConfig.maxwellMysql.password="root";
            maxwellConfig.maxwellMysql.user="root";

            Maxwell maxwell = new Maxwell(maxwellConfig);
			maxwell.run();

		} catch (Exception e) {
            throw new RuntimeException(e);
        }
	}
}
