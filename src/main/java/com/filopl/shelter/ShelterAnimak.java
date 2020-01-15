package com.filopl.shelter;

import com.filopl.shelter.sql.PostrgreSQLconnect;

public class ShelterAnimak {
    public ShelterAnimak() {
    }

    public void startUP() {
        PostrgreSQLconnect postrgreSQLconnect = new PostrgreSQLconnect();
        postrgreSQLconnect.saveDataToDataBase();
    }
}
