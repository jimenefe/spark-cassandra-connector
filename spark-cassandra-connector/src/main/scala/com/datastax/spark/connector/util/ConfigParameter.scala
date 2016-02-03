package com.datastax.spark.connector.util

case class ConfigParameter[T](
  val name: String,
  val section: String,
  val default: T,
  val description: String) extends DataFrameOption {

  override val optionName = name.replaceAll("\\.", "\\_")
}
