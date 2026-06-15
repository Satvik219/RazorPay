package org.satvik.razorpay_backend.merchant.dto.response;

import org.satvik.razorpay_backend.common.enums.BusinessType;
import org.satvik.razorpay_backend.common.enums.MerchantStatus;

import java.util.UUID;

public record MerchantResponse(
        UUID id,
        String name,
        String email,
        String businessName,
        BusinessType businessType,
        MerchantStatus merchantStatus
) {
}
