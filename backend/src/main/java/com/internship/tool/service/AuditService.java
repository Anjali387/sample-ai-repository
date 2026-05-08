package com.internship.tool.service;

import com.internship.tool.dto.AuditDTO;
import com.internship.tool.entity.Audit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuditService {

    // LOGGER
    private static final Logger logger =
            LoggerFactory.getLogger(AuditService.class);

    // TEMPORARY IN-MEMORY STORAGE
    private final List<Audit> audits = new ArrayList<>();

    // CREATE AUDIT
    public Audit createAudit(AuditDTO auditDTO) {

        logger.info("Creating new audit");

        Audit audit = new Audit();

        audit.setName(auditDTO.getName());
        audit.setDescription(auditDTO.getDescription());
        audit.setStatus(auditDTO.getStatus());

        // TIMESTAMPS HANDLED AUTOMATICALLY

        audits.add(audit);

        logger.info("Audit created successfully");

        return audit;
    }

    // GET ALL AUDITS
    public List<Audit> getAllAudits() {

        logger.info("Fetching all audits");

        return audits;
    }

    // GET AUDIT BY ID
    public Audit getAuditById(Long id) {

        logger.info("Fetching audit by id: " + id);

        if (audits.isEmpty()) {

            logger.warn("Audit list is empty");

            return null;
        }

        return audits.get(0);
    }

    // UPDATE AUDIT
    public Audit updateAudit(Long id, AuditDTO auditDTO) {

        logger.info("Updating audit with id: " + id);

        Audit audit = getAuditById(id);

        if (audit != null) {

            audit.setName(auditDTO.getName());
            audit.setDescription(auditDTO.getDescription());
            audit.setStatus(auditDTO.getStatus());

            logger.info("Audit updated successfully");
        }

        return audit;
    }

    // DELETE AUDIT
    public void deleteAudit(Long id) {

        logger.info("Deleting audit with id: " + id);

        if (!audits.isEmpty()) {

            audits.remove(0);

            logger.info("Audit deleted successfully");
        }
    }

    // SEARCH AUDITS BY STATUS
    public List<Audit> searchAuditsByStatus(String status) {

        logger.info("Searching audits with status: " + status);

        List<Audit> filteredAudits = new ArrayList<>();

        for (Audit audit : audits) {

            if (audit.getStatus() != null &&
                    audit.getStatus().equalsIgnoreCase(status)) {

                filteredAudits.add(audit);
            }
        }

        return filteredAudits;
    }
}