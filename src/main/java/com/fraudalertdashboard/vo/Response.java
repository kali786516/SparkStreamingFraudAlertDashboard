package com.fraudalertdashboard.vo;

import com.fraudalertdashboard.dao.entity.FraudAlertData;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kalit_000 on 6/3/19.
 */
public class Response implements Serializable {
    private List<FraudAlertData> fraudAlert;

    public List<FraudAlertData> getFraudAlert() {
        return fraudAlert;
    }
    public void setFraudAlert(List<FraudAlertData> fraudAlert) {
        this.fraudAlert = fraudAlert;
    }

}
