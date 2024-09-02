package com.aws.s3.eventbridge.ecs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Builder
@AllArgsConstructor
public class S3Bucket {

    String bucketName;
    String fileName;
    String timeStamp;

}
