package io.workshop.c4s4;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface CronWorkflow {
    @WorkflowMethod
    String runit();
}
