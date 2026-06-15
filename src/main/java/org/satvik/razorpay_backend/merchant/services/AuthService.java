package org.satvik.razorpay_backend.merchant.services;

import org.satvik.razorpay_backend.merchant.dto.request.MerchantSignupRequest;
import org.satvik.razorpay_backend.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);
}
