package io.playn.template.java;

import playn.java.LWJGLPlatform;

import io.playn.template.core.TemplateGame;

public class TemplateGameJava {

  public static void main (String[] args) {
    LWJGLPlatform.Config config = new LWJGLPlatform.Config();
    // use config to customize the Java platform, if needed
    LWJGLPlatform plat = new LWJGLPlatform(config);
    new TemplateGame(plat);
    plat.start();
  }
}
