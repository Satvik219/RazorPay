package org.satvik.razorpay_backend.merchant.repository;

import org.satvik.razorpay_backend.merchant.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MerchantRepository extends JpaRepository<Merchant, UUID> {
    boolean existsByEmail(String email);
}
