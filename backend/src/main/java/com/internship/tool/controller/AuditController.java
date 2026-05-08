package com.internship.tool.controller;

import com.internship.tool.dto.AuditDTO;
import com.internship.tool.entity.Audit;
import com.internship.tool.response.ApiResponse;
import com.internship.tool.service.AuditService;
import jakarta.validation.Valid;
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
    public ApiResponse<Audit> createAudit(
            @Valid @RequestBody AuditDTO auditDTO) {

        Audit audit = auditService.createAudit(auditDTO);

        return new ApiResponse<>(
                "Audit created successfully",
                audit
        );
    }

    // GET ALL AUDITS
    @GetMapping
    public ApiResponse<List<Audit>> getAllAudits() {

        return new ApiResponse<>(
                "Audits fetched successfully",
                auditService.getAllAudits()
        );
    }

    // GET AUDIT BY ID
    @GetMapping("/{id}")
    public ApiResponse<Audit> getAuditById(
            @PathVariable Long id) {

        return new ApiResponse<>(
                "Audit fetched successfully",
                auditService.getAuditById(id)
        );
    }

    // UPDATE AUDIT
    @PutMapping("/{id}")
    public ApiResponse<Audit> updateAudit(
            @PathVariable Long id,
            @Valid @RequestBody AuditDTO auditDTO) {

        return new ApiResponse<>(
                "Audit updated successfully",
                auditService.updateAudit(id, auditDTO)
        );
    }

    // DELETE AUDIT
    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteAudit(
            @PathVariable Long id) {

        auditService.deleteAudit(id);

        return new ApiResponse<>(
                "Audit deleted successfully",
                null
        );
    }
}