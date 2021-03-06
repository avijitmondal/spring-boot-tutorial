package com.avijitmondal.spring.boot.batch.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskTwo implements Tasklet {

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("TaskTwo start..");

		Thread.sleep(1000);

		System.out.println("TaskTwo done..");
		return RepeatStatus.FINISHED;
	}
}