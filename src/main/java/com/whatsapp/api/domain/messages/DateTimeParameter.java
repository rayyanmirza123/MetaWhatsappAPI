package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.errors.Error;
import com.whatsapp.api.domain.messages.type.ParameterType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Date time parameter.
 */

@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateTimeParameter extends Parameter {

    @JsonProperty("date_time")
    private DateTime dateTime;


    /**
     * Instantiates a new Date time parameter.
     */
    public DateTimeParameter() {
        super(ParameterType.DATE_TIME);
    }


    /**
     * Instantiates a new Date time parameter.
     *
     * @param dateTime the date time
     */
    public DateTimeParameter(DateTime dateTime) {
        super(ParameterType.DATE_TIME);

        this.dateTime = dateTime;
    }

    /**
     * Gets date time.
     *
     * @return the date time
     */
    public DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets date time.
     *
     * @param dateTime the date time
     * @return the date time
     */
    public DateTimeParameter setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }
}
