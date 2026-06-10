package org.satvik.razorpay_backend.operations;

import jakarta.persistence.*;
import org.satvik.razorpay_backend.common.entity.Money;
import org.satvik.razorpay_backend.common.enums.SettlementStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "settlement")
public class Settlement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "merchant_id",nullable = false)
    private UUID merchantId;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name ="amountUnits",column = @Column(name = "gross_amount_units",nullable = false)),
            @AttributeOverride(name ="currency", column= @Column(name= "gross_amount_currency",nullable = false))
    })
    private Money grossAmount;

    @AttributeOverrides({
            @AttributeOverride(name ="amountUnits",column = @Column(name = "refund_amount_units",nullable = false)),
            @AttributeOverride(name ="currency", column= @Column(name= "refund_amount_currency",nullable = false))
    })
    @Embedded
    private Money refundAmount;

    @AttributeOverrides({
            @AttributeOverride(name ="amountUnits",column = @Column(name = "gst_amount_units",nullable = false)),
            @AttributeOverride(name ="currency", column= @Column(name= "gst_amount_currency",nullable = false))
    })
    @Embedded
    private Money gstAmount;

    @AttributeOverrides({
            @AttributeOverride(name ="amountUnits",column = @Column(name = "fee_amount_units",nullable = false)),
            @AttributeOverride(name ="currency", column= @Column(name= "fee_amount_currency",nullable = false))
    })
    @Embedded
    private Money feeAmount;

    @AttributeOverrides({
            @AttributeOverride(name ="amountUnits",column = @Column(name = "net_amount_units",nullable = false)),
            @AttributeOverride(name ="currency", column= @Column(name= "net_amount_currency",nullable = false))
    })
    @Embedded
    private Money netAmount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SettlementStatus status;

    @Column(length = 50,nullable = false)
    private String bankReference;

    private LocalDateTime processedAt;
}
