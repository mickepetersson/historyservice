package com.mikaelpetersson.ehistoryms.repositories;

import com.mikaelpetersson.ehistoryms.models.MediaHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaHistoryRepository extends JpaRepository<MediaHistory, Integer> {

    List<MediaHistory> findMediaHistoriesByUser_Id(@Param("userId") int userId);
}
