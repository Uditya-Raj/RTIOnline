
package nic.rti.master.dao;

import nic.rti.master.dto.PendingRequestResponseDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FAAPendingRequestRepository {

    // UNDER_PROCESS records
    List<PendingRequestResponseDTO> fetchUnderProcess(Integer applId, Integer limit, Integer offset);
    long countUnderProcess(Integer applId);

    // COMMENT_CPIO records
    List<PendingRequestResponseDTO> fetchCommentCPIO(Integer applId, Integer limit, Integer offset);
    long countCommentCPIO(Integer applId);

    // MODIFY records
    List<PendingRequestResponseDTO> fetchModify(Integer applId, Integer limit, Integer offset);
    long countModify(Integer applId);

    // NEW records
    List<PendingRequestResponseDTO> fetchNew(Integer applId, Integer limit, Integer offset);
    long countNew(Integer applId);


     List<PendingRequestResponseDTO> fetchPending20Days(Integer applId, Integer limit, Integer offset);
     long countPending20Days(Integer applId);
}
