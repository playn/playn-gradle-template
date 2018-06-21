package io.playn.template.html;

import com.google.gwt.core.client.EntryPoint;
import playn.html.HtmlPlatform;
import io.playn.template.core.TemplateGame;

public class TemplateGameHtml implements EntryPoint {

  @Override public void onModuleLoad () {
    HtmlPlatform.Config config = new HtmlPlatform.Config();
    // use config to customize the HTML platform, if needed
    HtmlPlatform plat = new HtmlPlatform(config);
    plat.assets().setPathPrefix("playnGradleTemplate/");
    new TemplateGame(plat);
    plat.start();
  }
}
