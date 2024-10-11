/*
 * Copyright Amazon.com, Inc. or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.opentelemetry.appsignals.test.awssdk.v2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testcontainers.junit.jupiter.Testcontainers;
import software.amazon.opentelemetry.appsignals.test.awssdk.base.AwsSdkBaseTest;

@Testcontainers(disabledWithoutDocker = true)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AwsSdkV2Test extends AwsSdkBaseTest {

  @Override
  protected String getApplicationImageName() {
    return "aws-appsignals-tests-aws-sdk-v2";
  }

  protected String getApplicationOtelServiceName() {
    return "aws-sdk-v2";
  }

  @Override
  protected String getS3SpanNamePrefix() {
    return "S3";
  }

  @Override
  protected String getDynamoDbSpanNamePrefix() {
    return "DynamoDb";
  }

  @Override
  protected String getSqsSpanNamePrefix() {
    return "Sqs";
  }

  @Override
  protected String getKinesisSpanNamePrefix() {
    return "Kinesis";
  }

  protected String getBedrockSpanNamePrefix() {
    return "Bedrock";
  }

  @Override
  protected String getBedrockAgentSpanNamePrefix() {
    return "BedrockAgent";
  }

  @Override
  protected String getBedrockRuntimeSpanNamePrefix() {
    return "BedrockRuntime";
  }

  @Override
  protected String getBedrockAgentRuntimeSpanNamePrefix() {
    return "BedrockAgentRuntime";
  }

  @Override
  protected String getS3RpcServiceName() {
    return "S3";
  }

  @Override
  protected String getDynamoDbRpcServiceName() {
    return "DynamoDb";
  }

  @Override
  protected String getSqsRpcServiceName() {
    return "Sqs";
  }

  protected String getKinesisRpcServiceName() {
    return "Kinesis";
  }

  @Override
  protected String getBedrockRpcServiceName() {
    return "Bedrock";
  }

  @Override
  protected String getBedrockAgentRpcServiceName() {
    return "BedrockAgent";
  }

  @Override
  protected String getBedrockRuntimeRpcServiceName() {
    return "BedrockRuntime";
  }

  @Override
  protected String getBedrockAgentRuntimeRpcServiceName() {
    return "BedrockAgentRuntime";
  }

  // @Test
  // void testS3CreateBucket() throws Exception {
  //  doTestS3CreateBucket();
  // }
  //
  // @Test
  // void testS3CreateObject() throws Exception {
  //  doTestS3CreateObject();
  // }
  //
  // @Test
  // void testS3GetObject() throws Exception {
  //  doTestS3GetObject();
  // }
  //
  // @Test
  // void testS3Error() {
  //  doTestS3Error();
  // }
  //
  // @Test
  // void testS3Fault() {
  //  doTestS3Fault();
  // }
  //
  // @Test
  // void testDynamoDbCreateTable() {
  //  doTestDynamoDbCreateTable();
  // }
  //
  // @Test
  // void testDynamoDbPutItem() {
  //  doTestDynamoDbPutItem();
  // }
  //
  // @Test
  // void testDynamoDbError() throws Exception {
  //  doTestDynamoDbError();
  // }
  //
  // @Test
  // void testDynamoDbFault() throws Exception {
  //  doTestDynamoDbFault();
  // }
  //
  // @Test
  // void testSQSCreateQueue() throws Exception {
  //  doTestSQSCreateQueue();
  // }
  //
  // @Test
  // void testSQSSendMessage() throws Exception {
  //  doTestSQSSendMessage();
  // }
  //
  // @Override
  // protected List<ThrowingConsumer<KeyValue>> testSQSReceiveMessageExtraAssertions(String
  // queueUrl) {
  //  return List.of();
  // }
  //
  // @Test
  // void testSQSReceiveMessage() throws Exception {
  //  doTestSQSReceiveMessage();
  // }
  //
  // @Test
  // void testSQSError() throws Exception {
  //  doTestSQSError();
  // }
  //
  // @Test
  // void testSQSFault() throws Exception {
  //  doTestSQSFault();
  // }
  //
  // @Test
  // void testKinesisPutRecord() throws Exception {
  //  doTestKinesisPutRecord();
  // }
  //
  // @Test
  // void testKinesisError() throws Exception {
  //  doTestKinesisError();
  // }
  //
  // @Test
  // void testKinesisFault() throws Exception {
  //  doTestKinesisFault();
  // }

  @Test
  void testBedrockAgentGetKnowlesgeBaseId() {
    doTestBedrockAgentKnowledgeBaseId();
  }

  @Test
  void testBedrockAgentAgentId() {
    doTestBedrockAgentAgentId();
  }

  @Test
  void testBedrockAgentDataSourceId() {
    doTestBedrockAgentDataSourceId();
  }

  @Test
  void testBedrockRuntimeModelId() {
    doTestBedrockRuntimeModelId();
  }

  @Test
  void testBedrockGuardrailId() {
    doTestBedrockGuardrailId();
  }

  @Test
  void testBedrockAgentRuntimeAgentId() {
    doTestBedrockAgentRuntimeAgentId();
  }

  // TODO: Enable testBedrockAgentRuntimeKnowledgeBaseId test after KnowledgeBaseId is supported in
  // OTEL BedrockAgentRuntime instrumentation
  //  @Test
  //  void testBedrockAgentRuntimeKnowledgeBaseId() {
  //    doTestBedrockAgentRuntimeKnowledgeBaseId();
  //  }
}
