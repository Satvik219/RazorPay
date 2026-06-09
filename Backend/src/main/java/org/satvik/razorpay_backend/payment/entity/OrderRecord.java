package org.satvik.razorpay_backend.payment.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.satvik.razorpay_backend.common.entity.Money;
import org.satvik.razorpay_backend.common.enums.OrderStatus;


import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "order_record")
public class OrderRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name= "merchant_id",nullable = false)
    private UUID merchantId;

    @Embedded
    private Money amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status",nullable = false,length=20)
    private OrderStatus orderStatus;

    @Column(nullable = false)
    private Integer attempts;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "notes",columnDefinition = "jsonb")
    private Map<String,Object> notes;

    @Column(name = "expired_at",nullable = false)
    private LocalDateTime expiresAt;
}
