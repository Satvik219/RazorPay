package org.satvik.razorpay_backend.merchant.services;

import org.satvik.razorpay_backend.merchant.dto.request.CreateApiKeyRequest;
import org.satvik.razorpay_backend.merchant.dto.response.ApiKeyCreateResponse;

import java.util.UUID;

public interface ApiKeyService {

    ApiKeyCreateResponse create(UUID merchantId, CreateApiKeyRequest request);
}
