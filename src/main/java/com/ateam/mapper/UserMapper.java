package com.ateam.mapper;

import com.ateam.model.Admin;

public interface UserMapper {
    // 관리자 ID로 관리자 정보 조회
    Admin getAdminById1(String id);

	Admin getAdminById(String username);
}
