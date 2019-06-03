package com.fraudalertdashboard.dao;

import com.fraudalertdashboard.dao.entity.FraudAlertData;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by kalit_000 on 6/3/19.
 */
@Repository
public interface FraudAlertDataRepository extends CassandraRepository<FraudAlertData> {

    @Query("SELECT cc_num, trans_time, is_fraud, trans_num, category, merchant, amt, merch_lat, merch_long, distance, age FROM creditcard.fraud_transaction WHERE trans_time > ?0 ALLOW FILTERING" )
    Iterable<FraudAlertData> findFraudDataByTimestamp(Long timestamp);

}
