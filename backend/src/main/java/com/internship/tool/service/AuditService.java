package com.internship.tool.service;

import com.internship.tool.dto.AuditDTO;
import com.internship.tool.entity.Audit;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuditService {

    private final List<Audit> audits = new ArrayList<>();

    // CREATE AUDIT
    public Audit createAudit(AuditDTO auditDTO) {

        Audit audit = new Audit();

        audit.setName(auditDTO.getName());
        audit.setDescription(auditDTO.getDescription());
        audit.setStatus(auditDTO.getStatus());

        audit.setCreatedAt(LocalDateTime.now());
        audit.setUpdatedAt(LocalDateTime.now());

        audits.add(audit);

        return audit;
    }

    // GET ALL AUDITS
    public List<Audit> getAllAudits() {

        return audits;
    }

    // GET AUDIT BY ID
    public Audit getAuditById(Long id) {

        if (audits.isEmpty()) {
            return null;
        }

        return audits.get(0);
    }

    // UPDATE AUDIT
    public Audit updateAudit(Long id, AuditDTO auditDTO) {

        Audit audit = getAuditById(id);

        if (audit != null) {

            audit.setName(auditDTO.getName());
            audit.setDescription(auditDTO.getDescription());
            audit.setStatus(auditDTO.getStatus());

            audit.setUpdatedAt(LocalDateTime.now());
        }

        return audit;
    }

    // DELETE AUDIT
    public void deleteAudit(Long id) {

        if (!audits.isEmpty()) {
            audits.remove(0);
        }
    }
}