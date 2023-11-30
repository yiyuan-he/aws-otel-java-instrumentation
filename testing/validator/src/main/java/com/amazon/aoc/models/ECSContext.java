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

package com.amazon.aoc.models;

import lombok.Data;

@Data
public class ECSContext {
  // ecs related context
  private String ecsClusterName;
  private String ecsClusterArn;
  private String ecsTaskDefArn;
  private String ecsTaskDefFamily;
  private String ecsTaskDefVersion;
  private String ecsLaunchType;
}