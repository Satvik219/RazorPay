package org.satvik.razorpay_backend.common.enums;

public enum PaymentStatus {
    CREATED,
    AUTHORIZING,
    AUTHORIZED,
    CAPTURING,
    CAPTURED,
    CANCELLED,
    REFUNDED,
    PARTIALLY_REFUNDED,
    REFUND_FAILED,
    SETTLED,
    AUTH_EXPIRED,
    FAILED
}
