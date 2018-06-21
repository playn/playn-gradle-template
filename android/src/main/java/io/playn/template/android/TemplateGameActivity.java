package io.playn.template.android;

import playn.android.GameActivity;

import io.playn.template.core.TemplateGame;

public class TemplateGameActivity extends GameActivity {

  @Override public void main () {
    new TemplateGame(platform());
  }
}
