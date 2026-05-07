package com.internship.tool.controller;

import com.internship.tool.dto.AuditDTO;
import com.internship.tool.entity.Audit;
import com.internship.tool.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audits")
public class AuditController {

    @Autowired
    private AuditService auditService;

    // CREATE AUDIT
    @PostMapping
    public Audit createAudit(@RequestBody AuditDTO auditDTO) {

        return auditService.createAudit(auditDTO);
    }

    // GET ALL AUDITS
    @GetMapping
    public List<Audit> getAllAudits() {

        return auditService.getAllAudits();
    }

    // GET AUDIT BY ID
    @GetMapping("/{id}")
    public Audit getAuditById(@PathVariable Long id) {

        return auditService.getAuditById(id);
    }

    // UPDATE AUDIT
    @PutMapping("/{id}")
    public Audit updateAudit(@PathVariable Long id,
                             @RequestBody AuditDTO auditDTO) {

        return auditService.updateAudit(id, auditDTO);
    }

    // DELETE AUDIT
    @DeleteMapping("/{id}")
    public String deleteAudit(@PathVariable Long id) {

        auditService.deleteAudit(id);

        return "Audit deleted successfully";
    }
}