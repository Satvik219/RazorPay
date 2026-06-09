package org.satvik.razorpay_backend.common.enums;

public enum PaymentEvent {
    AUTHORIZE_ATTEMPT,
    AUTHORIZE_SUCCESS,
    AUTHORIZE_FAILURE,
    CAPTURE_REQUEST,
    CAPTURE_SUCCESS,
    CAPTURE_FAILURE,
    REFUND_INIT,
    REFUND_COMPLETE,
    REFUND_FAILURE,
    SETTLE,
    CANCEL,
    CAPTURE_TIMEOUT
}
