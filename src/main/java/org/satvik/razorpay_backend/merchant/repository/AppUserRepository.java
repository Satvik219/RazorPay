package org.satvik.razorpay_backend.merchant.repository;

import org.satvik.razorpay_backend.merchant.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {
}
