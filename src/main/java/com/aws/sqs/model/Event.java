package com.aws.sqs.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.amazonaws.services.sqs.model.MessageAttributeValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Event")
public class Event {

    @DynamoDBHashKey (attributeName = "messageId")
    @DynamoDBAutoGeneratedKey
    private String messageId;

    @DynamoDBAttribute
    private String receiptHandler;

    @DynamoDBAttribute
    private String body;

    @DynamoDBAttribute
    private Map<String, String> attributes;

    @DynamoDBAttribute
    private Map<String, MessageAttributeValue> messageAttributes;

    @DynamoDBAttribute
    private String md50OfMessageAttributes;

    @DynamoDBAttribute
    private String md50OfBody;
}