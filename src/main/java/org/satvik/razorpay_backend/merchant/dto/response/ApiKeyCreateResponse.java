package org.satvik.razorpay_backend.merchant.dto.response;

import org.satvik.razorpay_backend.common.enums.Environment;

import java.util.UUID;

public record ApiKeyCreateResponse(
        UUID id,
        String keyId,
        String keySecret,
        Environment environment
) {
}
