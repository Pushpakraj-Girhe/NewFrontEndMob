package com.traffictracking.controller;

import com.traffictracking.model.Campaign;
import com.traffictracking.service.CampaignManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {

    @Autowired
    private CampaignManagementService campaignManagementService;

    @GetMapping
    public ResponseEntity<List<Campaign>> getAllCampaigns() {
        List<Campaign> campaigns = campaignManagementService.getAllCampaigns();
        return ResponseEntity.ok(campaigns);
    }

    @PostMapping
    public ResponseEntity<Campaign> createCampaign(@RequestBody Campaign campaign) {
        Campaign createdCampaign = campaignManagementService.createCampaign(campaign);
        return ResponseEntity.ok(createdCampaign);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Campaign> updateCampaign(@PathVariable Long id, @RequestBody Campaign campaignDetails) {
        Campaign updatedCampaign = campaignManagementService.updateCampaign(id, campaignDetails);
        return ResponseEntity.ok(updatedCampaign);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCampaign(@PathVariable Long id) {
        campaignManagementService.deleteCampaign(id);
        return ResponseEntity.noContent().build();
    }
}

