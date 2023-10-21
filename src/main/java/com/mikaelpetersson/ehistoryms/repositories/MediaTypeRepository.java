package com.mikaelpetersson.ehistoryms.repositories;

import com.mikaelpetersson.ehistoryms.models.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaTypeRepository extends JpaRepository<MediaType, Integer> {

    MediaType findMediaTypeByType(String type);
}
