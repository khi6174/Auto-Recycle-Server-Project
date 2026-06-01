package com.capstone.recycle.controller;

import com.capstone.recycle.DTO.response.AdminProfileResponse;
import com.capstone.recycle.Repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
@RequiredArgsConstructor
public class AdminController {

    private final AdminRepository adminRepository;

    // 층별 관리자 목록 (총괄 관리자 전용 페이지에서 사용)
    @GetMapping("/floor-managers")
    public ResponseEntity<List<AdminProfileResponse>> floorManagers() {
        List<AdminProfileResponse> list = adminRepository
                .findByRoleAndIsActiveTrue("ADMIN")
                .stream()
                .map(AdminProfileResponse::new)
                .toList();
        return ResponseEntity.ok(list);
    }
}
