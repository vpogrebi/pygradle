package com.linkedin.gradle.python.spec.binary;

import com.linkedin.gradle.python.spec.component.internal.PythonEnvironment;
import com.linkedin.gradle.python.tasks.PublishingTask;
import java.io.File;
import org.gradle.api.Task;
import org.gradle.platform.base.BinarySpec;


public interface PythonBinarySpec extends BinarySpec {

  void setPythonEnvironment(PythonEnvironment pythonEnvironment);

  PythonEnvironment getPythonEnvironment();

  String getArtifactType();

  void targets(String target);

  String getTarget();
}
