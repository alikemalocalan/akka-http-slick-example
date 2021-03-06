package com.github.alikemalocalan

import com.typesafe.config.ConfigFactory

trait Config {
  private val config         = ConfigFactory.load
  private val hostConfig    = config.getConfig("http")

  val address: String        = hostConfig.getString("interface")
  val port: Int              = hostConfig.getInt("port")

  val masterCount: Int = hostConfig.getInt("masterCount")
  val workerCount: Int = hostConfig.getInt("masterCount")
}
