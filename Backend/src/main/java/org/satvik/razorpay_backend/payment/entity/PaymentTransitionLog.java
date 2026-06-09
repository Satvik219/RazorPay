package org.satvik.razorpay_backend.payment.entity;

import jakarta.persistence.*;
import org.satvik.razorpay_backend.common.enums.PaymentActor;
import org.satvik.razorpay_backend.common.enums.PaymentEvent;
import org.satvik.razorpay_backend.common.enums.PaymentStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "payment_transition_log")
public class PaymentTransitionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "payment_id",nullable = false)
    private Payment payment;

    @Column(name = "from_status",length = 30)
    @Enumerated(EnumType.STRING)
    private PaymentStatus fromStatus;

    @Enumerated(EnumType.STRING)
    @Column(length = 30,nullable = false)
    private PaymentEvent events;

    @Column(name = "to_status",length = 30,nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentStatus toStatus;

    @Column(length = 100)
    @Enumerated(EnumType.STRING)
    private PaymentActor actor;

    @Column(name = "occurred_at",nullable = false)
    private LocalDateTime occurredAt;

}
