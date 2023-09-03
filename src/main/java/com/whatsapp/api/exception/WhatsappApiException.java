package com.whatsapp.api.exception;

import com.whatsapp.api.domain.errors.WhatsappApiError;

/**
 * The type Whatsapp api exception.
 */
public class WhatsappApiException extends RuntimeException {
    /**
     * The type  WhatsappApiError
     */
    private WhatsappApiError whatsappApiError;

    /**
     * Instantiates a new Whatsapp api exception.
     */
    public WhatsappApiException() {
        super();
    }

    /**
     * Instantiates a new Whatsapp api exception.
     *
     * @param cause the cause
     */
    public WhatsappApiException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Whatsapp api exception.
     *
     * @param whatsappApiError the whatsapp api getError
     */
    public WhatsappApiException(WhatsappApiError whatsappApiError) {
        this.whatsappApiError = whatsappApiError;
    }

    @Override
    public String getMessage() {
        if (whatsappApiError != null && whatsappApiError.getError() != null) {
            if (whatsappApiError.getError().getErrorData() != null && whatsappApiError.getError().getErrorData().getDetails() != null)
                return String.format("[%s] %s | %s", whatsappApiError.getError().getCode(), whatsappApiError.getError().getMessage(), whatsappApiError.getError().getErrorData().getDetails());

            if (whatsappApiError.getError().getErrorUserMsg() != null)
                return String.format("[%s] %s | %s", whatsappApiError.getError().getCode(), whatsappApiError.getError().getMessage(), whatsappApiError.getError().getErrorUserMsg());

            return whatsappApiError.getError().getMessage();
        }

        return super.getMessage();
    }

}
