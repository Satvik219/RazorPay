package org.satvik.razorpay_backend.merchant.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.satvik.razorpay_backend.merchant.dto.request.CreateApiKeyRequest;
import org.satvik.razorpay_backend.merchant.dto.response.ApiKeyCreateResponse;
import org.satvik.razorpay_backend.merchant.services.ApiKeyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/merchants/{merchantId}/api-keys")
@RequiredArgsConstructor
public class ApiKeyController {

    private final ApiKeyService apiKeyService;

    @PostMapping
    public ResponseEntity<ApiKeyCreateResponse> create(@PathVariable UUID merchantId,
                                                       @Valid @RequestBody CreateApiKeyRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(apiKeyService.create(merchantId, request));
    }

}
