package com.internship.tool.service;

import com.internship.tool.entity.Audit;
import com.internship.tool.exception.CustomException;
import com.internship.tool.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuditService {

    @Autowired
    private AuditRepository auditRepository;

    // CREATE AUDIT
    public Audit createAudit(Audit audit) {

        // Validation
        if (audit.getName() == null || audit.getName().isEmpty()) {
            throw new CustomException("Audit name cannot be empty");
        }

        audit.setCreatedAt(LocalDateTime.now());
        audit.setUpdatedAt(LocalDateTime.now());

        return auditRepository.save(audit);
    }

    // GET ALL AUDITS
    public List<Audit> getAllAudits() {
        return auditRepository.findAll();
    }

    // GET AUDIT BY ID
    public Audit getAuditById(Long id) {

        return auditRepository.findById(id)
                .orElseThrow(() -> new CustomException("Audit not found"));
    }

    // DELETE AUDIT
    public void deleteAudit(Long id) {

        Audit audit = getAuditById(id);

        auditRepository.delete(audit);
    }
}