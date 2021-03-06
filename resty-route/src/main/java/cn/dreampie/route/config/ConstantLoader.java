package cn.dreampie.route.config;

import cn.dreampie.common.Constant;
import cn.dreampie.common.Render;
import cn.dreampie.orm.cache.CacheManager;
import cn.dreampie.route.render.RenderFactory;

/**
 * The constant for Restj runtime.
 */
final public class ConstantLoader {

  public void setDevMode(boolean devMode) {
    Constant.dev_mode = devMode;
  }

  //encoding
  public void setDefaultEncoding(String defaultEncoding) {
    Constant.encoding = defaultEncoding;
  }

  //render
  public void addRender(String extension, Render render) {
    RenderFactory.add(extension, render);
  }

  public void addRender(String extension, Render render, boolean isDefault) {
    RenderFactory.add(extension, render, isDefault);
  }


  //cache
  public void setCacheManager(CacheManager cacheManager) {
    Constant.cacheManager = cacheManager;
  }

  public void setCacheManager(CacheManager cacheManager, boolean cacheEnable) {
    Constant.cacheManager = cacheManager;
    Constant.cache_enabled = cacheEnable;
  }

  public void setCacheEnable(boolean cacheEnable) {
    Constant.cache_enabled = cacheEnable;
  }

  //upload
  public void setUploadDirectory(String uploadDirectory, int uploadMaxSize) {
    Constant.uploadDirectory = uploadDirectory;
    Constant.uploadMaxSize = uploadMaxSize;
  }

  public void setUploadDirectory(String uploadDirectory) {
    Constant.uploadDirectory = uploadDirectory;
  }

  public void setUploadMaxSize(int uploadMaxSize) {
    Constant.uploadMaxSize = uploadMaxSize;
  }

  public void setUploadDenieds(String... uploadDenieds) {
    Constant.uploadDenieds = uploadDenieds;
  }

}







