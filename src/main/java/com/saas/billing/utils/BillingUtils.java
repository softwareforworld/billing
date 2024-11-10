package com.saas.billing.utils;

import java.util.UUID;

public class BillingUtils {
    public static String generateTraceID() {
        return UUID.randomUUID().toString();
    }
}
