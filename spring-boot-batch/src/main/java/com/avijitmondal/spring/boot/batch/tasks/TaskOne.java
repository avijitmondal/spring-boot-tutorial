package com.avijitmondal.spring.boot.batch.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskOne implements Tasklet {

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("TaskOne start..");

		Thread.sleep(1000);

		System.out.println("TaskOne done..");
		return RepeatStatus.FINISHED;
	}
}
