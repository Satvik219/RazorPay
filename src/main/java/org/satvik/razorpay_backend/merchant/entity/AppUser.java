package org.satvik.razorpay_backend.merchant.entity;

import jakarta.persistence.*;
import org.satvik.razorpay_backend.common.enums.UserRole;

import java.util.UUID;

//1 merchant can have multiple employees/user who are accessing the system on behalf of the merchant
@Entity
@Table(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;
}
