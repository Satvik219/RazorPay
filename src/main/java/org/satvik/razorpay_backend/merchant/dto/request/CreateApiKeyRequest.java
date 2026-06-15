package org.satvik.razorpay_backend.merchant.dto.request;

import org.satvik.razorpay_backend.common.enums.Environment;

public record CreateApiKeyRequest(
        Environment environment
) {
}
