package com.acledabank.customerservice.dto;

import lombok.Builder;

@Builder
public record CustomerResponse(
        String customerId,
        String firstName,
        String lastName,
        String kyc
) {
}
